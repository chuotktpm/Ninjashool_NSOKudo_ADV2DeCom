
// Source code is decompiled from a .class file using FernFlower decompiler.
public class As10 extends Auto {
    public As10() {
       super.a();
    }
 
    public boolean a(Char var1) {
       return var1.ctaskId >= 9;
    }
 
    public void a(Char var1, byte var2, byte var3) {
       switch (var1.ctaskId) {
          case 0:
             if (var1.taskMaint.a == 0) {
                GameScr.PickNpc(var3, 2, 0);
                LockGame.o();
                return;
             }
 
             if (var1.taskMaint.a == 1) {
                GameScr.PickNpc(var3, 2, 0);
                LockGame.o();
                return;
             }
 
             if (var1.taskMaint.a == 2) {
                GameScr.PickNpc(var3, 8, 0);
                LockGame.o();
                return;
             }
 
             if (var1.taskMaint.a == 3) {
                GameScr.PickNpc(var3, 3, 2);
                LockGame.o();
                return;
             }
 
             if (var1.taskMaint.a == 4) {
                GameScr.PickNpc(var3, 4, 0);
                LockGame.o();
                return;
             }
 
             if (var1.taskMaint.a == 5) {
                GameScr.PickNpc(var3, 0, 0);
                LockGame.o();
                return;
             }
 
             return;
          case 1:
             if (var1.taskMaint.a == 0) {
                GameScr.PickNpc(var3, 0, 0);
                Service.getInstance().getTask(var3, 2);
                Service.getInstance().getTask(var3, 1);
                Service.getInstance().getTask(var3, 3);
                Service.getInstance().getTask(var3, 3);
                Service.getInstance().getTask(var3, 1);
                Service.getInstance().getTask(var3, 2);
                LockGame.o();
                return;
             }
             break;
          case 2:
             if (var1.taskMaint.a == 0) {
                if (var1.arrItemBag[0] != null) {
                   Service.getInstance().useItem(0);
                }
 
                LockGame.o();
                return;
             }
 
             if (var1.taskMaint.a == 1) {
                if (TileMap.mapID == 22) {
                   this.c(-1);
                   this.c(0, 1);
                   return;
                }
 
                this.a(22, -1, -1, -1);
                return;
             }
             break;
          case 3:
             if (var1.taskMaint.a == 0) {
           try {
               Thread.sleep(2000L);
               GameScr.PickNpc(4, 0, 0);
               Service.getInstance().buyItem(9, 0, 3);
               LockGame.o();
               return;
           } catch (InterruptedException ex) {
               
           }
             }
 
             if (var1.taskMaint.a == 1) {
                if (var1.arrItemBag[0] != null) {
                   Service.getInstance().useItem(0);
                }
 
                LockGame.o();
                return;
             }
 
             if (var1.taskMaint.a == 2) {
                if (TileMap.mapID == 23) {
                   this.c(-1);
                   this.c(1, 1);
                   return;
                }
 
                this.a(23, -1, -1, -1);
                return;
             }
 
             if (var1.taskMaint.a == 3) {
                if (TileMap.mapID == 23) {
                   this.c(-1);
                   this.c(2, 1);
                   return;
                }
 
                this.a(23, -1, -1, -1);
                return;
             }
             break;
          case 4:
             if (var1.taskMaint.a == 0) {
                if (TileMap.mapID == 21) {
                   this.c(-1);
                   this.c(-1, 1);
                   return;
                }
 
                this.a(21, -1, -1, -1);
                return;
             }
 
             if (var1.taskMaint.a == 1) {
                if (TileMap.mapID == 21) {
                   this.c(209);
                   this.c(3, 1);
                   return;
                }
 
                this.a(21, -1, -1, -1);
                return;
             }
 
             if (var1.taskMaint.a == 2) {
                if (TileMap.mapID == 23) {
                   this.c(210);
                   this.c(4, 1);
                   return;
                }
 
                this.a(23, -1, -1, -1);
                return;
             }
             break;
          case 5:
             if (var1.taskMaint.a == 0) {
                if (TileMap.mapID == 20) {
                   this.c(-1);
                   this.c(3, 1);
                   return;
                }
 
                this.a(20, -1, -1, -1);
                return;
             }
 
             if (var1.taskMaint.a == 1) {
                if (TileMap.mapID == 20) {
                   this.c(211);
                   this.c(54, 1);
                   return;
                }
 
                this.a(20, -1, -1, -1);
                return;
             }
             break;
          case 6:
             if (var1.taskMaint.a == 0) {
                if (TileMap.mapID == 26) {
                   this.c(-1);
                   this.c(-1, 1);
                   return;
                }
 
                this.a(26, -1, -1, -1);
                return;
             }
 
             if (var1.taskMaint.a == 1) {
           try {
               super.a(2, -2, -1, -1);
               Thread.sleep(500L);
               return;
           } catch (InterruptedException ex) {
               
           }
             }
 
             if (var1.taskMaint.a == 2) {
           try {
               super.a(71, -2, -1, -1);
               Thread.sleep(500L);
               return;
           } catch (InterruptedException ex) {
               
           }
             }
 
             if (var1.taskMaint.a == 3) {
           try {
               super.a(26, -2, -1, -1);
               Thread.sleep(500L);
               return;
           } catch (InterruptedException ex) {
               
           }
             }
             break;
          case 7:
             if (var1.taskMaint.a == 0) {
                if (TileMap.mapID == 71) {
                   this.c(-1);
                   this.c(-1, 1);
                   return;
                }
 
                this.a(71, -1, -1, -1);
                return;
             }
 
             if (var1.taskMaint.a == 1) {
                super.a(var2, -2, -1, -1);
                GameScr.PickNpc(var3, 0, 0);
                Service.getInstance().getTask(var3, 1);
                LockGame.o();
                return;
             }
 
             if (var1.taskMaint.a == 2) {
                Service.getInstance().getTask(var3, 0);
                LockGame.o();
                return;
             }
 
             if (var1.taskMaint.a == 3) {
                Service.getInstance().getTask(var3, 1);
                LockGame.o();
                return;
             }
 
             if (var1.taskMaint.a == 4) {
                Service.getInstance().getTask(var3, 1);
                LockGame.o();
                return;
             }
 
             if (var1.taskMaint.a == 5) {
                Service.getInstance().getTask(var3, 2);
                LockGame.o();
                return;
             }
 
             if (var1.taskMaint.a == 6) {
                GameScr.PickNpc(var3, 0, 0);
                Service.getInstance().getTask(var3, 2);
                LockGame.o();
                return;
             }
 
             if (var1.taskMaint.a == 7) {
                Service.getInstance().getTask(var3, 0);
                LockGame.o();
                return;
             }
 
             if (var1.taskMaint.a == 8) {
                Service.getInstance().getTask(var3, 2);
                LockGame.o();
                return;
             }
 
             if (var1.taskMaint.a == 9) {
                Service.getInstance().getTask(var3, 2);
                LockGame.o();
                return;
             }
 
             if (var1.taskMaint.a == 10) {
                Service.getInstance().getTask(var3, 1);
                LockGame.o();
                return;
             }
 
             if (var1.taskMaint.a == 11) {
                GameScr.PickNpc(var3, 0, 0);
                Service.getInstance().getTask(var3, 0);
                LockGame.o();
                return;
             }
 
             if (var1.taskMaint.a == 12) {
                Service.getInstance().getTask(var3, 1);
                LockGame.o();
                return;
             }
 
             if (var1.taskMaint.a == 13) {
                Service.getInstance().getTask(var3, 2);
                LockGame.o();
                return;
             }
 
             if (var1.taskMaint.a == 14) {
                Service.getInstance().getTask(var3, 2);
                LockGame.o();
                return;
             }
 
             if (var1.taskMaint.a == 15) {
                Service.getInstance().getTask(var3, 1);
                LockGame.o();
                return;
             }
             break;
          case 8:
             if (var1.taskMaint.a == 0) {
                if (TileMap.mapID == 26) {
                   this.c(-1);
                   this.c(-1, 1);
                   return;
                }
 
                this.a(26, -1, -1, -1);
                return;
             }
 
             super.a(var2, -2, -1, -1);
             GameScr.h(var3);
             NpcTemplate var5 = Npc.arrNpcTemplate[var3];
 
             for(int var4 = 0; var4 < var5.menu.length; ++var4) {
                if (var5.menu[var4][0].equals("N\u00f3i chuy\u1ec7n")) {
                    try {
                        GameScr.PickNpc(var3, var4, 0);
                        LockGame.o();
                        Thread.sleep(1000L);
                        return;
                    } catch (InterruptedException ex) {
                        
                    }
                }
             }
       }
 
    }
 
    public final void c() {
       Char var1 = Char.getMyChar();
       if (this.a(var1)) {
          GameScr.chatPopup("Xong!");
          Code var10000 = Code.a;
          Code.f();
       } else {
          byte var2 = GameScr.ad();
          byte var3 = GameScr.ae();
          if (Char.getMyChar().cHP <= 0) {
             Auto.a(false);
          } else if (var1.taskMaint == null) {
             if (TileMap.mapID != var2) {
                super.a(var2, -2, -1, -1);
             } else {
                GameScr.PickNpc(var3, 0, 0);
                Service.getInstance().getTask(var3, 0);
                LockGame.o();
                super.i = -1;
             }
          } else if (var1.taskMaint.a >= var1.taskMaint.e.length - 1) {
             if (TileMap.mapID != var2) {
                super.a(var2, -2, -1, -1);
             } else {
                GameScr.PickNpc(var3, 0, 0);
                Service.getInstance().getTask(var3, 0);
                LockGame.o();
                super.i = -1;
             }
          } else {
             this.a(var1, var2, var3);
          }
       }
    }
 
    public String toString() {
       return "Auto Nhi\u1ec7m V\u1ee5 10";
    }
 }
 