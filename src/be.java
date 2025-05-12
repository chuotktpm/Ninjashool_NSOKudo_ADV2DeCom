public final class be {
   private static ev aaa;
   private static bo aba;
   private static int aca;
   private static int ada;
   private static int aea;
   private static int afa;
   private static int aga;
   private static int aha;

   public static void aaa() {
      aaa = new ev();
      aca = 5;
      aga = 2;
      aha = 20;
   }

   static {
      aa.aaa(9);
      aaa();
   }

   public static void aaa(as var0) {
      int var1 = aga;
      int var2 = ab.baa - 23;
      int var3 = ab.aza;
      if (ab.afa) {
         if (ab.aza >= 450) {
            var1 = 130;
            var3 = ab.aza - 260;
         } else {
            var1 = 80;
            var3 = ab.aza - 160 - 10;
         }

         var2 = ab.baa - 60;
         aga = var1 + 2;
      }

      if (aba != null && (ab.bia == null || ab.bia.ada == null)) {
         var0.ada(0, 0, ab.aza, ab.baa);
         if (ab.afa) {
            fk.aaa(var1, var2 - 4, var3 + 10, aha + 8, var0);
         } else {
            var0.aaa(0);
            var0.aca(var1 - 2, var2, var3 + 2, aha);
         }

         var0.ada(var1, var2, var3, aha);
         aba.aba.aaa(var0, aba.aaa, aea, var2 + 3, 0);
      }

   }

   public static void aba() {
      if (aca == 0) {
         if ((aea += (aga - aea) / 3) - aga < 3) {
            aea = aga + 2;
            aca = 2;
            ada = 0;
            return;
         }
      } else if (aca == 2) {
         if (++ada > aba.aca) {
            aca = 3;
            ada = 0;
            return;
         }
      } else if (aca == 3) {
         if (aea + afa < aga + ab.aza - 20) {
            aea -= 6;
         } else {
            aea -= 2;
         }

         if (aea + afa < aga) {
            aca = 4;
            ada = 0;
            return;
         }
      } else if (aca == 4) {
         if (++ada > 10) {
            aca = 5;
            ada = 0;
            return;
         }
      } else if (aca == 5) {
         if (aaa.size() > 0) {
            bo var0 = (bo)aaa.firstElement();
            aaa.removeElementAt(0);
            if (aba != null && var0.aaa.equals(aba.aaa)) {
               return;
            }

            aba = var0;
            afa = var0.aba.aaa(aba.aaa);
            ada = 0;
            aca = 0;
            aea = ab.aza;
            return;
         }

         aba = null;
      }

   }

   public static void aaa(String var0) {
      if (!aba(var0)) {
         if (ab.aza == 128) {
            aga = 1;
         }

         if (aaa.size() > 10) {
            aaa.removeElementAt(0);
         }

         aaa.addElement(new bo(var0));
      }

   }

   private static boolean aba(String var0) {
      if (aba != null && aba.aaa != null && var0.equals(aba.aaa)) {
         return true;
      } else if (aaa.size() > 0 && var0.equals(((bo)aaa.lastElement()).aaa)) {
         return true;
      } else if (var0.length() < 8) {
         return false;
      } else {
         String var1;
         String var2;
         if (aba != null && aba.aaa != null && aca < 3 && aba.aaa.length() >= 8) {
            var1 = var0.substring(0, 8);
            var2 = aba.aaa.substring(0, 8);
            if (var1.equals(var2)) {
               int var5;
               for(var5 = 7; var5 < var0.length() && var5 < aba.aaa.length() && (var0.charAt(var5) < '0' || var0.charAt(var5) > '9') && var0.charAt(var5) == aba.aaa.charAt(var5); ++var5) {
               }

               var2 = var0.substring(var5, var0.length());
               aba.aaa = aba.aaa + ", " + var2;
               aca = 2;
               ada = 0;
               return true;
            }
         }

         if (aaa.size() > 0 && (var1 = ((bo)aaa.lastElement()).aaa).length() >= 8) {
            var2 = var0.substring(0, 8);
            String var3 = var1.substring(0, 8);
            if (var2.equals(var3)) {
               int var4;
               for(var4 = 7; var4 < var0.length() && var4 < var1.length() && (var0.charAt(var4) < '0' || var0.charAt(var4) > '9') && var0.charAt(var4) == var1.charAt(var4); ++var4) {
               }

               var0 = var0.substring(var4, var0.length());
               (new StringBuffer(String.valueOf(var1))).append(", ").append(var0);
               return true;
            }
         }

         return false;
      }
   }

   public static void aaa(String var0, int var1, fw var2) {
      if (!aba(var0)) {
         if (ab.aza == 128) {
            aga = 1;
         }

         if (aaa.size() > 10) {
            aaa.removeElementAt(0);
         }

         aaa.addElement(new bo(var0, var2, var1));
      }

   }

   public static boolean aca() {
      return aca == 5 && aaa.size() == 0;
   }

   public static void ada() {
      aaa = null;
      aba = null;
      aca = 0;
      ada = 0;
      aea = 0;
      afa = 0;
      aga = 0;
      aha = 0;
   }
}
