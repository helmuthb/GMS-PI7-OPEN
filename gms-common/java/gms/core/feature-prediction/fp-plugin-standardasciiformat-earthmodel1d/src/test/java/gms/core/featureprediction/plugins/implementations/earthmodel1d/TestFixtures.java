package gms.core.featureprediction.plugins.implementations.earthmodel1d;

class TestFixtures {

  // ak135 for phase: Lg
  static final double[] ak135LgReferenceDepthKm = new double[]{
      0.00, 5.00, 10.00, 15.00, 20.00, 25.00, 34.90
  };
  static final double[] ak135LgReferenceAngleDegrees = new double[]{
      0.00, 0.50, 1.00, 1.50, 2.00, 2.50, 3.00, 3.50, 4.00, 4.50, 5.00, 5.50, 6.00,
      6.50, 7.00, 7.50, 8.00, 8.50, 9.00, 9.50, 10.00, 10.50, 11.00, 11.50, 12.00, 12.50, 13.00,
      13.50, 14.00, 14.50, 15.00, 15.50, 16.00, 16.50, 17.00, 17.50, 18.00, 18.50, 19.00, 19.50,
      20.00, 20.50, 21.00, 21.50, 22.00, 22.50, 23.00, 23.50, 24.00, 24.50, 25.00, 25.50, 26.00,
      26.50, 27.00, 27.50, 28.00, 28.50, 29.00, 29.50, 30.00
  };
  static final double[][] ak135LgReferenceTravelTime = new double[][]{
      {
          0.0000, 15.8850, 31.7700, 47.6550, 63.5400, 79.4250, 95.3100, 111.1950, 127.0800,
          142.9650, 158.8500, 174.7350, 190.6200, 206.5050, 222.3900, 238.2750, 254.1600,
          270.0450, 285.9300, 301.8150, 317.7000, 333.5850, 349.4700, 365.3550, 381.2400,
          397.1250, 413.0100, 428.8950, 444.7800, 460.6650, 476.5500, 492.4350, 508.3200,
          524.2050, 540.0900, 555.9750, 571.8600, 587.7450, 603.6300, 619.5150, 635.4000,
          651.2850, 667.1700, 683.0550, 698.9400, 714.8250, 730.7100, 746.5950, 762.4800,
          778.3651, 794.2500, 810.1349, 826.0200, 841.9050, 857.7900, 873.6750, 889.5600,
          905.4449, 921.3300, 937.2150, 953.1000
      },
      {
          1.4286, 15.9491, 31.8021, 47.6764, 63.5561, 79.4379, 95.3207, 111.2042, 127.0880,
          142.9721, 158.8564, 174.7408, 190.6254, 206.5099, 222.3946, 238.2793, 254.1640,
          270.0488, 285.9336, 301.8184, 317.7032, 333.5881, 349.4729, 365.3578, 381.2427,
          397.1276, 413.0125, 428.8974, 444.7823, 460.6672, 476.5522, 492.4371, 508.3220,
          524.2070, 540.0919, 555.9768, 571.8618, 587.7467, 603.6317, 619.5166, 635.4016,
          651.2866, 667.1715, 683.0565, 698.9415, 714.8265, 730.7114, 746.5964, 762.4813,
          778.3663, 794.2513, 810.1362, 826.0213, 841.9062, 857.7911, 873.6761, 889.5611,
          905.4461, 921.3311, 937.2161, 953.1011
      },
      {
          2.8571, 16.1399, 31.8982, 47.7406, 63.6042, 79.4764, 95.3528, 111.2317, 127.1121,
          142.9935, 158.8757, 174.7583, 190.6414, 206.5248, 222.4083, 238.2921, 254.1761,
          270.0601, 285.9443, 301.8286, 317.7129, 333.5972, 349.4817, 365.3662, 381.2507,
          397.1353, 413.0199, 428.9045, 444.7892, 460.6739, 476.5586, 492.4433, 508.3280,
          524.2128, 540.0975, 555.9823, 571.8671, 587.7520, 603.6368, 619.5215, 635.4064,
          651.2913, 667.1761, 683.0610, 698.9459, 714.8307, 730.7156, 746.6005, 762.4854,
          778.3702, 794.2552, 810.1400, 826.0250, 841.9098, 857.7947, 873.6797, 889.5646,
          905.4495, 921.3344, 937.2193, 953.1043
      },
      {
          4.2857, 16.4530, 32.0578, 47.8473, 63.6844, 79.5405, 95.4063, 111.2776, 127.1522,
          143.0292, 158.9078, 174.7876, 190.6682, 206.5495, 222.4313, 238.3136, 254.1961,
          270.0790, 285.9621, 301.8454, 317.7289, 333.6125, 349.4963, 365.3802, 381.2641,
          397.1481, 413.0322, 428.9164, 444.8006, 460.6850, 476.5693, 492.4536, 508.3381,
          524.2225, 540.1070, 555.9915, 571.8760, 587.7606, 603.6452, 619.5298, 635.4144,
          651.2991, 667.1837, 683.0684, 698.9531, 714.8378, 730.7226, 746.6074, 762.4921,
          778.3768, 794.2616, 810.1464, 826.0311, 841.9159, 857.8007, 873.6855, 889.5703,
          905.4551, 921.3400, 937.2247, 953.1097
      },
      {
          5.7143, 16.8815, 32.2798, 47.9964, 63.7964, 79.6303, 95.4811, 111.3417, 127.2084,
          143.0791, 158.9527, 174.8284, 190.7056, 206.5841, 222.4634, 238.3435, 254.2242,
          270.1054, 285.9871, 301.8691, 317.7514, 333.6339, 349.5167, 365.3997, 381.2828,
          397.1661, 413.0495, 428.9330, 444.8167, 460.7004, 476.5843, 492.4682, 508.3521,
          524.2361, 540.1202, 556.0043, 571.8885, 587.7728, 603.6571, 619.5414, 635.4257,
          651.3101, 667.1945, 683.0789, 698.9634, 714.8478, 730.7324, 746.6169, 762.5014,
          778.3860, 794.2706, 810.1552, 826.0397, 841.9244, 857.8090, 873.6937, 889.5783,
          905.4630, 921.3477, 937.2324, 953.1172
      },
      {
          7.1429, 17.4170, 32.5631, 48.1873, 63.9402, 79.7455, 95.5773, 111.4242, 127.2806,
          143.1433, 159.0105, 174.8809, 190.7538, 206.6285, 222.5047, 238.3820, 254.2604,
          270.1394, 286.0192, 301.8995, 317.7803, 333.6614, 349.5430, 365.4248, 381.3069,
          397.1892, 413.0718, 428.9544, 444.8373, 460.7204, 476.6035, 492.4868, 508.3702,
          524.2537, 540.1372, 556.0209, 571.9046, 587.7884, 603.6723, 619.5562, 635.4401,
          651.3242, 667.2082, 683.0923, 698.9765, 714.8607, 730.7449, 746.6292, 762.5135,
          778.3978, 794.2821, 810.1665, 826.0509, 841.9352, 857.8197, 873.7042, 889.5887,
          905.4731, 921.3577, 937.2422, 953.1268
      },
      {
          9.9714, 18.7553, 33.2981, 48.6870, 64.3177, 80.0485, 95.8302, 111.6412, 127.4706,
          143.3123, 159.1626, 175.0193, 190.8806, 206.7456, 222.6134, 238.4836, 254.3555,
          270.2290, 286.1038, 301.9797, 317.8564, 333.7340, 349.6122, 365.4911, 381.3704,
          397.2502, 413.1304, 429.0109, 444.8918, 460.7729, 476.6543, 492.5359, 508.4178,
          524.2999, 540.1820, 556.0644, 571.9469, 587.8296, 603.7123, 619.5952, 635.4782,
          651.3613, 667.2445, 683.1277, 699.0112, 714.8945, 730.7780, 746.6616, 762.5452,
          778.4289, 794.3126, 810.1964, 826.0802, 841.9640, 857.8480, 873.7319, 889.6158,
          905.4999, 921.3840, 937.2680, 953.1522
      }
  };

  static final double[] ak135LgModelingErrorDistances = new double[]{
      0.0, 0.2, 0.5, 1.0, 2.0, 3.0, 4.0, 6.0, 8.0, 10.0, 15.0, 20.0, 30.0
  };

  static final double[][] ak135LgModelingErrorValues = new double[][]{
      {
          0.2, 0.5, 1.3, 1.7, 2.4, 3.0, 3.6, 4.2, 4.9, 5.5, 6.5, 7.5, 9.5
      }
  };
}
