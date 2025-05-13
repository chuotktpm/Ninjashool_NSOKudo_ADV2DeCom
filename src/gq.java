public class gq extends Auto {
   public final void aaa(int var1, int var2) {
      super.a_();
      super.aga = var1;
      super.aha = var2;
      super.aia = TileMap.aga(var1);
   }

   protected void aaa() {
      if (Auto.aka()) {
         if (Char.eza) {
            Auto.aaa(true);
         }
      } else if (super.aga != TileMap.mapID || !super.aia && super.aha != TileMap.zoneID) {
         this.goMap(super.aga, super.aha, super.aja, super.aka);
      } else {
         this.ada(-1, this.aaa(Char.fga, Char.fha, Char.fia));
         this.ada(-1);
      }

   }

   public final String toString() {
      return "Tự đánh người";
   }
}
