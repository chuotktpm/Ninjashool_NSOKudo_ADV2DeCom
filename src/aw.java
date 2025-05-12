public final class aw {
   private static ev aba;
   public static int aaa;

   public static void aaa() {
      aba = new ev();
      aaa = -1;
   }

   static {
      aa.aaa(7);
      aaa();
   }

   public static void aaa(gh var0, String var1) {
      fd var3;
      if ((var3 = fd.aaa(var0, var1)) != null) {
         for(int var2 = 0; var2 < aba.size(); ++var2) {
            if (((fd)aba.elementAt(var2)).aaa.aaa == var0.aaa) {
               aba.setElementAt(var3, var2);
               return;
            }
         }

         aba.addElement(var3);
      }

   }

   public static void aaa(gh var0) {
      for(int var1 = 0; var1 < aba.size(); ++var1) {
         if (((fd)aba.elementAt(var1)).aaa.aaa == var0.aaa) {
            aba.removeElementAt(var1);
            return;
         }
      }

   }

   public static fd aaa(short var0) {
      for(int var1 = 0; var1 < aba.size(); ++var1) {
         fd var2;
         if ((var2 = (fd)aba.elementAt(var1)).aaa.aaa == var0) {
            return var2;
         }
      }

      return null;
   }

   public static fd aaa(String var0) {
      for(int var1 = 0; var1 < aba.size(); ++var1) {
         fd var2;
         if ((var2 = (fd)aba.elementAt(var1)).aba.equals(var0)) {
            return var2;
         }
      }

      return null;
   }

   public static ev aba() {
      ev var0 = new ev();

      for(int var1 = 0; var1 < aba.size(); ++var1) {
         fd var2 = (fd)aba.elementAt(var1);
         var0.addElement(var1 + ". " + var2.aaa.ada + " id " + var2.aba);
         if (var2.afa > 0) {
            var0.addElement("Mua " + var2.aga + "k/" + var2.afa + " max " + var2.aha);
         }

         if (var2.aca > 0) {
            var0.addElement("Bán " + var2.ada + "k/" + var2.aca + " min " + var2.aea);
         }
      }

      return var0;
   }

   public static String aca() {
      if (aba.size() == 0) {
         return "";
      } else {
         if (aaa >= aba.size() || aaa < 0) {
            aaa = 0;
         }

         int var0 = aaa;

         do {
            fd var1;
            boolean var2 = (var1 = (fd)aba.elementAt(aaa = (aaa + 1) % aba.size())).aba();
            boolean var3 = var1.aca();
            if (var2 && var3) {
               return "" + fz.ala().cea + " bán " + var1.aba + " " + var1.ada + "k " + var1.aca + " cái, mua " + var1.aga + "k " + var1.afa + " cai, mua bán pm";
            }

            if (var2) {
               return "" + fz.ala().cea + " bán " + var1.aba + " " + var1.ada + "k " + var1.aca + " cái, mua pm";
            }

            if (var3) {
               return "" + fz.ala().cea + " mua " + var1.aba + " " + var1.aga + "k " + var1.afa + " cái, bán pm hoặc gd";
            }
         } while(var0 != aaa);

         return "";
      }
   }

   public static void aba(String var0) {
      for(int var1 = 0; var1 < aba.size(); ++var1) {
         fd var2;
         if (fz.afa((var2 = (fd)aba.elementAt(var1)).aaa.aaa) != null) {
            boolean var3 = var2.aba();
            boolean var4 = var2.aca();
            if (var3 && var4) {
               Code.aaa(var0, "id: " + var2.aba + " " + var2.aaa.ada + " bán: " + var2.ada + "k/" + var2.aca + "cái, mua: " + var2.aga + "k/" + var2.afa + " cái. Còn " + var2.ada() + " cái.");
            } else if (var3) {
               Code.aaa(var0, "id: " + var2.aba + " " + var2.aaa.ada + " bán: " + var2.ada + "k/" + var2.aca + "cái. Còn " + var2.ada() + " cái.");
            } else if (var4) {
               Code.aaa(var0, "id: " + var2.aba + " " + var2.aaa.ada + " mua: " + var2.aga + "k/" + var2.afa + " cái. Còn mua: " + (var2.afa > 0 && fz.aka(var2.aaa.aaa) < var2.aha ? var2.aha - fz.aka(var2.aaa.aaa) : 0));
            }
         }
      }

   }

   public static boolean ada() {
      for(int var0 = 0; var0 < aba.size(); ++var0) {
         if (((fd)aba.elementAt(var0)).aca()) {
            return true;
         }
      }

      return false;
   }

   public static void aca(String var0) {
      ev var1 = new ev();

      fd var3;
      for(int var2 = 0; var2 < aba.size(); ++var2) {
         if ((var3 = (fd)aba.elementAt(var2)).aba()) {
            var1.addElement(var3);
         }
      }

      if (var1.size() > 0) {
         fd var4;
         if (var1.size() == 1) {
            var4 = (fd)var1.firstElement();
            Code.aaa(var0, "- Để mua hàng chat buy idvp solg hoặc mua solg idvp");
            Code.aaa(var0, "     Vd mua 12 " + var4.aaa.ada);
            Code.aaa(var0, "     chat mua 12 " + var4.aba + " hoặc buy " + var4.aba + " 12");
         } else {
            var4 = (fd)var1.elementAt(0);
            var3 = (fd)var1.elementAt(1);
            Code.aaa(var0, "- Để mua hàng chat buy idvp1 solg1 idvp2 solg2.... hoặc mua solg1 idvp1 solg2 idvp2...");
            Code.aaa(var0, "     Vd mua 5 " + var4.aaa.ada + " 5 " + var3.aaa.ada);
            Code.aaa(var0, "     chat mua 5 " + var4.aba + " 5 " + var3.aba + " hoặc buy " + var4.aba + " 5 " + var3.aba + " 5");
         }
      }

      if (ada()) {
         Code.aaa(var0, "- Để bán hàng chat sell hoặc giao dịch");
      }

      Code.aaa(var0, "- Để Donate chat donate. Thank");
   }

   public static void aea() {
      aba = null;
      aaa = 0;
   }
}
