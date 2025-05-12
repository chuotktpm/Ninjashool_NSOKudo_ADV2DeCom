
// Source code is decompiled from a .class file using FernFlower decompiler.
final class Class_gn implements Runnable {
    Class_gn(Code var1) {
    }
 
    public final void run() {
       for(int var1 = 15; var1 < 30; ++var1) {
          Npc var3;
          if (TileMap.zoneID != var1 && (var3 = GameScr.i(13)) != null) {
             if (Math.abs(var3.cx - Char.getMyChar().cx) > 22 || Math.abs(var3.cy - Char.getMyChar().cy) > 22) {
                Char.c(var3.cx, var3.cy);
             }
 
             Service.getInstance().a(var1, -1);
             TileMap.g();
 
             try {
                Thread.sleep(100L);
             } catch (InterruptedException var4) {
             }
          }
 
          for(int var2 = 0; var2 < GameScr.vMobAttack.size(); ++var2) {
             Mob var5;
             if ((var5 = (Mob)GameScr.vMobAttack.elementAt(var2)).y && var5.c > 0 && var5.h != 0) {
                return;
             }
          }
       }
 
    }
 }
 