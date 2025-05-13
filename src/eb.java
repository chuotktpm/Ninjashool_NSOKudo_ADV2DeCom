public final class eb {
   private int aba;
   private int aca;
   public int aaa = 0;
   private int ada;
   private int aea = 0;

   public eb(int var1, int var2, int var3) {
      this.aba = var1;
      this.aca = var2;
      this.ada = var3;
   }

   public final void aaa() {
      if (this.ada == 1) {
         ++this.aea;
         if (this.aea % 2 == 0) {
            ++this.aaa;
            return;
         }
      } else {
         if (this.ada == 0) {
            ++this.aaa;
            return;
         }

         if (this.ada == 2 || this.ada == 3 || this.ada == 4 || this.ada == 5) {
            ++this.aea;
            if (this.aea % 2 == 0) {
               ++this.aaa;
            }
         }
      }

   }

   public final void aaa(as var1) {
      if (this.ada == 0) {
         var1.aaa(GameScr.faa, 0, this.aaa * 3, 3, 3, 0, this.aba, this.aca, 0);
      } else if (this.ada == 1) {
         var1.aaa(GameScr.fba, 0, this.aaa * 20, 20, 20, 0, this.aba, this.aca, 33);
      } else if (this.ada == 2) {
         var1.aaa(GameScr.fta, 0, this.aaa * 15, 14, 15, 0, this.aba + 20, this.aca + 4, 20);
      } else if (this.ada == 3) {
         var1.aaa(GameScr.fqa, 0, this.aaa << 3, 8, 8, 0, this.aba + 20, this.aca + 4, 20);
      } else if (this.ada == 4) {
         var1.aaa(GameScr.fra, 0, this.aaa << 3, 8, 8, 0, this.aba + 20, this.aca + 4, 20);
      } else {
         if (this.ada == 5) {
            var1.aaa(GameScr.fsa, 0, this.aaa * 14, 14, 14, 0, this.aba + 20, this.aca + 4, 20);
         }

      }
   }
}
