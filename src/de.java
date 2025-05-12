public final class de extends Auto {
   private int aaa;

   public de(int var1) {
      this.aaa = var1;
   }

   public final void aaa(String var1) {
      if (var1.startsWith("Thần thú đã xuất hiện tại")) {
         short var2 = -1;
         if (this.aaa >= 40 && this.aaa < 50) {
            if (var1.indexOf("Đảo Hebi") > 0) {
               var2 = 34;
            }

            if (var1.indexOf("Hang Meiro") > 0) {
               var2 = 35;
            }

            if (var1.indexOf("Rừng Kappa") > 0) {
               var2 = 52;
            }

            if (var1.indexOf("Rừng Aokigahara") > 0) {
               var2 = 14;
            }

            if (var1.indexOf("Vách núi Ito") > 0) {
               var2 = 15;
            }

            if (var1.indexOf("Núi Anzen") > 0) {
               var2 = 68;
            }

            if (var1.indexOf("Thung lũng Taira") > 0) {
               var2 = 16;
            }
         }

         if (this.aaa >= 50 && this.aaa < 60) {
            if (var1.indexOf("Núi Ontake") > 0) {
               var2 = 67;
            }

            if (var1.indexOf("Đỉnh Okama") > 0) {
               var2 = 44;
            }
         }

         if (this.aaa >= 60 && this.aaa < 70) {
            if (var1.indexOf("Khu đá đỏ Akai") > 0) {
               var2 = 41;
            }

            if (var1.indexOf("Mũi Hone") > 0) {
               var2 = 59;
            }

            if (var1.indexOf("Đỉnh Ichidai") > 0) {
               var2 = 24;
            }

            if (var1.indexOf("Hang núi Kurai") > 0) {
               var2 = 45;
            }
         }

         if (this.aaa >= 70 && this.aaa < 80) {
            if (var1.indexOf("Ngôi đền Orochi") > 0) {
               var2 = 19;
            }

            if (var1.indexOf("Đồng Kisei") > 0) {
               var2 = 36;
            }

            if (var1.indexOf("Đền Harumoto") > 0) {
               var2 = 54;
            }
         }

         if (this.aaa >= 90 && this.aaa < 100 && var1.indexOf("Đoạn Sơn") > 0) {
            var2 = 141;
         }

         if (this.aaa >= 100 && this.aaa < 110 && var1.indexOf("Đảo Quỷ") > 0) {
            var2 = 142;
         }

         if (this.aaa >= 110 && var1.indexOf("Sinh Tử Kiều") > 0) {
            var2 = 143;
         }

         if (var2 > 0) {
            Code.aaa((Auto)(new ej(var2)));
         }
      }

   }

   protected final void aaa() {
   }

   public final String toString() {
      return "Chờ boss " + this.aaa;
   }
}
