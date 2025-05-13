public final class bj extends Auto {
   private int aaa;
   private int aba;
   private boolean[] aca;

   public bj() {
      super.a_();
      super.aga = 157;
      super.aia = true;
      super.aha = -2;
      this.aaa = 199;
      this.aba = 0;
      this.aca = new boolean[3];
   }

   public final void aaa() {
      if (Auto.aka()) {
         Auto.aaa(true);
      } else if (super.aga != gn.aoa) {
         this.aaa(super.aga, super.aha, super.aja, super.aka);
      } else {
         fz var2 = fz.ala();
         if (!Auto.aoa()) {
            label387: {
               ac var3;
               int var5;
               ac var6;
               if ((var3 = var2.dpa) == null || var3.aga == 0 || !var3.axa || System.currentTimeMillis() - super.baa > 5000L) {
                  bj var10 = this;
                  ev var4 = GameScr.bna;
                  var5 = 0;

                  ac var10000;
                  while(true) {
                     if (var5 >= var4.size()) {
                        var10000 = null;
                        break;
                     }

                     if ((var6 = (ac)var4.elementAt(var5)) != null && var6.aba > 0 && var6.aga != 0 && var6.aga != 1 && var6.ara == var10.aaa && var6.ava == var10.aba) {
                        var10000 = var6;
                        break;
                     }

                     ++var5;
                  }

                  var3 = var10000;
                  if (var10000 == null && System.currentTimeMillis() - super.baa > 1000L && !this.c_()) {
                     var4 = GameScr.bna;
                     var5 = 0;

                     boolean var18;
                     while(true) {
                        if (var5 >= var4.size()) {
                           var18 = true;
                           break;
                        }

                        if ((var6 = (ac)var4.elementAt(var5)) != null && var6.aba > 0 && var6.aga != 0 && var6.aga != 1) {
                           var18 = false;
                           break;
                        }

                        ++var5;
                     }

                     if (var18) {
                        this.aca[this.aaa - 198] = true;
                        if (this.aca[0] && this.aca[1] && this.aca[2]) {
                           Code.aca();
                           break label387;
                        }
                     }

                     switch(this.aaa) {
                     case 198:
                        this.aaa = 199;
                        super.aga = 157;
                        if (this.aba == 0) {
                           this.aba = 4;
                        }
                        break label387;
                     case 199:
                        this.aaa = 200;
                        super.aga = 158;
                        break label387;
                     case 200:
                        this.aaa = 198;
                        super.aga = 159;
                     default:
                        break label387;
                     }
                  }
               }

               if (fz.fla && GameScr.bfa.size() > 0 && var2.cua.aaa == 6 && var2.bba > 0) {
                  for(int var11 = 0; var11 < var2.cwa.size(); ++var11) {
                     bc var13;
                     if ((var13 = (bc)var2.cwa.elementAt(var11)) != null && var13.aaa.ada == 4) {
                        if (!var13.aaa()) {
                           for(int var14 = 0; var14 < GameScr.bfa.size(); ++var14) {
                              ep var7;
                              if ((var7 = (ep)GameScr.bfa.elementAt(var14)).aaa != var2.asa && var7.afa != null && var7.afa.bba <= 0) {
                                 fz var8 = var7.afa;
                                 if (Math.abs(var2.ala - var8.ala) > 50 || Math.abs(var2.ama - var8.ama) > 50) {
                                    fz.aca(var8.ala, var8.ama);
                                 }

                                 Thread.sleep(500L);
                                 Service.aaa().aua(var7.aaa);
                                 var13.afa = System.currentTimeMillis();
                                 var13.ala = true;
                                 var2.aba(GameScr.aza[var13.aaa.aaa], 0);
                                 Thread.sleep(1000L);
                                 break label387;
                              }
                           }
                        }
                        break;
                     }
                  }
               }

               if (Auto.aqa != null && var3 != null && var3.axa && var3.ara == this.aaa && var3.ava == this.aba) {
                  bc var12;
                  if ((var12 = Auto.aqa).aaa() && fz.eia) {
                     label371: {
                        var5 = 0;

                        bc var15;
                        label266:
                        while(true) {
                           if (var5 >= var2.cwa.size()) {
                              break label371;
                           }

                           if ((var15 = (bc)var2.cwa.elementAt(var5)) != null && System.currentTimeMillis() - var15.afa >= (long)var15.aea - 300L) {
                              if (var15.aaa.ada == 2) {
                                 if ((var2.aca == null && fz.eja || var15.aaa.aaa < 67 || var15.aaa.aaa > 72) && (fz.eka || var15.aaa.aaa != 31) && (var15.aaa.aaa != 15 || var2.bba < var2.bea * fz.fra / 100)) {
                                    int var16 = (int)(System.currentTimeMillis() / 1000L);
                                    int var17 = 0;

                                    while(true) {
                                       if (var17 >= var2.cxa.size()) {
                                          break label266;
                                       }

                                       bu var9;
                                       if ((var9 = (bu)var2.cxa.elementAt(var17)) != null && (var9.aea.aca == var15.aaa.aea || var15.aaa.aaa == 58 && var9.aea.aba == 7) && var9.aca - (var16 - var9.aba) >= 2) {
                                          break;
                                       }

                                       ++var17;
                                    }
                                 }
                              } else if (var15.aaa.ada == 3 && var3.ava == 0 && var3.aba > var3.aca / 2) {
                                 if (var15.aaa.aaa != 4 || fz.ela && var2.bba < var2.bea * fz.fra / 100) {
                                    break;
                                 }
                              } else if ((var15.aaa.aaa == 7 || var15.aaa.aaa == 16 || var15.aaa.aaa == 25 || var15.aaa.aaa == 34 || var15.aaa.aaa == 43) && (var3.ava != 0 || var3.aba >= var3.aca / 2) && (var15.aaa.aaa != 7 && var15.aaa.aaa != 16 || !var3.aoa) && (var15.aaa.aaa != 25 && var15.aaa.aaa != 34 || var3.apa) && (var15.aaa.aaa != 43 || var3.aqa)) {
                                 break;
                              }
                           }

                           ++var5;
                        }

                        var12 = var15;
                        Thread.sleep(500L);
                     }
                  }

                  if ((var12.aaa.ada == 1 || var12.aaa.ada == 3) && (ci.aea(var2.ala - var3.aha) > var12.aga || ci.aea(var2.ama - var3.aia) > var12.aha)) {
                     this.aca(var3);
                  }

                  Service.aaa().afa(var12.aaa.aaa);
                  if (var12.aaa.ada == 2) {
                     Service.aaa().ara();
                  } else {
                     Auto.aya.removeAllElements();
                     Auto.aza.removeAllElements();
                     if (var3 != null) {
                        Auto.aya.addElement(var3);

                        for(var5 = 0; var5 < GameScr.bna.size() && Auto.aya.size() + Auto.aza.size() < var12.aia; ++var5) {
                           if ((var6 = (ac)GameScr.bna.elementAt(var5)).aga != 0 && var6.aga != 1 && !var6.equals(var3) && var3.aha - 100 <= var6.aha && var6.aha <= var3.aha + 100 && var3.aia - 50 <= var6.aia && var6.aia <= var3.aia + 50) {
                              Auto.aya.addElement(var6);
                           }
                        }
                     }

                     Service.aaa().aaa((ev)Auto.aya, (ev)Auto.aza, (int)1);
                  }

                  if (System.currentTimeMillis() - var12.afa >= (long)var12.aea) {
                     var12.afa = System.currentTimeMillis();
                     var12.ala = true;
                     if (!Code.bfa) {
                        var2.aba(GameScr.aza[var12.aaa.aaa], 0);
                     }
                  }

                  super.baa = System.currentTimeMillis();
                  if (var12.aaa.aaa == 15) {
                     Thread.sleep(2000L);
                  }
               }
            }
         }

         this.ada(-1);
      }
   }

   public final String toString() {
      return "Hang 9x Lvl " + this.aba;
   }
}
