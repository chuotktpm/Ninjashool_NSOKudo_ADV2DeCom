public final class dq extends fq {
   private String[] afa;
   public boolean aaa;
   public int aba;
   private int aga;
   private int aha = 30;

   public dq() {
      if (GameCanvas.aza <= 176) {
         this.aha = 10;
      }

   }

   public final void aba() {
      this.aaa(er.bda, (ca)null, (ca)null, (ca)null);
      GameCanvas.bia = this;
   }

   public final void aaa(String var1, ca var2, ca var3, ca var4) {
      this.afa = fw.aqa.aba(var1, GameCanvas.aza - ((this.aha << 1) + 40));
      super.aca = var2;
      super.ada = var3;
      super.aea = var4;
      if (var3 != null) {
         super.ada.afa = GameCanvas.aza / 2 - 35;
         super.ada.aga = GameCanvas.baa - 26;
         if (var2 != null) {
            super.aca.afa = GameCanvas.aza / 2 - 115;
            super.aca.aga = GameCanvas.baa - 26;
         }

         if (var4 != null) {
            super.aea.afa = GameCanvas.aza / 2 + 45;
            super.aea.aga = GameCanvas.baa - 26;
         }
      } else {
         if (var2 != null) {
            super.aca.afa = GameCanvas.aza / 2 - 80;
            super.aca.aga = GameCanvas.baa - 26;
         }

         if (var4 != null) {
            super.aea.afa = GameCanvas.aza / 2 + 10;
            super.aea.aga = GameCanvas.baa - 26;
         }
      }

      this.aaa = false;
      this.aga = 80;
      if (this.afa.length >= 5) {
         this.aga = this.afa.length * fw.aqa.aaa + 20;
      }

   }

   public final void aaa(as var1) {
      int var2 = GameCanvas.baa - this.aga - 38;
      fk.aaa(this.aha, var2, GameCanvas.aza - (this.aha << 1), this.aga, var1);
      var2 = var2 + (this.aga - this.afa.length * fw.aqa.aaa) / 2 - 2;
      if (this.aaa) {
         var2 += 8;
         GameCanvas.aaa(GameCanvas.bba, var2 - 12, var1);
      }

      for(int var3 = 0; var3 < this.afa.length; var2 += fw.aqa.aaa) {
         fw.aqa.aaa(var1, this.afa[var3], GameCanvas.bba, var2, 2);
         ++var3;
      }

      super.aaa(var1);
   }

   public final void aaa() {
      if (this.aba > 0) {
         --this.aba;
         if (this.aba == 1) {
            GameCanvas.ama();
            this.aba = 0;
         }
      }

      super.aaa();
   }
}
