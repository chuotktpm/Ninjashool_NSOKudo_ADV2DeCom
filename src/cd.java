public final class cd {
   private int aaa;
   private int aba;
   private int aca;
   private int ada;
   private int aea;
   private int afa;
   private int aga;
   private Char aha;
   private int[] aia;
   private int[] aja;
   private int[] aka;

   public cd(int var1, int var2, Char var3) {
      this.aaa = var1;
      this.aba = var2;
      this.aca = var1;
      this.ada = var2 - (ci.ada(40) + 20);
      this.aea = 1;
      this.aga = 1;
      this.aha = var3;
   }

   public cd(int var1, int var2) {
      this.aea = 1;
      this.aga = 2;
      this.aca = var1;
      this.ada = var2;
      this.aia = new int[5];
      this.aja = new int[5];
      this.aka = new int[5];
      this.afa = 300;

      for(int var3 = 0; var3 < this.aia.length; ++var3) {
         this.aia[var3] = ci.aba(var1 - 20, var1 + 20);
         this.aja[var3] = var2 - 10;
         this.aka[var3] = var3 % 2 == 0 ? 1 : -1;
      }

   }

   public final void aaa() {
      if (this.aga == 1) {
         if (this.aha == null) {
            GameScr.bda.removeElement(this);
            return;
         }

         if (this.aea == 1) {
            if (this.aba > this.ada) {
               this.aba -= 2;
               this.aaa += 1 - GameCanvas.aua % 3;
            } else {
               this.aea = 2;
            }

            this.afa = 100;
            return;
         }

         --this.afa;
         if (ci.aea(this.aha.cx - this.aaa) >= 50 && ci.aea(this.aha.cy - this.aba) >= 50) {
            this.aaa += (this.aha.cx - this.aaa) / 10;
            this.aba += (this.aha.cy - this.aba) / 10;
         } else {
            this.aaa += (this.aha.cx - this.aaa) / 4;
            this.aba += (this.aha.cy - this.aba) / 4;
         }

         if (this.afa < 0) {
            this.aaa = this.aha.cx;
            this.aba = this.aha.cy - this.aha.cja / 2;
            if (this.afa < -5) {
               GameScr.bda.removeElement(this);
               return;
            }
         } else if (ci.aea(this.aha.cx - this.aaa) < 10 && ci.aea(this.aha.cy - this.aba) < 10) {
            GameScr.bda.removeElement(this);
            return;
         }
      } else if (this.aga == 2) {
         for(int var1 = 0; var1 < this.aia.length; ++var1) {
            int[] var10000 = this.aja;
            var10000[var1] -= GameCanvas.aua % 5;
            int var10002;
            if (this.aka[var1] == -1) {
               var10002 = this.aia[var1]--;
            } else {
               var10002 = this.aia[var1]++;
            }

            if (this.aia[var1] <= this.aca - 20 || this.aia[var1] >= this.aca + 20) {
               int[] var2 = this.aka;
               var2[var1] = -var2[var1];
            }

            if (this.aja[var1] < 0) {
               GameScr.bda.removeElement(this);
            }
         }
      }

   }

   public final void aaa(as var1) {
      if (this.aga == 1) {
         if (GameCanvas.aua % 5 > 2) {
            fo.aaa(var1, 1433, this.aaa, this.aba, 0, 3);
         } else {
            fo.aaa(var1, 1434, this.aaa, this.aba, 0, 3);
         }
      } else {
         for(int var2 = 0; var2 < this.aia.length; ++var2) {
            if (GameCanvas.aua % 5 > 2) {
               fo.aaa(var1, 1433, this.aia[var2], this.aja[var2], 0, 3);
            } else {
               fo.aaa(var1, 1434, this.aia[var2], this.aja[var2], 0, 3);
            }
         }

      }
   }
}
