import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;

public final class ci {
   private static short[] aaa;
   private static short[] aba;
   private static int[] aca;
   private static Random ada;

   public static void aaa() {
      aaa = new short[]{0, 18, 36, 54, 71, 89, 107, 125, 143, 160, 178, 195, 213, 230, 248, 265, 282, 299, 316, 333, 350, 367, 384, 400, 416, 433, 449, 465, 481, 496, 512, 527, 543, 558, 573, 587, 602, 616, 630, 644, 658, 672, 685, 698, 711, 724, 737, 749, 761, 773, 784, 796, 807, 818, 828, 839, 849, 859, 868, 878, 887, 896, 904, 912, 920, 928, 935, 943, 949, 956, 962, 968, 974, 979, 984, 989, 994, 998, 1002, 1005, 1008, 1011, 1014, 1016, 1018, 1020, 1022, 1023, 1023, 1024, 1024};
      ada = new Random();
   }

   static {
      aa.aaa(18);
      aaa();
   }

   public static void aba() {
      aba = new short[91];
      aca = new int[91];

      for(int var0 = 0; var0 <= 90; ++var0) {
         aba[var0] = aaa[90 - var0];
         if (aba[var0] == 0) {
            aca[var0] = Integer.MAX_VALUE;
         } else {
            aca[var0] = (aaa[var0] << 10) / aba[var0];
         }
      }

   }

   public static final int aaa(int var0) {
      if ((var0 = aca(var0)) >= 0 && var0 < 90) {
         return aaa[var0];
      } else if (var0 >= 90 && var0 < 180) {
         return aaa[180 - var0];
      } else {
         return var0 >= 180 && var0 < 270 ? -aaa[var0 - 180] : -aaa[360 - var0];
      }
   }

   public static final int aba(int var0) {
      if ((var0 = aca(var0)) >= 0 && var0 < 90) {
         return aba[var0];
      } else if (var0 >= 90 && var0 < 180) {
         return -aba[180 - var0];
      } else {
         return var0 >= 180 && var0 < 270 ? -aba[var0 - 180] : aba[360 - var0];
      }
   }

   public static final int aaa(int var0, int var1) {
      if (var0 == 0) {
         return var1 > 0 ? 90 : 270;
      } else {
         int var2 = Math.abs((var1 << 10) / var0);
         int var3 = 0;

         while(true) {
            if (var3 > 90) {
               var2 = 0;
               break;
            }

            if (aca[var3] >= var2) {
               var2 = var3;
               break;
            }

            ++var3;
         }

         if (var1 >= 0 && var0 < 0) {
            var2 = 180 - var2;
         }

         if (var1 < 0 && var0 < 0) {
            var2 += 180;
         }

         return var1 < 0 && var0 >= 0 ? 360 - var2 : var2;
      }
   }

   public static final int aca(int var0) {
      if (var0 >= 360) {
         var0 -= 360;
      }

      if (var0 < 0) {
         var0 += 360;
      }

      return var0;
   }

   public static int aba(int var0, int var1) {
      return var0 + ada.nextInt(var1 - var0);
   }

   public static int aaa(int var0, int var1, int var2, int var3) {
      if ((var0 = (var0 - var2) * (var0 - var2) + (var1 - var3) * (var1 - var3)) <= 0) {
         return 0;
      } else {
         var1 = (var0 + 1) / 2;

         do {
            var2 = var1;
            var1 = var1 / 2 + var0 / (var1 << 1);
         } while(Math.abs(var2 - var1) > 1);

         return var1;
      }
   }

   public static int ada(int var0) {
      return ada.nextInt(var0);
   }

   public static int aea(int var0) {
      return var0 > 0 ? var0 : -var0;
   }

   public static void aaa(as var0) {
      var0.aaa(-var0.aba(), -var0.aca());
      var0.ada(0, 0, ab.aza, ab.baa);
   }

