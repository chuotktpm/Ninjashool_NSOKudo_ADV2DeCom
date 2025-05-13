public final class dv extends Auto {
   public int aaa;
   public int aba;
   private int aca;
   private ev ada;
   private ev aea;
   private long bha;

   public dv(ev var1, ev var2, int var3) {
      this.aaa = 0;
      this.aba = -1;
      this.aca = var3;
      this.ada = var1;
      this.aea = var2;
   }

   public dv(int var1) {
      this.aaa = 1;
      this.aba = -1;
      this.aca = var1;
      this.bha = System.currentTimeMillis();
   }

   protected final void aaa() {
      if (Char.getMyChar().bba <= 0) {
         Auto.aaa(true);
      } else {
         switch(this.aaa) {
         case 0:
            if (TileMap.mapID == 38 && TileMap.zoneID == 21) {
               LockGame.bka();
               this.aaa = 2;
               return;
            }

            this.goMap(38, 21, -1, -1);
            return;
         case 1:
            if (System.currentTimeMillis() - this.bha > 180000L) {
               Code.aca();
               return;
            }

            if (TileMap.mapID != 38 || TileMap.zoneID != 21) {
               this.goMap(38, 21, -1, -1);
               return;
            }
            break;
         case 2:
            if (this.ada.size() > 0) {
               int var1 = this.ada.size() - 1;
               super.aga = (Integer)this.ada.elementAt(var1);
               this.aba = (Integer)this.aea.elementAt(var1);
               this.ada.removeElementAt(var1);
               this.aea.removeElementAt(var1);
               this.aaa = 3;
               Service.aaa().aka("pkms " + super.aga + " " + this.aba);
               return;
            }

            this.aaa = 4;
            Service.aaa().aka("pkes");
            return;
         case 3:
            if (this.aba > 0) {
               if (TileMap.mapID != this.aba) {
                  this.goMap(this.aba, -2, -1, -1);
                  return;
               }

               GameScr.PickNpc(5, 1, 0);
               if (LockGame.aza()) {
                  this.aaa = 5;
                  Code.aaa((Auto)(new ej(super.aga)));
                  return;
               }
            }
            break;
         case 4:
            if (this.aca > 0) {
               if (TileMap.mapID != this.aca) {
                  this.goMap(this.aca, -2, -1, -1);
                  return;
               }

               GameScr.PickNpc(5, 1, 0);
               if (LockGame.aza()) {
                  Code.aca();
                  return;
               }
            } else {
               this.aca = 22;
            }
            break;
         case 5:
            Thread.sleep(10000L);
            if (Code.aha != null && !Char.getMyChar().cea.equals(Code.aha)) {
               this.aaa = 1;
               this.bha = System.currentTimeMillis();
               return;
            } else {
               this.aaa = 2;
               return;
            }
         }

      }
   }

   public final String toString() {
      return "PKBoss S";
   }
}
