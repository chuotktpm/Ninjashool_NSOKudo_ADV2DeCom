public final class TuDanh extends Auto {
   public final void a_() {
      super.a_();
      super.aga = TileMap.mapID;
      super.aha = TileMap.zoneID;
      super.aja = Char.getMyChar().cx;
      super.aka = Char.getMyChar().cy;
   }

   public final void aaa() {
      if (Auto.aka()) {
         if (Char.eza) {
            Auto.aaa(true);
         }
      } else {
         if (!Auto.apa && Char.getMyChar().aea) {
            this.ana();
            return;
         }

         if (TanSat.aba && !(Code.aba instanceof ADV)) {
            Char var1 = Char.getMyChar();

            for(int var2 = 0; var2 < var1.arrItemBag.length; ++var2) {
               gg var3;
               if (Code.ada(var3 = var1.arrItemBag[var2])) {
                  Service.aaa().aha(var3.ada, 1);
                  return;
               }
            }
         }

         if (super.aga == TileMap.mapID && (super.aia || super.aha == TileMap.zoneID)) {
            this.ada(-1);
            this.aca(-1, -1);
            return;
         }

         if (Char.eza) {
            this.goMap(super.aga, super.aha, super.aja, super.aka);
         }
      }

   }

   protected final ac aaa(Char var1, int var2, int var3, Char var4, boolean var5) {
      if (Code.ara && Code.ata.size() > 0) {
         this.aaa(var3, var5);
         return Auto.aba(var1.cx, var1.cy);
      } else {
         return Auto.aba(var1.cx, var1.cy);
      }
   }

   public final String toString() {
      return "Tự đánh";
   }
}
