public final class ce extends fb implements ag {
   private int aaa;
   private int aba;
   private int aca;
   private int ada;
   private int aea = -1;

   public final void aaa() {
      GameScr.aca = GameCanvas.baa;
      if (GameCanvas.bqa == 2) {
         GameCanvas.aaa(0);
      } else {
         GameCanvas.aaa(TileMap.ama);
      }

      super.aaa();
      if (GameScr.aaa != null) {
         GameScr.aaa = null;
      }

      if ((TileMap.ama = (byte)((int)(System.currentTimeMillis() % 9L))) == 5 || TileMap.ama == 6) {
         TileMap.ama = 4;
      }

      GameScr.aaa(true);
      GameScr.aia = 100;
      this.aaa = 170;
      this.aba = 175;
      if (GameCanvas.aza == 128 || GameCanvas.baa <= 208) {
         this.aaa = 126;
         this.aba = 160;
      }

      this.aca = GameCanvas.aza / 2 - this.aaa / 2;
      this.ada = GameCanvas.baa / 2 - this.aba / 2;
      if (GameCanvas.baa <= 250) {
         this.ada -= 10;
      }

      super.ama = new ca(GameCanvas.afa ? "" : er.dca, this, 1000, (Object)null);
      super.ana = new ca(er.daa, GameCanvas.aja, 8885, (Object)null);
      this.aea = -1;
      if (!GameCanvas.afa) {
         this.aea = 0;
      }

      if (GameCanvas.afa && GameCanvas.aza >= 320) {
         super.ama.afa = GameCanvas.aza / 2 - 35;
         super.ana.afa = GameCanvas.aza / 2 + 88;
         super.ama.aga = super.ana.aga = GameCanvas.baa - 26;
      }

   }

   public final void aaa(as var1) {
      var1.aaa(0);
      var1.aca(0, 0, GameCanvas.aza, GameCanvas.baa);
      GameCanvas.aaa(var1);
      fk.aaa(this.aca, this.ada, this.aaa, this.aba, var1);
      var1.aaa(fk.aca);
      var1.aba(GameCanvas.bba - fw.aqa.aaa(er.bia) / 2 - 12, this.ada + 7, fw.aqa.aaa(er.bia) + 22, 24, 6, 6);
      var1.aaa(fk.aba);
      var1.aaa(GameCanvas.bba - fw.aqa.aaa(er.bia) / 2 - 12, this.ada + 7, fw.aqa.aaa(er.bia) + 22, 24, 6, 6);
      fw.aqa.aaa(var1, er.bia, GameCanvas.bba, this.ada + 12, 2);
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
      if (++GameScr.aia > GameCanvas.aza * 3 + 100) {
         GameScr.aia = 100;
      }

      super.aba();
   }

   public final void aca() {
      if (GameCanvas.aka[2] || GameCanvas.aka[4] || GameCanvas.aka[6] || GameCanvas.aka[8]) {
         this.aea = this.aea == 0 ? 1 : 0;
      }

      if (GameCanvas.aoa && GameCanvas.aba(this.aca + 10, this.ada + 45, this.aaa - 10, 70)) {
         if (GameCanvas.ana) {
            this.aea = (GameCanvas.aqa - (this.ada + 45)) / 35;
         }

         this.aaa(1000, (Object)null);
      }

      super.aca();
      GameCanvas.aka();
   }

   public final void aaa(int var1, Object var2) {
      switch(var1) {
      case 1000:
         GameCanvas.bia = null;
         var1 = er.aea = this.aea == 0 ? 0 : 1;
         fd.aaa("indLanguage", var1);
         er.aaa();
         fd.aaa();
         GameCanvas.ada();
         GameCanvas.bfa.aaa();
      default:
      }
   }
}