   public static String[] aaa(String var0, String var1, int var2) {
      int var3;
      String[] var4;
      if ((var3 = var0.indexOf(var1)) >= 0) {
         var4 = aaa(var0.substring(var3 + var1.length()), var1, var2 + 1);
      } else {
         var4 = new String[var2 + 1];
         var3 = var0.length();
      }

      var4[var2] = var0.substring(0, var3);
      return var4;
   }

   public static String aaa(long var0, int var2) {
      String var3 = "";
      long var4;
      if ((var4 = (var0 + (long)var2 - System.currentTimeMillis()) / 1000L) <= 0L) {
         return "";
      } else {
         long var6 = 0L;
         long var8 = 0L;
         long var10 = var4 / 60L;
         long var12 = var4;
         if (var4 >= 86400L) {
            var6 = var4 / 86400L;
            var8 = var4 % 86400L / 3600L;
         } else if (var4 >= 3600L) {
            var8 = var4 / 3600L;
            var10 = var4 % 3600L / 60L;
         } else if (var4 >= 60L) {
            var12 = var4 % 60L;
         } else {
            var12 = var4;
         }

         String var14;
         if (var6 > 0L) {
            if (var6 >= 10L) {
               var14 = var8 < 1L ? var6 + "d" : (var8 < 10L ? var6 + "d0" + var8 + "h" : var6 + "d" + var8 + "h");
            } else {
               if (var6 >= 10L) {
                  return var3;
               }

               var14 = var8 < 1L ? var6 + "d" : (var8 < 10L ? var6 + "d0" + var8 + "h" : var6 + "d" + var8 + "h");
            }
         } else if (var8 > 0L) {
            if (var8 >= 10L) {
               var14 = var10 < 1L ? var8 + "h" : (var10 < 10L ? var8 + "h0" + var10 + "m" : var8 + "h" + var10 + "m");
            } else {
               if (var8 >= 10L) {
                  return var3;
               }

               var14 = var10 < 1L ? var8 + "h" : (var10 < 10L ? var8 + "h0" + var10 + "m" : var8 + "h" + var10 + "m");
            }
         } else {
            String var10000;
            if (var10 > 0L) {
               if (var10 >= 10L) {
                  if (var12 >= 10L) {
                     var10000 = var10 + "m" + var12 + "s";
                  } else {
                     if (var12 >= 10L) {
                        return var3;
                     }

                     var10000 = var10 + "m0" + var12 + "s";
                  }
               } else {
                  if (var10 >= 10L) {
                     return var3;
                  }

                  if (var12 >= 10L) {
                     var10000 = var10 + "m" + var12 + "s";
                  } else {
                     if (var12 >= 10L) {
                        return var3;
                     }

                     var10000 = var10 + "m0" + var12 + "s";
                  }
               }
            } else {
               var10000 = var12 < 10L ? "0" + var12 + "s" : var12 + "s";
            }

            var14 = var10000;
         }

         return var14;
      }
   }

   public static DataInputStream aaa(String var0) {
      DataInputStream var1 = null;
      InputStream var2;
      if ((var2 = "".getClass().getResourceAsStream(var0)) != null) {
         var1 = new DataInputStream(var2);
      }

      return var1;
   }

   public static boolean aaa(int var0, int var1, int var2, int var3, int var4, int var5) {
      return var0 >= var2 && var0 < var2 + var4 && var1 >= var3 && var1 < var3 + var5;
   }

   public static int afa(int var0) {
      if (var0 <= 0) {
         return 0;
      } else {
         int var1 = (var0 + 1) / 2;

         while(true) {
            int var2 = var1 / 2 + var0 / (var1 << 1);
            if (Math.abs(var1 - var2) <= 1) {
               return var2;
            }

            var1 = var2;
         }
      }
   }

   public static Calendar aca() {
      return Calendar.getInstance(TimeZone.getTimeZone("GMT+7"));
   }

   public static void ada() {
      aaa = null;
      aba = null;
      aca = null;
      ada = null;
   }
}
