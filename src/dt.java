public final class dt extends fq implements ag {
   private String[] afa;
   public eq aaa;
   public eq aba;
   private int aga;
   private int aha;
   private int aia;
   private int aja;

   public dt() {
      new ca("", 1000, (Object)null);
      this.aaa = new eq();
      this.aba = new eq();
   }

   public final void aaa(String var1, String var2) {
      this.aja = fw.aqa.aaa(var1) > fw.aqa.aaa(var2) ? fw.aqa.aaa(var1) : fw.aqa.aaa(var2);
      this.aga = 40;
      this.aha = 0;
      if (ab.aza <= 176) {
         this.aga = 10;
      }

      this.aaa.aaa = this.aga + this.aja + 10;
      this.aaa.aba = ab.baa - 2 * fb.aoa - 50;
      this.aaa.aca = ab.aza - 2 * this.aga - this.aja - 20;
      this.aaa.ada = fb.aoa + 2;
      this.aaa.aea = true;
      this.aaa.aga = var1;
      this.aba.aaa = this.aga + this.aja + 10;
      this.aba.aba = ab.baa - fb.aoa - 43;
      this.aba.aca = ab.aza - 2 * this.aga - this.aja - 20;
      this.aba.ada = fb.aoa + 2;
      this.aba.aga = var2;
      super.aea = this.aaa.ava;
   }

   public final void aaa(String var1, ca var2, ca var3, int var4, int var5) {
      this.aaa.aaa("");
      this.aaa.ara = var4;
      this.aba.aaa("");
      this.aba.ara = var5;
      this.afa = fw.aqa.aba(var1, ab.aza - this.aga * 3);
      ev var6 = fw.aqa.aaa(var1, ab.aza - this.aga * 3);
      this.aia = var6.size();
      super.aca = var2;
      super.ada = var3;
      ab.bia = this;
   }

   public final void aaa(as var1) {
      fk.aaa(var1, this.aga, ab.baa - 85 - fb.aqa - this.aia * 13, ab.aza - (this.aga << 1), 80 + this.aia * 13, this.afa);
      fw.aqa.aaa(var1, this.aaa.aga + ": ", this.aaa.aaa - this.aja - 5, this.aaa.aba + 5, 0);
      this.aaa.aaa(var1);
      var1.ada(0, 0, ab.aza, ab.baa);
      fw.aqa.aaa(var1, this.aba.aga + ": ", this.aba.aaa - this.aja - 5, this.aba.aba + 5, 0);
      this.aba.aaa(var1);
      super.aaa(var1);
   }

   public final void aaa(int var1) {
      if (this.aha == 0) {
         this.aaa.aaa(var1);
      } else {
         this.aba.aaa(var1);
      }

      super.aaa(var1);
   }

   public final void aaa() {
      if (ab.aka[2]) {
         this.aha = 0;
      }

      if (ab.aka[8]) {
         this.aha = 1;
      }

      if (this.aha == 0) {
         this.aaa.aea = true;
         this.aba.aea = false;
         super.aea = this.aaa.ava;
         this.aaa.ada();
      } else {
         this.aaa.aea = false;
         this.aba.aea = true;
         super.aea = this.aba.ava;
         this.aba.ada();
      }

      if (ab.afa && ab.aoa && ab.ana) {
         if (ab.aba(this.aaa.aaa, this.aaa.aba, this.aaa.aca, this.aaa.ada)) {
            this.aha = 0;
         }

         if (ab.aba(this.aba.aaa, this.aba.aba, this.aba.aca, this.aba.ada)) {
            this.aha = 1;
         }
      }

      if (super.aca != null) {
         super.aca.afa = ab.aza / 2 - 160;
         super.aca.aga = ab.baa - 26;
      }

      if (super.ada != null) {
         super.ada.afa = ab.aza / 2 - 35;
         super.ada.aga = ab.baa - 26;
      }

      if (super.aea != null) {
         super.aea.afa = ab.aza / 2 + 88;
         super.aea.aga = ab.baa - 26;
      }

      super.aaa();
   }

   public final void aaa(int var1, Object var2) {
   }
}
