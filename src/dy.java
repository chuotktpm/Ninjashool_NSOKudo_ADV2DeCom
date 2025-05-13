public final class dy {
   private static ev aba;
   private static bo aca;
   private static int ada;
   private static int aea;
   private static int afa;
   private static int aga;
   private static int aha;
   public static int aaa;

   public static void aaa() {
      aba = new ev();
      ada = 5;
      aha = 2;
      aaa = 15;
   }

   static {
      aa.aaa(34);
      aaa();
   }

   public static void aaa(as var0) {
      int var1 = GameCanvas.aza;
      if (aca != null) {
         var0.ada(0, 0, GameCanvas.aza, GameCanvas.baa);
         if (!GameCanvas.afa) {
            fk.aaa(-6, -4, var1 + 10, aaa + 8, var0);
         } else {
            var0.aaa(0);
            var0.aca(0, 0, var1, aaa);
         }

         var0.ada(0, 0, var1, aaa + 5);
         aca.aba.aaa(var0, aca.aaa, afa, 5, 0);
      }

   }

   public static void aba() {
      if (GameCanvas.afa) {
         aaa = 20;
      }

      if (ada == 0) {
         if ((afa += (aha - afa) / 3) - aha < 3) {
            afa = aha + 2;
            ada = 2;
            aea = 0;
            return;
         }
      } else if (ada == 2) {
         if (++aea > aca.aca) {
            ada = 3;
            aea = 0;
            return;
         }
      } else if (ada == 3) {
         if (afa + aga < aha + GameCanvas.aza - 160) {
            afa -= 6;
         } else {
            afa -= 2;
         }

         if (afa + aga < aha) {
            ada = 4;
            aea = 0;
            return;
         }
      } else if (ada == 4) {
         if (++aea > 10) {
            ada = 5;
            aea = 0;
            return;
         }
      } else if (ada == 5) {
         if (aba.size() > 0) {
            bo var0 = (bo)aba.firstElement();
            aba.removeElementAt(0);
            if (aca != null && var0.aaa.equals(aca.aaa)) {
               return;
            }

            aca = var0;
            aga = var0.aba.aaa(aca.aaa);
            aea = 0;
            ada = 0;
            afa = GameCanvas.aza;
            return;
         }

         aca = null;
         if (GameCanvas.afa) {
            aaa = 0;
         }
      }

   }

   public static void aaa(String var0, int var1, fw var2) {
      String var3 = var0;
      boolean var7;
      if (aca != null && aca.aaa != null && var0.equals(aca.aaa)) {
         var7 = true;
      } else if (aba.size() > 0 && var0.equals(((bo)aba.lastElement()).aaa)) {
         var7 = true;
      } else {
         label96: {
            if (var0.length() >= 8) {
               String var4;
               String var5;
               if (aca != null && aca.aaa != null && ada < 3 && aca.aaa.length() >= 8) {
                  var4 = var0.substring(0, 8);
                  var5 = aca.aaa.substring(0, 8);
                  if (var4.equals(var5)) {
                     int var9;
                     for(var9 = 7; var9 < var3.length() && var9 < aca.aaa.length() && var3.charAt(var9) == aca.aaa.charAt(var9); ++var9) {
                     }

                     var5 = var3.substring(var9, var3.length());
                     aca.aaa = aca.aaa + ", " + var5;
                     ada = 2;
                     aea = 0;
                     var7 = true;
                     break label96;
                  }
               }

               if (aba.size() > 0 && (var4 = ((bo)aba.lastElement()).aaa).length() >= 8) {
                  var5 = var0.substring(0, 8);
                  String var6 = var4.substring(0, 8);
                  if (var5.equals(var6)) {
                     int var8;
                     for(var8 = 7; var8 < var3.length() && var8 < var4.length() && var3.charAt(var8) == var4.charAt(var8); ++var8) {
                     }

                     var3 = var3.substring(var8, var3.length());
                     (new StringBuffer(String.valueOf(var4))).append(", ").append(var3);
                     var7 = true;
                     break label96;
                  }
               }
            }

            var7 = false;
         }
      }

      if (!var7) {
         if (GameCanvas.aza == 128) {
            aha = 1;
         }

         if (aba.size() > 10) {
            aba.removeElementAt(0);
         }

         aba.addElement(new bo(var0, var2, var1));
      }

   }

   public static void aca() {
      aba = null;
      aca = null;
      ada = 0;
      aea = 0;
      afa = 0;
      aga = 0;
      aha = 0;
      aaa = 0;
   }
}
