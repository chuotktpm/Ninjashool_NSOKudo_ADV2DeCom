public final class ej extends Auto {
   private int aaa;
   private int aba;

   public ej(int var1) {
      super.a_();
      super.aga = var1;
      super.aha = -2;
      this.aaa = 0;
   }

   private static boolean aaa(gh var0) {
      if (var0.aba == 19) {
         return false;
      } else if (var0.aba != 16 && var0.aba != 17) {
         if (var0.aba == 26) {
            return var0.afa >= 6;
         } else if (var0.aaa()) {
            return var0.afa >= 70;
         } else if (var0.aba()) {
            return false;
         } else {
            if (var0.aba == 27) {
               if (var0.aaa == 38 || var0.aea.startsWith("Vật phẩm sự kiện") || var0.aea.startsWith("Vật phẩm Sự kiện")) {
                  return false;
               }

               if (var0.ada.startsWith("Sách võ công")) {
                  if (var0.afa == 100) {
                     return true;
                  }

                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   private static void aea() {
      Char var0 = Char.getMyChar();

      for(int var1 = 0; var1 < GameScr.bma.size(); ++var1) {
         am var2;
         if (aaa((var2 = (am)GameScr.bma.elementAt(var1)).aha) && ci.aaa(var0.cx, var0.cy, var2.aca, var2.ada) <= 100 && (Char.bja() > 2 || var2.aha.aia && Char.aja(var2.aha.aaa))) {
            Service.aaa().aoa(var2.aga);
            Thread.sleep(50L);
         }
      }

   }

   protected final boolean c_() {
      Char var1 = Char.getMyChar();

      for(int var2 = 0; var2 < GameScr.bma.size(); ++var2) {
         am var3;
         if (aaa((var3 = (am)GameScr.bma.elementAt(var2)).aha) && ci.aaa(var1.cx, var1.cy, var3.aca, var3.ada) <= 100 && (Char.bja() > 2 || var3.aha.aia && Char.aja(var3.aha.aaa))) {
            return true;
         }
      }

      return false;
   }

   private void afa() {
      Char var1 = Char.getMyChar();
      if (!Auto.aoa()) {
         ac var2 = var1.dpa;
         Char var3 = var1.dsa;
         if (Code.boa && (var3 == null || Code.aca(var3.cea) || !Auto.aaa(var1, var3))) {
            var3 = Auto.aea(var1);
         }

         int var4;
         if (var3 == null && var2 == null || !var2.axa || System.currentTimeMillis() - super.baa > 60000L) {
            ev var10 = GameScr.bna;
            var4 = 0;

            ac var10000;
            while(true) {
               if (var4 >= var10.size()) {
                  var10000 = null;
                  break;
               }

               ac var5;
               if ((var5 = (ac)var10.elementAt(var4)) != null && var5.axa && var5.ara != 223 && var5.aba > 0 && var5.aga != 0 && var5.aga != 1) {
                  var10000 = var5;
                  break;
               }

               ++var4;
            }

            var2 = var10000;
            if (var10000 == null && (System.currentTimeMillis() - super.baa > 60000L || System.currentTimeMillis() - super.baa > 10000L && !this.c_())) {
               Code.aca();
               return;
            }

            this.aca(var2);
         }

         int var6;
         Char var8;
         if (GameScr.bfa.size() > 0 && var1.cua.aaa == 6 && var1.bba > 0) {
            for(var4 = 0; var4 < var1.cwa.size(); ++var4) {
               bc var12;
               if ((var12 = (bc)var1.cwa.elementAt(var4)) != null && var12.aaa.ada == 4) {
                  if (!var12.aaa()) {
                     for(var6 = 0; var6 < GameScr.bfa.size(); ++var6) {
                        ep var7;
                        if ((var7 = (ep)GameScr.bfa.elementAt(var6)).aaa != var1.asa && var7.afa != null && var7.afa.bba <= 0) {
                           var8 = var7.afa;
                           if (Math.abs(var1.cx - var8.cx) > 50 || Math.abs(var1.cy - var8.cy) > 50) {
                              Char.charMove(var8.cx, var8.cy);
                           }

                           Thread.sleep(500L);
                           Service.aaa().aua(var7.aaa);
                           var12.afa = System.currentTimeMillis();
                           var12.ala = true;
                           var1.aba(GameScr.aza[var12.aaa.aaa], 0);
                           Thread.sleep(1000L);
                           return;
                        }
                     }
                  }
                  break;
               }
            }
         }

         if (Auto.aqa != null) {
            bc var11;
            int var13;
            int var15;
            if ((var11 = Auto.aqa).aaa() && Char.eia) {
               label518: {
                  var13 = 0;

                  bc var14;
                  label445:
                  while(true) {
                     if (var13 >= var1.cwa.size()) {
                        break label518;
                     }

                     if ((var14 = (bc)var1.cwa.elementAt(var13)) != null && System.currentTimeMillis() - var14.afa >= (long)var14.aea - 300L) {
                        if (var14.aaa.ada == 2) {
                           if ((var1.aca == null && Char.eja || var14.aaa.aaa < 67 || var14.aaa.aaa > 72) && (Char.eka || var14.aaa.aaa != 31) && (var14.aaa.aaa != 15 || var1.bba < var1.bea * Char.fra / 100 && var1.aea) && (var14.aaa.aaa != 6 || var1.aea)) {
                              var15 = (int)(System.currentTimeMillis() / 1000L);
                              int var16 = 0;

                              while(true) {
                                 if (var16 >= var1.cxa.size()) {
                                    break label445;
                                 }

                                 bu var9;
                                 if ((var9 = (bu)var1.cxa.elementAt(var16)) != null && (var9.aea.aca == var14.aaa.aea || var14.aaa.aaa == 58 && var9.aea.aba == 7) && var9.aca - (var15 - var9.aba) >= 2) {
                                    break;
                                 }

                                 ++var16;
                              }
                           }
                        } else if (var14.aaa.ada == 3 && var2 != null && var2.ava == 0 && var2.aba > var2.aca / 2) {
                           if (var14.aaa.aaa != 4 || Char.ela && var1.bba < var1.bea * Char.fra / 100) {
                              break;
                           }
                        } else if ((var14.aaa.aaa == 7 || var14.aaa.aaa == 16 || var14.aaa.aaa == 25 || var14.aaa.aaa == 34 || var14.aaa.aaa == 43) && var2 != null && (var2.ava != 0 || var2.aba >= var2.aca / 2) && (var14.aaa.aaa != 7 && var14.aaa.aaa != 16 || !var2.aoa) && (var14.aaa.aaa != 25 && var14.aaa.aaa != 34 || var2.apa) && (var14.aaa.aaa != 43 || var2.aqa)) {
                           break;
                        }
                     }

                     ++var13;
                  }

                  var11 = var14;
                  Thread.sleep(500L);
               }
            }

            Service.aaa().afa(var11.aaa.aaa);
            if (var11.aaa.ada == 2) {
               Service.aaa().ara();
            } else {
               ac var17;
               if (Code.boa && var3 != null && !Auto.aca(var3) && Auto.aaa(var1, var3)) {
                  var13 = var11.aga;
                  var6 = var11.aha;
                  Auto.aya.removeAllElements();
                  Auto.aza.removeAllElements();
                  Auto.aza.addElement(var3);

                  for(var15 = 0; var15 < GameScr.vCharInMap.size() && Auto.aya.size() + Auto.aza.size() < var11.aia; ++var15) {
                     if ((var8 = (Char)GameScr.vCharInMap.elementAt(var15)).bba > 0 && var8.aqa != 14 && var8.aqa != 5 && var8.aqa != 15 && !var8.equals(var3) && (var8.dla == 3 || var1.dla == 3 || var8.dla == 1 && var1.dla == 1 || var1.dza >= 0 && var1.dza == var8.asa || var1.dya >= 0 && var1.dya == var8.asa || var8.dza == var1.asa) && !Code.ada(var8.cea) && var3.cx - var13 <= var8.cx && var8.cx <= var3.cx + var13 && var3.cy - var6 <= var8.cy && var8.cy <= var3.cy + var6) {
                        Auto.aza.addElement(var8);
                     }
                  }

                  for(var15 = 0; var15 < GameScr.bna.size() && Auto.aya.size() + Auto.aza.size() < var11.aia; ++var15) {
                     if ((var17 = (ac)GameScr.bna.elementAt(var15)).aga != 0 && var17.aga != 1 && var17.axa && var3.cx - var13 <= var17.ada && var17.ada <= var3.cx + var13 && var3.cy - var6 <= var17.aea && var17.aea <= var3.cy + var6) {
                        Auto.aya.addElement(var17);
                     }
                  }

                  Service.aaa().aaa((ev)Auto.aya, (ev)Auto.aza, (int)2);
               } else {
                  if (var2 == null || var2 == null || !var2.axa || var2.aga == 0 || var2.aba <= 0) {
                     return;
                  }

                  if ((var11.aaa.ada == 1 || var11.aaa.ada == 3) && (ci.aea(var1.cx - var2.aha) > var11.aga + 30 || ci.aea(var1.cy - var2.aia) > var11.aha + 30)) {
                     this.aca(var2);
                  }

                  var13 = var11.aga;
                  var6 = var11.aha;
                  Auto.aya.removeAllElements();
                  Auto.aza.removeAllElements();
                  Auto.aya.addElement(var2);

                  for(var15 = 0; var15 < GameScr.bna.size() && Auto.aya.size() + Auto.aza.size() < var11.aia; ++var15) {
                     if ((var17 = (ac)GameScr.bna.elementAt(var15)).aga != 0 && var17.aga != 1 && !var17.equals(var2) && var17.axa && var2.aha - 100 <= var17.aha && var17.aha <= var2.aha + 100 && var2.aia - 50 <= var17.aia && var17.aia <= var2.aia + 50) {
                        Auto.aya.addElement(var17);
                     }
                  }

                  for(var15 = 0; var15 < GameScr.vCharInMap.size() && Auto.aya.size() + Auto.aza.size() < var11.aia; ++var15) {
                     if ((var8 = (Char)GameScr.vCharInMap.elementAt(var15)).bba > 0 && var8.aqa != 14 && var8.aqa != 5 && var8.aqa != 15 && (var8.dla == 3 || var1.dla == 3 || var8.dla == 1 && var1.dla == 1 || var1.dza >= 0 && var1.dza == var8.asa || var1.dya >= 0 && var1.dya == var8.asa || var8.dza == var1.asa) && !Code.ada(var8.cea) && var2.ada - var13 <= var8.cx && var8.cx <= var2.ada + var13 && var2.aea - var6 <= var8.cy && var8.cy <= var2.aea + var6) {
                        Auto.aza.addElement(var8);
                     }
                  }

                  Service.aaa().aaa((ev)Auto.aya, (ev)Auto.aza, (int)1);
               }
            }

            if (System.currentTimeMillis() - var11.afa >= (long)var11.aea) {
               var11.afa = System.currentTimeMillis();
               var11.ala = true;
               if (!Code.bfa) {
                  var1.aba(GameScr.aza[var11.aaa.aaa], 0);
               }
            }

            super.baa = System.currentTimeMillis();
            if (var11.aaa.aaa == 15) {
               Thread.sleep(2000L);
            }
         }

      }
   }

   public final void aaa() {
      if (Auto.aka()) {
         boolean var10000;
         if (!Char.eza) {
            var10000 = true;
         } else {
            label98: {
               label137: {
                  if (TileMap.mapID == super.aga && TileMap.zoneID == super.aha) {
                     int var5 = 0;

                     label91:
                     while(true) {
                        ep var7;
                        if (var5 >= GameScr.bfa.size()) {
                           var5 = 0;

                           while(true) {
                              if (var5 >= GameScr.bfa.size()) {
                                 break label137;
                              }

                              if ((var7 = (ep)GameScr.bfa.elementAt(var5)).afa != null) {
                                 if (var7.ada.equals(Char.getMyChar().cea)) {
                                    break label137;
                                 }
                                 break label91;
                              }

                              ++var5;
                           }
                        }

                        if ((var7 = (ep)GameScr.bfa.elementAt(var5)).afa != null && var7.afa.bba > 0) {
                           break;
                        }

                        ++var5;
                     }
                  }

                  var10000 = false;
                  break label98;
               }

               var10000 = true;
            }
         }

         if (!var10000) {
            Auto.aaa(true);
         }

      } else {
         Char var1 = Char.getMyChar();
         boolean var2 = Code.aha == null || var1.cea.equals(Code.aha);
         int var6;
         if (super.aha == -2) {
            if (super.aga != TileMap.mapID) {
               this.goMap(super.aga, -2, -1, -1);
               return;
            }

            if (var2) {
               this.aba = (this.aba - 1) % 30;
               if (this.aba < 15) {
                  this.aba = 29;
               }

               Auto.aba(this.aba);

               for(var6 = 0; var6 < GameScr.bna.size(); ++var6) {
                  ac var3;
                  if ((var3 = (ac)GameScr.bna.elementAt(var6)).axa && var3.aba > 0 && var3.aga != 0) {
                     Service.aaa().aka("pkm " + super.aga);
                     Service.aaa().aka("pkk " + (super.aha = TileMap.zoneID));
                     break;
                  }
               }

               if (this.aba == 15 && ++this.aaa == 2) {
                  Service.aaa().aka("pke");
                  Code.aca();
                  return;
               }
            }
         } else if (super.aga == TileMap.mapID && super.aha == TileMap.zoneID) {
            this.afa();
            aea();
            if (var1.aza < var1.baa * Char.fsa / 100) {
               var1.aea(17);
            }

            if (var1.bba < var1.bea * Char.fra / 100) {
               var6 = (int)(System.currentTimeMillis() / 1000L);

               for(int var8 = 0; var8 < var1.cxa.size(); ++var8) {
                  bu var4;
                  if ((var4 = (bu)var1.cxa.elementAt(var8)).aea.aaa == 21 && var4.aca - (var6 - var4.aba) >= 2) {
                     return;
                  }
               }

               Char.getMyChar().aea(16);
               return;
            }
         } else {
            this.goMap(super.aga, super.aha, super.aja, super.aka);
         }

      }
   }

   public final String toString() {
      return "PK Boss";
   }
}
