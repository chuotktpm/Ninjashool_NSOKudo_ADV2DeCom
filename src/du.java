public final class du {
   public int aaa = 0;
   public int aba;
   public int aca;
   private int ada;
   private int aea;
   private int afa;
   private int aga;
   private int aha;
   private int aia;
   private fz aja;
   private dw aka = null;
   private static byte[] ala;
   private static int[] ama;
   private static int[] ana;

   public static void aaa() {
      ala = new byte[]{0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0};
      ama = new int[]{0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 217, 232, 255, 285, 307, 322, 345, 370};
      ana = new int[]{0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 3, 4, 5, 5, 5, 1};
   }

   static {
      aa.aaa(32);
      aaa();
   }

   public du(fz var1, dw var2) {
      this.aja = var1;
      this.aka = var2;
   }

   public final void aba() {
      if (this.aja.dpa != null || this.aja.dsa != null) {
         if (this.aja.dpa != null) {
            this.ada = this.aja.dpa.ada;
            this.aea = this.aja.dpa.aea - this.aja.dpa.aka / 4;
         } else if (this.aja.dsa != null) {
            this.ada = this.aja.dsa.ala;
            this.aea = this.aja.dsa.ama - this.aja.dsa.cja / 4;
         }

         int var1 = this.ada - this.aba;
         int var2 = this.aea - this.aca;
         byte var3 = 4;
         if (var1 + var2 < 60) {
            var3 = 3;
         } else if (var1 + var2 < 30) {
            var3 = 2;
         }

         if (this.aba != this.ada) {
            if (var1 > 0 && var1 < 5) {
               this.aba = this.ada;
            } else if (var1 < 0 && var1 > -5) {
               this.aba = this.ada;
            } else {
               this.afa = this.ada - this.aba << 2;
               this.aha += this.afa;
               this.aba += this.aha >> var3;
               this.aha &= 15;
            }
         }

         if (this.aca != this.aea) {
            if (var2 > 0 && var2 < 5) {
               this.aca = this.aea;
            } else if (var2 < 0 && var2 > -5) {
               this.aca = this.aea;
            } else {
               this.aga = this.aea - this.aca << 2;
               this.aia += this.aga;
               this.aca += this.aia >> var3;
               this.aia &= 15;
            }
         }

         var1 = 0;
         var2 = 0;
         int var5 = 0;
         int var4 = 0;
         if (this.aja.dpa != null) {
            var1 = this.ada - this.aja.dpa.aja / 4;
            var5 = this.ada + this.aja.dpa.aja / 4;
            var2 = this.aea - this.aja.dpa.aka / 4;
            var4 = this.aea + this.aja.dpa.aka / 4;
         } else if (this.aja.dsa != null) {
            var1 = this.ada - this.aja.dsa.cia / 4;
            var5 = this.ada + this.aja.dsa.cia / 4;
            var2 = this.aea - this.aja.dsa.cja / 4;
            var4 = this.aea + this.aja.dsa.cja / 4;
         }

         if (this.aaa > 0) {
            --this.aaa;
         }

         if (this.aaa != 0 && (this.aba < var1 || this.aba > var5 || this.aca < var2 || this.aca > var4)) {
            return;
         }
      }

      this.aja.haa = null;
      this.aba = this.aca = this.ada = this.aea = this.afa = this.aga = this.aha = this.aia = 0;
      this.aja.aua();
      if (this.aja.cla) {
         this.aja.apa();
      }

   }

   public final void aaa(as var1) {
      int var2 = this.ada - this.aba;
      int var3 = this.aea - this.aca;
      var2 = ci.aaa(var2, -var3);
      var3 = 0;

      while(true) {
         if (var3 >= ama.length - 1) {
            var2 = 0;
            break;
         }

         if (var2 >= ama[var3] && var2 <= ama[var3 + 1]) {
            var2 = var3 >= 16 ? 0 : var3;
            break;
         }

         ++var3;
      }

      try {
         fo.aaa(var1, this.aka.aaa[ala[var2]], this.aba, this.aca, ana[var2], 3);
      } catch (Exception var4) {
      }
   }

   public static void aca() {
      ala = null;
      ama = null;
      ana = null;
   }
}
