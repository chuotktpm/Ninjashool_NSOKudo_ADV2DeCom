public final class cg extends Auto {
   public cg() {
      super.a_();
      super.aha = gn.ala;
   }

   private static void aaa(fz var0) {
      if (var0 != null) {
         fz var1 = fz.ala();
         fz.aca(var0.ala, var0.ama);
         var1.dsa = var0;
         Thread.sleep(100L);
      }

   }

   protected final void aaa() {
      if (fz.ala().bba <= 0) {
         Auto.aaa(true);
      } else {
         if (gn.aoa == 33) {
            fz var1;
            if ((var1 = fz.ala()).aua != 17 || var1.cza.aaa >= var1.cza.aea.length - 1) {
               Code.aga();
               return;
            }

            if (var1.ada == null) {
               gf.aba(17, 0, 0);
               Thread.sleep(2000L);
               return;
            }

            if (ci.aaa(var1.ala, var1.ama, var1.ada.ala, var1.ada.ama) > 200) {
               aaa(var1.ada);
            }

            fz var2 = fz.ala();
            bc var3 = Auto.aqa;
            if (fz.eia) {
               for(int var4 = 0; var4 < var2.cwa.size(); ++var4) {
                  bc var5;
                  if ((var5 = (bc)var2.cwa.elementAt(var4)) != null && !var5.aaa() && var5.aaa.ada == 2 && (var5.aaa.aaa != 47 || var2.bba < var2.bea * fz.fra / 100)) {
                     boolean var6 = false;

                     for(int var7 = 0; var7 < var2.cxa.size(); ++var7) {
                        bu var8;
                        if ((var8 = (bu)var2.cxa.elementAt(var7)) != null && var8.aea.aca == var5.aaa.aea) {
                           var6 = true;
                           break;
                        }
                     }

                     if (!var6) {
                        var3 = var5;
                        Thread.sleep(500L);
                        break;
                     }
                  }
               }
            }

            label173: {
               if (var3.aaa.ada == 2) {
                  gm.aaa().ara();
               } else {
                  fz var12;
                  ev var13;
                  int var15;
                  fz var10000;
                  label170: {
                     if ((var12 = fz.ala()).ada != null) {
                        var13 = gf.bla;

                        for(var15 = 0; var15 < var13.size(); ++var15) {
                           fz var16;
                           if ((var16 = (fz)var13.elementAt(var15)) != null && var16.aqa != 14 && var16.aqa != 5 && var16.aqa != 15 && (var16.dla == 3 || var12.dla == 3 || var16.dla == 1 && var12.dla == 1 || var12.dza >= 0 && var12.dza == var16.asa || var12.dya >= 0 && var12.dya == var16.asa) && ci.aaa(var16.ala, var16.ama, var12.ada.ala, var12.ada.ama) < 200) {
                              var10000 = var16;
                              break label170;
                           }
                        }
                     }

                     var10000 = null;
                  }

                  var12 = var10000;
                  if (var10000 != null) {
                     if (ci.aaa(var12.ala, var12.ama, var2.ada.ala, var2.ada.ama) < 200 && (ci.aea(var2.ala - var12.ala) > var3.aga || ci.aea(var2.ama - var12.ama) > var3.aha)) {
                        aaa(var12);
                     }

                     gm.aaa().afa(var3.aaa.aaa);
                     Auto.aya.removeAllElements();
                     Auto.aza.removeAllElements();
                     Auto.aza.addElement(var12);
                     gm.aaa().aaa((ev)Auto.aya, (ev)Auto.aza, (int)2);
                  } else {
                     ac var18;
                     label128: {
                        if ((var12 = fz.ala()).ada != null) {
                           var13 = gf.bna;

                           for(var15 = 0; var15 < var13.size(); ++var15) {
                              ac var17;
                              if ((var17 = (ac)var13.elementAt(var15)) != null && var17.aba > 0 && var17.aga != 0 && var17.aga != 1 && ci.aaa(var17.ada, var17.aea, var12.ada.ala, var12.ada.ama) < 200) {
                                 var18 = var17;
                                 break label128;
                              }
                           }
                        }

                        var18 = null;
                     }

                     ac var14 = var18;
                     if (var18 == null) {
                        break label173;
                     }

                     if (ci.aaa(var14.ada, var14.aea, var2.ada.ala, var2.ada.ama) < 200 && (ci.aea(var2.ala - var14.ada) > var3.aga || ci.aea(var2.ama - var14.aea) > var3.aha)) {
                        this.aca(var14);
                     }

                     gm.aaa().afa(var3.aaa.aaa);
                     Auto.aya.removeAllElements();
                     Auto.aza.removeAllElements();
                     Auto.aya.addElement(var14);
                     gm.aaa().aaa((ev)Auto.aya, (ev)Auto.aza, (int)1);
                  }
               }

               if (System.currentTimeMillis() - var3.afa >= (long)var3.aea) {
                  var3.afa = System.currentTimeMillis();
                  var3.ala = true;
                  if (!Code.bfa) {
                     var2.aba(gf.aza[var3.aaa.aaa], 0);
                  }
               }
            }

            if (fz.ala().aza < fz.ala().baa * fz.fsa / 100) {
               fz.ala().aea(17);
            }

            if (fz.ala().bba < fz.ala().bea * fz.fra / 100) {
               int var9 = (int)(System.currentTimeMillis() / 1000L);

               for(int var10 = 0; var10 < fz.ala().cxa.size(); ++var10) {
                  bu var11;
                  if ((var11 = (bu)fz.ala().cxa.elementAt(var10)).aea.aaa == 21 && var11.aca - (var9 - var11.aba) >= 2) {
                     return;
                  }
               }

               fz.ala().aea(16);
               return;
            }
         } else {
            this.aaa(33, super.aha, -1, -1);
         }

      }
   }

   public final String toString() {
      return "Dẫn trẻ";
   }
}
