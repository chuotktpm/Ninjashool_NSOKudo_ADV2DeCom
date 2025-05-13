public final class ef extends cu {
   private fx aaa;
   private int aba;
   private int aga;
   private int aha;
   private int aia = 1;
   private Char aja;
   private short aka = 0;
   private long ala = 0L;

   public static void aaa(int var0, int var1, int var2, int var3) {
      ef var4;
      (var4 = new ef()).aaa = GameScr.bca[var0];
      var4.aga = var1;
      var4.aha = var2;
      var4.aka = (short)var3;
      cu.aca.addElement(var4);
   }

   public static void aaa(int var0, int var1, int var2, int var3, byte var4) {
      ef var5;
      (var5 = new ef()).aaa = GameScr.bca[var0];
      var5.aga = var1;
      var5.aha = var2;
      var5.aka = (short)var3;
      var5.aia = var4;
      cu.aca.addElement(var5);
   }

   public static void aaa(int var0, Char var1, int var2) {
      ef var3;
      (var3 = new ef()).aaa = GameScr.bca[var0];
      var3.aja = var1;
      var3.aka = (short)var2;
      cu.aca.addElement(var3);
   }

   public static void aba(int var0, Char var1, int var2) {
      ef var3;
      (var3 = new ef()).aaa = GameScr.bca[var0];
      var3.aja = var1;
      var3.ala = System.currentTimeMillis() + (long)(var2 * 1000);
      cu.aca.addElement(var3);
   }

   public final void aaa(as var1) {
      if (this.aja != null) {
         this.aga = this.aja.cx;
         this.aha = this.aja.cy;
      }

      int var2 = this.aga + this.aaa.aba[this.aba].aaa * this.aia;
      int var3 = this.aha + this.aaa.aba[this.aba].aba;
      if (GameCanvas.aea(var2, var3)) {
         fo.aaa(var1, this.aaa.aba[this.aba].aca, var2, var3, this.aia == 1 ? 0 : 2, 3);
      }

   }

   public final void aba() {
      if (this.ala != 0L) {
         ++this.aba;
         if (this.aba >= this.aaa.aba.length) {
            this.aba = 0;
         }

         if (System.currentTimeMillis() - this.ala > 0L) {
            if (this.aaa.aaa == 120) {
               GameCanvas.ada = false;
            }

            cu.aca.removeElement(this);
         }
      } else {
         ++this.aba;
         if (this.aba >= this.aaa.aba.length) {
            --this.aka;
            if (this.aka <= 0) {
               if (this.aaa.aaa == 120) {
                  GameCanvas.ada = false;
               }

               cu.aca.removeElement(this);
            } else {
               this.aba = 0;
            }
         }
      }

      if (GameCanvas.aua % 11 == 0 && this.aja != null && this.aja != Char.getMyChar() && !GameScr.vCharInMap.contains(this.aja)) {
         cu.aca.removeElement(this);
      }

   }
}
