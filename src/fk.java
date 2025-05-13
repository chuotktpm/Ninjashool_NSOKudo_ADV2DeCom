public final class fk {
   public static int aaa;
   public static int aba;
   public static int aca;
   public static int ada;
   public static int aea;
   public static int afa;

   public static void aaa() {
      aaa = 6562304;
      aba = 9581056;
      aca = 3937280;
      ada = 15224576;
      aea = 16777215;
      afa = 24;
   }

   static {
      aa.aaa(54);
      aaa();
   }

   public static void aaa(as var0, ca var1, ca var2, ca var3) {
      fw var4 = GameCanvas.afa ? fw.afa : fw.aqa;
      int var5 = GameCanvas.afa ? 3 : 1;
      if (!GameCanvas.afa) {
         if (var1 != null) {
            var4.aaa(var0, var1.aaa, 5, GameCanvas.baa - fb.aqa + 4 + var5, 0);
         }

         if (var2 != null) {
            var4.aaa(var0, var2.aaa, GameCanvas.bba, GameCanvas.baa - fb.aqa + 4 + var5, 2);
         }

         if (var3 != null) {
            if (var3.aea != null) {
               var0.aaa(var3.aea, GameCanvas.aza - 5, GameCanvas.baa - 11, 10);
               return;
            }

            var4.aaa(var0, var3.aaa, GameCanvas.aza - 5, GameCanvas.baa - fb.aqa + 4 + var5, 1);
            return;
         }
      } else {
         if (var1 != null && var4.aaa(var1.aaa) > 0) {
            if (var1.afa > 0 && var1.aga > 0) {
               var1.aaa(var0);
            } else {
               if (fb.ara == 0) {
                  var0.aaa(GameScr.eza, 1, GameCanvas.baa - fb.aqa + 1, 0);
               } else {
                  var0.aaa(GameScr.eya, 1, GameCanvas.baa - fb.aqa + 1, 0);
               }

               var4.aaa(var0, var1.aaa, 35, GameCanvas.baa - fb.aqa + 4 + var5, 2);
            }
         }

         if (var2 != null && var4.aaa(var2.aaa) > 0) {
            if (var2.afa > 0 && var2.aga > 0) {
               var2.aaa(var0);
            } else {
               if (fb.ara == 1) {
                  var0.aaa(GameScr.eza, GameCanvas.bba - 35, GameCanvas.baa - fb.aqa + 1, 0);
               } else {
                  var0.aaa(GameScr.eya, GameCanvas.bba - 35, GameCanvas.baa - fb.aqa + 1, 0);
               }

               var4.aaa(var0, var2.aaa, GameCanvas.bba, GameCanvas.baa - fb.aqa + 4 + var5, 2);
            }
         }

         if (var3 != null && var4.aaa(var3.aaa) > 0) {
            if (var3.afa > 0 && var3.aga > 0) {
               var3.aaa(var0);
               return;
            }

            if (fb.ara == 2) {
               var0.aaa(GameScr.eza, GameCanvas.aza - 71, GameCanvas.baa - fb.aqa + 1, 0);
            } else {
               var0.aaa(GameScr.eya, GameCanvas.aza - 71, GameCanvas.baa - fb.aqa + 1, 0);
            }

            var4.aaa(var0, var3.aaa, GameCanvas.aza - 35, GameCanvas.baa - fb.aqa + 4 + var5, 2);
         }
      }

   }

   public static void aaa(as var0) {
      if (!GameCanvas.afa) {
         var0.aaa(0);
         var0.aca(0, GameCanvas.baa - afa, GameCanvas.aza, afa + 1);
         var0.aaa(8947848);
         var0.aca(0, GameCanvas.baa - (afa - 1), GameCanvas.aza, 1);
      }

   }

   public static void aaa(as var0, boolean var1, int var2, int var3, int var4, int var5, int var6, int var7, String var8) {
      var0.aaa(0);
      int var9;
      if (var1) {
         var0.aaa(GameScr.ewa, 0, 81, 29, 27, 0, var2, var3, 0);
         var0.aaa(GameScr.ewa, 0, 135, 29, 27, 0, var2 + var4 - 29, var3, 0);
         var0.aaa(GameScr.ewa, 0, 108, 29, 27, 0, var2 + var4 - 58, var3, 0);

         for(var9 = 0; var9 < (var4 - 58) / 29; ++var9) {
            var0.aaa(GameScr.ewa, 0, 108, 29, 27, 0, var2 + 29 + var9 * 29, var3, 0);
         }
      } else {
         var0.aaa(GameScr.ewa, 0, 0, 29, 27, 0, var2, var3, 0);
         var0.aaa(GameScr.ewa, 0, 54, 29, 27, 0, var2 + var4 - 29, var3, 0);
         var0.aaa(GameScr.ewa, 0, 27, 29, 27, 0, var2 + var4 - 58, var3, 0);

         for(var9 = 0; var9 < (var4 - 58) / 29; ++var9) {
            var0.aaa(GameScr.ewa, 0, 27, 29, 27, 0, var2 + 29 + var9 * 29, var3, 0);
         }
      }

      var0.ada(var2 + 3, var3 + 1, var4 - 4, var5 - 4);
      fw.aqa.aaa(var0, var8, var6, var7, 0);
   }

   public static void aaa(as var0, boolean var1, int var2, int var3, int var4, int var5, int var6, String var7) {
      var0.aaa(0);
      int var8;
      if (var1) {
         var0.aaa(GameScr.ewa, 0, 81, 29, 27, 0, var2, var3, 0);
         var0.aaa(GameScr.ewa, 0, 135, 29, 27, 0, var2 + var4 - 29, var3, 0);
         var0.aaa(GameScr.ewa, 0, 108, 29, 27, 0, var2 + var4 - 58, var3, 0);

         for(var8 = 0; var8 < (var4 - 58) / 29; ++var8) {
            var0.aaa(GameScr.ewa, 0, 108, 29, 27, 0, var2 + 29 + var8 * 29, var3, 0);
         }
      } else {
         var0.aaa(GameScr.ewa, 0, 0, 29, 27, 0, var2, var3, 0);
         var0.aaa(GameScr.ewa, 0, 54, 29, 27, 0, var2 + var4 - 29, var3, 0);
         var0.aaa(GameScr.ewa, 0, 27, 29, 27, 0, var2 + var4 - 58, var3, 0);

         for(var8 = 0; var8 < (var4 - 58) / 29; ++var8) {
            var0.aaa(GameScr.ewa, 0, 27, 29, 27, 0, var2 + 29 + var8 * 29, var3, 0);
         }
      }

      fw.aqa.aaa(var0, var7, var5, var6, 0);
   }

   public static void aaa(as var0, int var1, int var2, int var3, int var4, String[] var5) {
      aaa(var1, var2, var3, var4, var0);
      var2 = var2 + 20 - fw.aqa.aaa;

      for(var4 = 0; var4 < var5.length; var2 += fw.aqa.aaa) {
         fw.aqa.aaa(var0, var5[var4], var1 + var3 / 2, var2, 2);
         ++var4;
      }

   }

   public static void aaa(int var0, int var1, int var2, int var3, as var4) {
      var4.aaa(aaa);
      var4.aca(var0, var1, var2, var3);
      var4.aaa(0);
      var4.aba(var0 - 2, var1 - 2, var2 + 3, var3 + 3);
      var4.aaa(13948116);
      var4.aba(var0 - 1, var1 - 1, var2 + 1, var3 + 1);
      var4.aaa(5720393);
      var4.aba(var0, var1, var2 - 1, var3 - 1);
      if (GameCanvas.afa) {
         var4.aaa(GameCanvas.bna[0], var0 - 4, var1 - 3, 20);
         var4.aaa(GameCanvas.bna[0], 0, 0, GameCanvas.boa, GameCanvas.bpa, 2, var0 + var2 + 4, var1 - 3, af.aca);
         var4.aaa(GameCanvas.bna[0], 0, 0, GameCanvas.boa, GameCanvas.bpa, 1, var0 - 4, var1 + var3 + 3, af.aea);
         var4.aaa(GameCanvas.bna[0], 0, 0, GameCanvas.boa, GameCanvas.bpa, 3, var0 + var2 + 4, var1 + var3 + 3, af.afa);
         var4.aaa(GameCanvas.bna[1], var0 + var2 / 2, var1 - 4, af.aaa);
      }

   }

   public static void aba(int var0, int var1, int var2, int var3, as var4) {
      var4.aaa(0);
      var4.aba(var0 - 2, var1 - 2, var2 + 3, var3 + 3);
      var4.aaa(13948116);
      var4.aba(var0 - 1, var1 - 1, var2 + 1, var3 + 1);
      var4.aaa(5720393);
      var4.aba(var0, var1, var2 - 1, var3 - 1);
      if (GameCanvas.afa) {
         var4.aaa(GameCanvas.bna[0], var0 - 4, var1 - 3, 20);
         var4.aaa(GameCanvas.bna[0], 0, 0, GameCanvas.boa, GameCanvas.bpa, 2, var0 + var2 + 4, var1 - 3, af.aca);
         var4.aaa(GameCanvas.bna[0], 0, 0, GameCanvas.boa, GameCanvas.bpa, 1, var0 - 4, var1 + var3 + 3, af.aea);
         var4.aaa(GameCanvas.bna[0], 0, 0, GameCanvas.boa, GameCanvas.bpa, 3, var0 + var2 + 4, var1 + var3 + 3, af.afa);
         var4.aaa(GameCanvas.bna[1], var0 + var2 / 2, var1 - 4, af.aaa);
      }

   }

   public static void aca(int var0, int var1, int var2, int var3, as var4) {
      var4.aaa(aaa);
      var4.aca(var0, var1, var2, var3);
   }

   public static void ada(int var0, int var1, int var2, int var3, as var4) {
      var4.aaa(aba);
      var4.aca(var0, var1, var2, var3);
   }

   public static void aba() {
      aaa = 0;
      aba = 0;
      aca = 0;
      ada = 0;
      aea = 0;
      afa = 0;
   }
}
