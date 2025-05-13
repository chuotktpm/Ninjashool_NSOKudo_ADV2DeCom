public final class dd extends fq {
   private String[] aba;
   public eq aaa;
   private int afa = 40;

   public dd() {
      if (GameCanvas.aza <= 176) {
         this.afa = 10;
      }

      this.aaa = new eq();
      this.aaa.aaa = this.afa + 10;
      this.aaa.aba = GameCanvas.baa - fb.aoa - 43;
      this.aaa.aca = GameCanvas.aza - 2 * (this.afa + 10);
      this.aaa.ada = fb.aoa + 2;
      this.aaa.aea = true;
      super.aea = this.aaa.ava;
   }

   public final void aaa(String var1, ca var2, int var3) {
      try {
         this.aaa.aaa("");
         this.aaa.ara = var3;
         this.aba = fw.aqa.aba(var1, GameCanvas.aza - (this.afa << 1));
         super.aca = new ca(er.bma, GameCanvas.aba(), 8882, (Object)null);
         super.ada = var2;
         if (super.aca != null) {
            super.aca.afa = GameCanvas.aza / 2 - 160;
            super.aca.aga = GameCanvas.baa - 26;
         }

         if (super.ada != null) {
            super.ada.afa = GameCanvas.aza / 2 - 35;
            super.ada.aga = GameCanvas.baa - 26;
         }

         if (super.aea != null) {
            super.aea.afa = GameCanvas.aza / 2 + 88;
            super.aea.aga = GameCanvas.baa - 26;
         }

         GameCanvas.bia = this;
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public final void aaa(as var1) {
      fk.aaa(var1, this.afa, GameCanvas.baa - 77 - fb.aqa, GameCanvas.aza - (this.afa << 1), 69, this.aba);
      this.aaa.aaa(var1);
      super.aaa(var1);
   }

   public final void aaa(int var1) {
      this.aaa.aaa(var1);
      super.aaa(var1);
   }

   public final void aaa() {
      this.aaa.ada();
      super.aaa();
   }
}
