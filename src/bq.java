public final class bq {
   public int aaa;
   public byte aba;
   public bw aca;

   public bq() {
   }

   public bq(byte var1, int var2) {
      this.aaa = var2;
      this.aca = GameScr.bva[var1];
   }

   public final String aaa() {
      return ex.aaa(this.aca.aba, "#", String.valueOf(this.aaa));
   }

   public final String aba() {
      int var1;
      String var2;
      if (this.aca.aaa != 0 && this.aca.aaa != 1 && this.aca.aaa != 21 && this.aca.aaa != 22 && this.aca.aaa != 23 && this.aca.aaa != 24 && this.aca.aaa != 25 && this.aca.aaa != 26) {
         if (this.aca.aaa != 6 && this.aca.aaa != 7 && this.aca.aaa != 8 && this.aca.aaa != 9 && this.aca.aaa != 19) {
            if (this.aca.aaa != 2 && this.aca.aaa != 3 && this.aca.aaa != 4 && this.aca.aaa != 5 && this.aca.aaa != 10 && this.aca.aaa != 11 && this.aca.aaa != 12 && this.aca.aaa != 13 && this.aca.aaa != 14 && this.aca.aaa != 15 && this.aca.aaa != 17 && this.aca.aaa != 18 && this.aca.aaa != 20) {
               if (this.aca.aaa == 16) {
                  var1 = this.aaa - 3 + 1;
                  var2 = ex.aaa(this.aca.aba, "#", String.valueOf(this.aaa)) + " (" + var1 + "-" + this.aaa + ")";
               } else {
                  var2 = ex.aaa(this.aca.aba, "#", String.valueOf(this.aaa));
               }
            } else {
               var1 = this.aaa - 5 + 1;
               var2 = ex.aaa(this.aca.aba, "#", String.valueOf(this.aaa)) + " (" + var1 + "-" + this.aaa + ")";
            }
         } else {
            var1 = this.aaa - 10 + 1;
            var2 = ex.aaa(this.aca.aba, "#", String.valueOf(this.aaa)) + " (" + var1 + "-" + this.aaa + ")";
         }
      } else {
         var1 = this.aaa - 50 + 1;
         var2 = ex.aaa(this.aca.aba, "#", String.valueOf(this.aaa)) + " (" + var1 + "-" + this.aaa + ")";
      }

      return var2;
   }
}
