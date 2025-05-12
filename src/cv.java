public final class cv extends Auto {
   public static boolean aaa;
   private static String[] aba;
   private static int aca;
   private aj ada;

   public static void aaa(String var0) {
      if (var0.equals(aba[0])) {
         aca = 21;
         gj.ama();
      } else {
         int var1;
         if ((var1 = var0.indexOf(aba[1])) >= 0) {
            var0 = var0.substring(var1 + aba[1].length(), var0.indexOf(aba[2])).trim();

            try {
               aca = Integer.parseInt(var0);
            } catch (NumberFormatException var3) {
            }
         }

      }
   }

   public final void a_() {
      aca = 0;
      this.ada = fz.ama(0);
      super.a_();
   }

   public final void b_() {
      this.ada = fz.ama(0);
   }

   public final void aaa() {
      if (aca <= 20 && (!(super.aoa instanceof eu) || System.currentTimeMillis() - super.ana < 3600000L)) {
         if (fz.ala().bba <= 0) {
            Auto.aaa(false);
            return;
         }

         if (gn.afa(gn.aoa)) {
            if (this.ada == null) {
               gf.aca("Nhận NV " + (aca + 1) + "/20");
               gf.aba(25, gf.gva, 0);
               gj.ala();
               this.ada = fz.ama(0);
               return;
            }

            if (this.ada.aba < this.ada.aca) {
               gf.aca("Đi làm NV " + aca + "/20");
               gf.aba(25, gf.gva, 3);
               gn.aga();
               this.aca(super.aha);
               return;
            }

            if (fz.bja() <= 0) {
               gf.aca("Hành trang đầy");
               return;
            }

            gf.aca("Hoàn thành NV " + aca + "/20");
            gf.aba(25, gf.gva, 2);
            this.ada = null;
         } else if (this.ada != null && gn.aoa == this.ada.aga) {
            if (this.ada.aba >= this.ada.aca) {
               Auto.ala();
               return;
            }

            this.aca(this.ada.afa, 1);
            this.ada(-1);
            if (aaa) {
               gf.aca("Nhiệm vụ " + aca + "/20: " + this.ada.aba + "/" + this.ada.aca + " " + ac.aaa[this.ada.afa].aga);
               aaa = false;
            }
         }
      } else {
         gf.aca("Hoàn thành!");
         Code var1 = Code.aaa;
         Code.aca();
      }

   }

   public final String toString() {
      return "Auto Nhiệm vụ hằng ngày: " + aca + "/20";
   }

   public static void ada() {
      aaa = false;
      aba = new String[]{"Hôm nay con đã làm hết nhiệm vụ ta giao. Hãy quay lại vào ngày hôm sau.", "Đây là lần nhận nhiệm vụ thứ ", " trong ngày hôm nay. Mỗi ngày được nhận tối đa 20 lần con nhé."};
   }

   static {
      aa.aaa(26);
      ada();
   }

   public static void aea() {
      aaa = false;
      aba = null;
      aca = 0;
   }
}
