public final class go extends Auto {
   private static boolean aaa;
   private static boolean aba;
   private long aca;
   private long ada;
   private long aea = 0L;
   private long bha;

   public final void aea() {
      super.a_();
      aaa = false;
      aba = false;
   }

   public final void aaa() {
      if (aka()) {
         if (gn.aoa == 160) {
            try {
               Thread.sleep(500L);
            } catch (InterruptedException var6) {
            }
         } else {
            Auto.aaa(true);
         }
      } else {
         int var2;
         String[] var3;
         int var4;
         av var11;
         if (!aaa && !aba) {
            if (gn.aoa == 110) {
               aaa = true;
               aba = false;
               return;
            }

            if (gn.aoa == Code.bqa && gn.ala == Code.bra) {
               var11 = gf.aia(0);
               if (fz.ala().ala == var11.ala && fz.ala().ama == var11.ama) {
                  for(var2 = 0; var2 < gf.bla.size(); ++var2) {
                     var3 = Code.aca(Code.bpa, ",");

                     for(var4 = 0; var4 < var3.length; ++var4) {
                        if (var3[var4].equals(((fz)gf.bla.elementAt(var2)).cea) && System.currentTimeMillis() - this.ada >= 5000L) {
                           gf.aba(0, 3, 0);
                           gm.aaa().aaa((short)11211, (String)var3[var4]);
                           ab.ama();
                           this.ada = System.currentTimeMillis();
                        }
                     }
                  }

                  return;
               }

               fz.aca(var11.ala, var11.ama);

               try {
                  Thread.sleep(1000L);
                  return;
               } catch (InterruptedException var7) {
                  return;
               }
            }

            if (gn.aoa != Code.bqa) {
               if (gn.aoa != 160 && gn.aoa != 129 && gn.aoa != 149) {
                  this.aaa(Code.bqa, Code.bra, -1, -1);
                  return;
               }

               try {
                  Thread.sleep(1000L);
               } catch (InterruptedException var10) {
               }

               Auto.ala();
            } else {
               Auto.aba(Code.bra);
            }
         } else if (aaa && !aba) {
            if (gn.aoa == 160) {
               this.aca = System.currentTimeMillis();
               aaa = true;
               aba = true;
               return;
            }

            if (gn.aoa == 110) {
               var11 = gf.aia(0);
               if (fz.ala().ala != var11.ala || fz.ala().ama != var11.ama) {
                  fz.aca(var11.ala, var11.ama);

                  try {
                     Thread.sleep(1000L);
                  } catch (InterruptedException var8) {
                  }

                  this.aea = System.currentTimeMillis();
                  return;
               }

               if (System.currentTimeMillis() - this.aea >= 3000L) {
                  gf.aba(0, 1, 0);
                  gm.aaa().aaa((short)11212, (String)String.valueOf(dm.aaa));
                  ab.ama();

                  try {
                     Thread.sleep(3000L);
                  } catch (InterruptedException var9) {
                  }

                  this.aea = System.currentTimeMillis();
               }
            }
         } else if (aaa && aba) {
            if (gn.aoa != 160) {
               aaa = false;
               aba = false;
               this.aca = System.currentTimeMillis();
               return;
            }

            if (System.currentTimeMillis() - this.aca >= 59000L) {
               fz var1 = null;

               for(var2 = 0; var2 < gf.bla.size(); ++var2) {
                  var3 = Code.aca(Code.bpa, ",");

                  for(var4 = 0; var4 < var3.length; ++var4) {
                     fz var5;
                     if ((var5 = (fz)gf.bla.elementAt(var2)).cea.equals(var3[var4])) {
                        var1 = var5;
                        break;
                     }
                  }
               }

               if (var1 == null) {
                  aaa = false;
                  aba = false;
                  this.aca = System.currentTimeMillis();
                  return;
               }

               if (Auto.aqa != null && var1.bba > 0) {
                  bc var12 = Auto.aqa;
                  fz var13 = fz.ala();
                  if (var12.aaa.ada == 2) {
                     gm.aaa().afa(var12.aaa.aaa);
                     gm.aaa().ara();
                  } else {
                     if ((var12.aaa.ada == 1 || var12.aaa.ada == 3) && (ci.aea(var13.ala - var1.ala) > var12.aga + 30 || ci.aea(var13.ama - var1.ama) > var12.aha + 30) && System.currentTimeMillis() - this.bha > 1500L) {
                        Auto.ada(var1);
                        this.bha = System.currentTimeMillis();
                     }

                     Auto.aya.removeAllElements();
                     Auto.aza.removeAllElements();
                     Auto.aza.addElement(var1);
                     gm.aaa().afa(var12.aaa.aaa);
                     gm.aaa().aaa((ev)Auto.aya, (ev)Auto.aza, (int)2);
                  }

                  if (System.currentTimeMillis() - var12.afa >= (long)var12.aea + 50L) {
                     var12.afa = System.currentTimeMillis();
                     var12.ala = true;
                     if (!Code.bfa) {
                        var13.aba(gf.aza[var12.aaa.aaa], 0);
                     }
                  }

                  super.baa = System.currentTimeMillis();
               }
            }
         }

      }
   }

   public final String toString() {
      return "Lôi win";
   }

   public static void afa() {
      aaa = false;
      aba = false;
   }

   static {
      aa.aaa(73);
      afa();
   }

   public static void aga() {
      aaa = false;
      aba = false;
   }
}
