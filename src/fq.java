public abstract class fq {
   public ca aca;
   public ca ada;
   public ca aea;

   public void aaa(as var1) {
      var1.aaa(-var1.aba(), -var1.aca());
      var1.ada(0, 0, GameCanvas.aza, GameCanvas.baa);
      fk.aaa(var1);
      fk.aaa(var1, this.aca, this.ada, this.aea);
   }

   public void aaa(int var1) {
      switch(var1) {
      case -39:
      case -2:
         GameCanvas.ala[8] = true;
         GameCanvas.aka[8] = true;
         return;
      case -38:
      case -1:
         GameCanvas.ala[2] = true;
         GameCanvas.aka[2] = true;
         return;
      case -22:
      case -7:
         GameCanvas.ala[13] = true;
         GameCanvas.aka[13] = true;
         return;
      case -21:
      case -6:
         GameCanvas.ala[12] = true;
         GameCanvas.aka[12] = true;
         return;
      case -5:
      case 10:
         GameCanvas.ala[5] = true;
         GameCanvas.aka[5] = true;
         return;
      default:
      }
   }

   public void aaa() {
      if (this.ada != null && (GameCanvas.aka[5] || fb.aaa(this.ada))) {
         GameCanvas.aka[5] = false;
         GameCanvas.ana = false;
         fb.ara = -1;
         GameCanvas.aoa = false;
         if (this.ada != null) {
            this.ada.aaa();
         }

         fb.ara = -1;
      }

      if (this.aca != null && (GameCanvas.aka[12] || fb.aaa(this.aca))) {
         GameCanvas.aka[12] = false;
         GameCanvas.ana = false;
         fb.ara = -1;
         GameCanvas.aoa = false;
         if (this.aca != null) {
            this.aca.aaa();
         }

         fb.ara = -1;
      }

      if (this.aea != null && (GameCanvas.aka[13] || fb.aaa(this.aea))) {
         GameCanvas.aka[13] = false;
         GameCanvas.ana = false;
         GameCanvas.aoa = false;
         fb.ara = -1;
         if (this.aea != null) {
            this.aea.aaa();
         }

         fb.ara = -1;
      }

      GameCanvas.aka();
      GameCanvas.ala();
   }
}
