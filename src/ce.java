public final class ce extends fb implements ag {
   private int aaa;
   private int aba;
   private int aca;
   private int ada;
   private int aea = -1;

   public final void aaa() {
      GameScr.aca = ab.baa;
      if (ab.bqa == 2) {
         ab.aaa(0);
      } else {
         ab.aaa(gn.ama);
      }

      super.aaa();
      if (GameScr.aaa != null) {
         GameScr.aaa = null;
      }

      if ((gn.ama = (byte)((int)(System.currentTimeMillis() % 9L))) == 5 || gn.ama == 6) {
         gn.ama = 4;
      }

      GameScr.aaa(true);
      GameScr.aia = 100;
      this.aaa = 170;
      this.aba = 175;
      if (ab.aza == 128 || ab.baa <= 208) {
         this.aaa = 126;
         this.aba = 160;
      }

      this.aca = ab.aza / 2 - this.aaa / 2;
      this.ada = ab.baa / 2 - this.aba / 2;
      if (ab.baa <= 250) {
         this.ada -= 10;
      }

      super.ama = new ca(ab.afa ? "" : er.dca, this, 1000, (Object)null);
      super.ana = new ca(er.daa, ab.aja, 8885, (Object)null);
      this.aea = -1;
      if (!ab.afa) {
         this.aea = 0;
      }

      if (ab.afa && ab.aza >= 320) {
         super.ama.afa = ab.aza / 2 - 35;
         super.ana.afa = ab.aza / 2 + 88;
         super.ama.aga = super.ana.aga = ab.baa - 26;
      }

   }

   public final void aaa(as var1) {
      var1.aaa(0);
      var1.aca(0, 0, ab.aza, ab.baa);
      ab.aaa(var1);
      fk.aaa(this.aca, this.ada, this.aaa, this.aba, var1);
      var1.aaa(fk.aca);
      var1.aba(ab.bba - fw.aqa.aaa(er.bia) / 2 - 12, this.ada + 7, fw.aqa.aaa(er.bia) + 22, 24, 6, 6);
      var1.aaa(fk.aba);
      var1.aaa(ab.bba - fw.aqa.aaa(er.bia) / 2 - 12, this.ada + 7, fw.aqa.aaa(er.bia) + 22, 24, 6, 6);
      fw.aqa.aaa(var1, er.bia, ab.bba, this.ada + 12, 2);
      String[] var2 = er.bka;
      int var3 = this.ada + 50;

      for(int var4 = 0; var4 < var2.length; ++var4) {
         var1.aaa(fk.aca);
         var1.aca(this.aca + 10, var3 + var4 * 35, this.aaa - 20, 28);
         var1.aaa(5720393);
         var1.aba(this.aca + 10, var3 + var4 * 35, this.aaa - 20, 28);
         if (var4 == this.aea) {
            var1.aaa(fk.aba);
            var1.aca(this.aca + 10, var3 + var4 * 35, this.aaa - 20, 28);
            var1.aaa(11053224);
            var1.aba(this.aca + 10, var3 + var4 * 35, this.aaa - 20, 28);
         }

         fw.aga.aaa(var1, var2[var4], this.aca + this.aaa / 2, var3 + var4 * 35 + 8, 2);
      }

      super.aaa(var1);
      fk.aaa(var1, super.ala, super.ama, super.ana);
   }

   public final void aba() {
      if (++GameScr.aia > ab.aza * 3 + 100) {
         GameScr.aia = 100;
      }

      super.aba();
   }

   public final void aca() {
      if (ab.aka[2] || ab.aka[4] || ab.aka[6] || ab.aka[8]) {
         this.aea = this.aea == 0 ? 1 : 0;
      }

      if (ab.aoa && ab.aba(this.aca + 10, this.ada + 45, this.aaa - 10, 70)) {
         if (ab.ana) {
            this.aea = (ab.aqa - (this.ada + 45)) / 35;
         }

         this.aaa(1000, (Object)null);
      }

      super.aca();
      ab.aka();
   }

   public final void aaa(int var1, Object var2) {
      switch(var1) {
      case 1000:
         ab.bia = null;
         var1 = er.aea = this.aea == 0 ? 0 : 1;
         fd.aaa("indLanguage", var1);
         er.aaa();
         fd.aaa();
         ab.ada();
         ab.bfa.aaa();
      default:
      }
   }
}
