public final class Npc extends Char {
   public cm template;
   public static cm[] arrNpcTemplate;

   public Npc(int var1, int var2, int var3, int var4) {
      super.cx = var2;
      super.cy = var3;
      super.aqa = var1;
      this.template = arrNpcTemplate[var4];
   }

   public static void aaa() {
      for(int var0 = 0; var0 < GameScr.boa.size(); ++var0) {
         Npc var1;
         (var1 = (Npc)GameScr.boa.elementAt(var0)).gza = null;
         var1.gya = -1;
      }

   }

   public final void aba() {
      if (super.gza == null) {
         label45: {
            label51: {
               byte[] var1 = new byte[]{-1, 9, 9, 10, 10, 11, 11};
               if (Char.getMyChar().aua >= 9 && Char.getMyChar().aua <= 10 && Char.getMyChar().cua.aaa > 0 && var1[Char.getMyChar().cua.aaa] == this.template.aaa) {
                  if (Char.getMyChar().cza != null) {
                     if (Char.getMyChar().cza == null || Char.getMyChar().cza.aaa + 1 != Char.getMyChar().cza.aea.length) {
                        break label45;
                     }

                     super.gza = GameScr.bca[62];
                     break label51;
                  }
               } else {
                  GameScr.ava();
                  byte var2 = GameScr.bna();
                  if (Char.getMyChar().cza != null || var2 != this.template.aaa) {
                     if (Char.getMyChar().cza == null || var2 != this.template.aaa) {
                        break label45;
                     }

                     if (Char.getMyChar().cza.aaa + 1 == Char.getMyChar().cza.aea.length) {
                        super.gza = GameScr.bca[62];
                        break label51;
                     }
                  }
               }

               super.gza = GameScr.bca[57];
            }

            super.gya = 0;
         }
      }

      super.aba();
   }

   public final void aaa(as var1) {
      if (this.axa() && super.aqa != 15) {
         if (super.dla != 0) {
            super.aaa(var1);
            return;
         }

         if (this.template != null) {
            if (this.template.aaa == 13) {
               if (Char.getMyChar().dra != null && Char.getMyChar().dra.equals(this)) {
                  fo.aaa(var1, 988, super.cx, super.cy - super.cja - 1, 0, 33);
               }

               fo.aaa(var1, 1060, super.cx, super.cy, 0, 33);
               fw.aka.aaa(var1, String.valueOf(TileMap.zoneID), super.cx, super.cy - 10 - 2 - fw.aia.aaa, 2);
               return;
            }

            if (this.template.aaa == 31) {
               if (Char.getMyChar().dra != null && Char.getMyChar().dra.equals(this)) {
                  fo.aaa(var1, 988, super.cx, super.cy - super.cja - 1, 0, 33);
               }

               fo.aaa(var1, 1291, super.cx, super.cy, 0, 33);
               return;
            }

            if (this.template.aaa == 27) {
               if (Char.getMyChar().dra != null && Char.getMyChar().dra.equals(this)) {
                  fo.aaa(var1, 988, super.cx, super.cy - super.cja - 1, 0, 33);
               }

               fo.aaa(var1, 1224, super.cx, super.cy, 0, 33);
               return;
            }

            fj var2 = GameScr.bba[this.template.aca];
            fj var3 = GameScr.bba[this.template.aea];
            fj var4 = GameScr.bba[this.template.ada];
            if (super.ara == 1) {
               fo.aaa(var1, var2.aaa[Char.gda[super.cma][0][0]].aaa, super.cx + Char.gda[super.cma][0][1] + var2.aaa[Char.gda[super.cma][0][0]].aba, super.cy - Char.gda[super.cma][0][2] + var2.aaa[Char.gda[super.cma][0][0]].aca, 0, 0);
               fo.aaa(var1, var3.aaa[Char.gda[super.cma][1][0]].aaa, super.cx + Char.gda[super.cma][1][1] + var3.aaa[Char.gda[super.cma][1][0]].aba, super.cy - Char.gda[super.cma][1][2] + var3.aaa[Char.gda[super.cma][1][0]].aca, 0, 0);
               fo.aaa(var1, var4.aaa[Char.gda[super.cma][2][0]].aaa, super.cx + Char.gda[super.cma][2][1] + var4.aaa[Char.gda[super.cma][2][0]].aba, super.cy - Char.gda[super.cma][2][2] + var4.aaa[Char.gda[super.cma][2][0]].aca, 0, 0);
            } else {
               fo.aaa(var1, var2.aaa[Char.gda[super.cma][0][0]].aaa, super.cx - Char.gda[super.cma][0][1] - var2.aaa[Char.gda[super.cma][0][0]].aba, super.cy - Char.gda[super.cma][0][2] + var2.aaa[Char.gda[super.cma][0][0]].aca, 2, 24);
               fo.aaa(var1, var3.aaa[Char.gda[super.cma][1][0]].aaa, super.cx - Char.gda[super.cma][1][1] - var3.aaa[Char.gda[super.cma][1][0]].aba, super.cy - Char.gda[super.cma][1][2] + var3.aaa[Char.gda[super.cma][1][0]].aca, 2, 24);
               fo.aaa(var1, var4.aaa[Char.gda[super.cma][2][0]].aaa, super.cx - Char.gda[super.cma][2][1] - var4.aaa[Char.gda[super.cma][2][0]].aba, super.cy - Char.gda[super.cma][2][2] + var4.aaa[Char.gda[super.cma][2][0]].aca, 2, 24);
            }

            if (super.gya >= 0 && super.gza != null && super.dla == 0) {
               fo.aaa(var1, super.gza.aba[super.gya].aca, super.cx + super.gza.aba[super.gya].aaa, super.cy + super.gza.aba[super.gya].aba, 0, 3);
               if (GameCanvas.aua % 2 == 0) {
                  ++super.gya;
                  if (super.gya >= super.gza.aba.length) {
                     super.gya = 0;
                  }
               }
            }

            if (Char.getMyChar().dra != null && Char.getMyChar().dra.equals(this)) {
               fw.ala.aaa(var1, this.template.aba, super.cx, super.cy - super.cja - fw.aia.aaa - 7, 2, fw.ama);
               fo.aaa(var1, 988, super.cx, super.cy - super.cja - 2, 0, 33);
               return;
            }

            fw.ala.aaa(var1, this.template.aba, super.cx, super.cy - super.cja - 3 - fw.aia.aaa, 2, fw.ama);
         }
      }

   }

   public static void aca() {
   }

   static {
      aa.aaa(6);
      aca();
   }

   public static void ada() {
      arrNpcTemplate = null;
   }
}
