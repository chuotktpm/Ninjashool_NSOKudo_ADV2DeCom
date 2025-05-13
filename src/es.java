public final class es extends Auto {
   private boolean aaa;
   private boolean aba;
   private long aca = 0L;

   public final void aaa(int var1, int var2, boolean var3, boolean var4) {
      super.a_();
      super.aga = var1;
      super.aha = var2;
      super.aia = TileMap.aga(var1);
      this.aaa = var3;
      this.aba = var4;
      super.afa = true;
   }

   public final void aaa() {
      if (Auto.aka()) {
         Auto.aaa(true);
      } else {
         if (super.aga == TileMap.mapID && (TileMap.aga(super.aga) || super.aha == TileMap.zoneID)) {
            Char var1 = Char.getMyChar();
            int var4;
            int var5;
            int var6;
            Char var9;
            if (this.aba && (GameScr.bfa.size() > 1 || Code.aja.size() > 0) && var1.cua.aaa == 6) {
               for(int var2 = 0; var2 < var1.cwa.size(); ++var2) {
                  bc var3;
                  if ((var3 = (bc)var1.cwa.elementAt(var2)) != null && var3.aaa.ada == 4) {
                     if (System.currentTimeMillis() - this.aca > 3000L) {
                        for(var4 = 0; var4 < GameScr.bfa.size(); ++var4) {
                           ep var8;
                           if ((var8 = (ep)GameScr.bfa.elementAt(var4)).aaa != var1.asa && var8.afa != null && var8.afa.bba <= 0) {
                              var5 = var1.cx;
                              var6 = var1.cy;
                              Char var14;
                              Char.charMove((var14 = var8.afa).cx, var14.cy);
                              Thread.sleep(500L);
                              if (Auto.aca(var14)) {
                                 this.aca = System.currentTimeMillis();
                                 Service.aaa().aua(var8.aaa);
                                 var3.afa = System.currentTimeMillis();
                                 var3.ala = true;
                                 var1.aba(GameScr.aza[var3.aaa.aaa], 0);
                                 Thread.sleep(1000L);
                              }

                              Char.charMove(var5, var6);
                              return;
                           }
                        }

                        for(var4 = 0; var4 < GameScr.vCharInMap.size(); ++var4) {
                           if ((var9 = (Char)GameScr.vCharInMap.elementAt(var4)) != null && Auto.aca(var9) && Code.aaa(var9.cea)) {
                              var5 = var1.cx;
                              var6 = var1.cy;
                              Char.charMove(var9.cx, var9.cy);
                              Thread.sleep(500L);
                              if (Auto.aca(var9)) {
                                 this.aca = System.currentTimeMillis();
                                 Service.aaa().aua(var9.asa);
                                 var3.afa = System.currentTimeMillis();
                                 var3.ala = true;
                                 var1.aba(GameScr.aza[var3.aaa.aaa], 0);
                                 Thread.sleep(1000L);
                              }

                              Char.charMove(var5, var6);
                              return;
                           }
                        }
                     }
                     break;
                  }
               }
            }

            var9 = GameScr.bfa.size() > 0 ? ((ep)GameScr.bfa.firstElement()).afa : null;
            if (this.aaa && this.ama() && var9 != null && var1.cua.aaa == 6) {
               for(int var10 = 0; var10 < var1.cwa.size(); ++var10) {
                  bc var15;
                  if ((var15 = (bc)var1.cwa.elementAt(var10)) != null && !var15.aaa() && var15.aaa.ada == 2 && (var15.aaa.aaa < 67 || var15.aaa.aaa > 72) && (var15.aaa.aaa != 47 || var9.bba < var9.bea * Char.fra / 100)) {
                     for(var5 = 0; var5 < var9.cxa.size(); ++var5) {
                        var9.cxa.elementAt(var5);
                     }

                     var5 = var1.cx;
                     var6 = var1.cy;
                     Char.charMove(var9.cx, var9.cy);
                     Service.aaa().afa(var15.aaa.aaa);
                     Service.aaa().ara();
                     var15.afa = System.currentTimeMillis();
                     var15.ala = true;
                     var1.aba(GameScr.aza[var15.aaa.aaa], 0);
                     Thread.sleep(1000L);
                     Char.charMove(var5, var6);
                     return;
                  }
               }
            }

            if (Code.boa) {
               Char var12;
               if (((var12 = var1.dsa) == null || !ff.aca(var12.cea) && !Auto.aaa(var1, var12)) && (var12 = this.aaa((Char)var1, -1)) == null) {
                  var12 = Auto.aea(var1);
               }

               boolean var16 = var12 != null && ff.aca(var12.cea);
               if (var12 == null && super.bda) {
                  Service.aaa().awa(0);
                  super.bda = false;
               }

               if (var1.dka >= 5 && System.currentTimeMillis() - super.bca > 5000L) {
                  gg var11;
                  if ((var11 = Char.afa(257)) != null && var11.aaa.aaa == 257) {
                     Service.aaa().aea(var11.ada);
                  }

                  super.bca = System.currentTimeMillis();
               }

               if (var12 != null && var12 != null && !Auto.aca(var12) && (var16 || Auto.aaa(var1, var12))) {
                  bc var13 = Auto.aqa;
                  if (var16) {
                     if ((var13.aaa.ada == 1 || var13.aaa.ada == 3) && (ci.aea(var1.cx - var12.cx) > var13.aga + 30 || ci.aea(var1.cy - var12.cy) > var13.aha + 30) && System.currentTimeMillis() - super.bba > 1500L) {
                        Auto.ada(var12);
                        super.bba = System.currentTimeMillis();
                     }

                     if (var12.dza != var1.asa && var12.dla != 3) {
                        super.bda = true;
                        Service.aaa().awa(3);
                     }
                  }

                  var5 = var13.aga;
                  var6 = var13.aha;
                  Auto.aya.removeAllElements();
                  Auto.aza.removeAllElements();
                  Auto.aza.addElement(var12);

                  for(var4 = 0; var4 < GameScr.vCharInMap.size() && Auto.aya.size() + Auto.aza.size() < var13.aia; ++var4) {
                     Char var7;
                     if ((var7 = (Char)GameScr.vCharInMap.elementAt(var4)).bba > 0 && var7.aqa != 14 && var7.aqa != 5 && var7.aqa != 15 && !var7.equals(var12) && (var7.dla == 3 || var1.dla == 3 || var7.dla == 1 && var1.dla == 1 || var1.dza >= 0 && var1.dza == var7.asa || var1.dya >= 0 && var1.dya == var7.asa) && !Code.ada(var7.cea) && var12.cx - var5 <= var7.cx && var7.cx <= var12.cx + var5 && var12.cy - var6 <= var7.cy && var7.cy <= var12.cy + var6) {
                        Auto.aza.addElement(var7);
                     }
                  }

                  Service.aaa().aaa((ev)Auto.aya, (ev)Auto.aza, (int)2);
                  if (System.currentTimeMillis() - var13.afa >= (long)var13.aea) {
                     var13.afa = System.currentTimeMillis();
                     var13.ala = true;
                     if (!Code.bfa) {
                        var1.aba(GameScr.aza[var13.aaa.aaa], 0);
                     }
                  }

                  super.baa = System.currentTimeMillis();
                  return;
               }
            }
         } else {
            this.goMap(super.aga, super.aha, -1, -1);
         }

      }
   }

   public final String toString() {
      if (this.aaa && this.aba) {
         return "Buff HS Xa";
      } else {
         return this.aba ? "HSinh Xa" : "Buff Xa";
      }
   }
}
