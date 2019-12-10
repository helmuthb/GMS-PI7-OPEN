package gms.shared.mechanisms.configuration.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.net.URL;
import org.apache.commons.configuration2.CompositeConfiguration;
import org.apache.commons.configuration2.EnvironmentConfiguration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.SystemConfiguration;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ClientConfigurationLoaderTests {

  @Rule
  public final ExpectedException exception = ExpectedException.none();

  private URL propertiesUrl;

  @Before
  public void setUp() {
    final String propertyFile = "gms/shared/mechanisms/configuration/util/application.properties";
    propertiesUrl = Thread.currentThread().getContextClassLoader().getResource(propertyFile);
    assertNotNull("Test could not load properties file " + propertyFile, propertiesUrl);
  }

  @Test
  public void testLoadConfiguration() {
    CompositeConfiguration configuration = ClientConfigurationLoader.load(propertiesUrl);

    assertNotNull(configuration);
    assertTrue(configuration.getNumberOfConfigurations() >= 3);
    assertTrue(configuration.getConfiguration(0) instanceof EnvironmentConfiguration);
    assertTrue(configuration.getConfiguration(1) instanceof SystemConfiguration);
    assertTrue(configuration.getConfiguration(2) instanceof FileBasedConfiguration);

    assertEquals(1000, configuration.getInt("prop_int"));
    assertEquals("a string property", configuration.getString("prop_string"));
  }

  @Test
  public void testLoadNullFileExpectNullPointerException() {
    exception.expect(NullPointerException.class);
    exception.expectMessage("ClientConfigurationLoader requires non-null propertiesFileUrl");
    ClientConfigurationLoader.load(null);
  }
}
