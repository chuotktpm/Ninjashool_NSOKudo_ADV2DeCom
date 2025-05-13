public final class AutoLoiDai extends Auto {
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
         if (TileMap.mapID == 160) {
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
         Npc var11;
         if (!aaa && !aba) {
            if (TileMap.mapID == 110) {
               aaa = true;
               aba = false;
               return;
            }

            if (TileMap.mapID == Code.bqa && TileMap.zoneID == Code.bra) {
               var11 = GameScr.findNpc(0);
               if (Char.getMyChar().cx == var11.cx && Char.getMyChar().cy == var11.cy) {
                  for(var2 = 0; var2 < GameScr.vCharInMap.size(); ++var2) {
                     var3 = Code.aca(Code.bpa, ",");

                     for(var4 = 0; var4 < var3.length; ++var4) {
                        if (var3[var4].equals(((Char)GameScr.vCharInMap.elementAt(var2)).cea) && System.currentTimeMillis() - this.ada >= 5000L) {
                           GameScr.PickNpc(0, 3, 0);
                           Service.aaa().aaa((short)11211, (String)var3[var4]);
                           GameCanvas.ama();
                           this.ada = System.currentTimeMillis();
                        }
                     }
                  }

                  return;
               }

               Char.charMove(var11.cx, var11.cy);

               try {
                  Thread.sleep(1000L);
                  return;
               } catch (InterruptedException var7) {
                  return;
               }
            }

            if (TileMap.mapID != Code.bqa) {
               if (TileMap.mapID != 160 && TileMap.mapID != 129 && TileMap.mapID != 149) {
                  this.goMap(Code.bqa, Code.bra, -1, -1);
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
            if (TileMap.mapID == 160) {
               this.aca = System.currentTimeMillis();
               aaa = true;
               aba = true;
               return;
            }

            if (TileMap.mapID == 110) {
               var11 = GameScr.findNpc(0);
               if (Char.getMyChar().cx != var11.cx || Char.getMyChar().cy != var11.cy) {
                  Char.charMove(var11.cx, var11.cy);

                  try {
                     Thread.sleep(1000L);
                  } catch (InterruptedException var8) {
                  }

                  this.aea = System.currentTimeMillis();
                  return;
               }

               if (System.currentTimeMillis() - this.aea >= 3000L) {
                  GameScr.PickNpc(0, 1, 0);
                  Service.aaa().aaa((short)11212, (String)String.valueOf(dm.aaa));
                  GameCanvas.ama();

                  try {
                     Thread.sleep(3000L);
                  } catch (InterruptedException var9) {
                  }

                  this.aea = System.currentTimeMillis();
               }
            }
         } else if (aaa && aba) {
            if (TileMap.mapID != 160) {
               aaa = false;
               aba = false;
               this.aca = System.currentTimeMillis();
               return;
            }

            if (System.currentTimeMillis() - this.aca >= 59000L) {
               Char var1 = null;

               for(var2 = 0; var2 < GameScr.vCharInMap.size(); ++var2) {
                  var3 = Code.aca(Code.bpa, ",");

                  for(var4 = 0; var4 < var3.length; ++var4) {
                     Char var5;
                     if ((var5 = (Char)GameScr.vCharInMap.elementAt(var2)).cea.equals(var3[var4])) {
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
                  Char var13 = Char.getMyChar();
                  if (var12.aaa.ada == 2) {
                     Service.aaa().afa(var12.aaa.aaa);
                     Service.aaa().ara();
                  } else {
                     if ((var12.aaa.ada == 1 || var12.aaa.ada == 3) && (ci.aea(var13.cx - var1.cx) > var12.aga + 30 || ci.aea(var13.cy - var1.cy) > var12.aha + 30) && System.currentTimeMillis() - this.bha > 1500L) {
                        Auto.ada(var1);
                        this.bha = System.currentTimeMillis();
                     }

                     Auto.aya.removeAllElements();
                     Auto.aza.removeAllElements();
                     Auto.aza.addElement(var1);
                     Service.aaa().afa(var12.aaa.aaa);
                     Service.aaa().aaa((ev)Auto.aya, (ev)Auto.aza, (int)2);
                  }

                  if (System.currentTimeMillis() - var12.afa >= (long)var12.aea + 50L) {
                     var12.afa = System.currentTimeMillis();
                     var12.ala = true;
                     if (!Code.bfa) {
                        var13.aba(GameScr.aza[var12.aaa.aaa], 0);
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
