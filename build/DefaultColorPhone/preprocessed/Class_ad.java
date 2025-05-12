
// Source code is decompiled from a .class file using FernFlower decompiler.
public final class Class_ad extends Auto {
    public static boolean a = false;
    private static String[] b = new String[]{"Hôm nay con đã làm hết nhiệm vụ ta giao. Hãy quay lại vào ngày hôm sau..", "Đây là lần nhận nhiệm vụ thứ ", " trong ngày hôm nay. Mỗi ngày được nhận tối đa 20 lần con nhé."};
    private static int c;
    private TaskOrder d;
 
    public Class_ad() {
    }
 
    public static void a(String var0) {
       if (var0.equals(b[0])) {
          c = 21;
          LockGame.l();
       } else {
          int var1;
          if ((var1 = var0.indexOf(b[1])) >= 0) {
             var0 = var0.substring(var1 + b[1].length(), var0.indexOf(b[2])).trim();
 
             try {
                c = Integer.parseInt(var0);
             } catch (NumberFormatException var3) {
             }
          }
 
       }
    }
 
    public final void a() {
       c = 0;
       this.d = Char.l(0);
       super.a();
    }
 
    public final void b() {
       this.d = Char.l(0);
    }
 
    public final void c() {
       if (c <= 20 && (!(super.instance instanceof Stanima) || System.currentTimeMillis() - super.o < 3600000L)) {
          if (Char.getMyChar().cHP <= 0) {
             Auto.a(false);
             return;
          }
 
          if (TileMap.f(TileMap.mapID)) {
             if (this.d == null) {
                GameScr.chatPopup("Nhận NV " + (c + 1) + "/20");
                GameScr.PickNpc(25, GameScr.fj, 0);
                LockGame.k();
                this.d = Char.l(0);
                return;
             }
 
             if (this.d.count < this.d.maxCount) {
                GameScr.chatPopup("Đi làm NV " + c + "/20");
                GameScr.PickNpc(25, GameScr.fj, 3);
                TileMap.g();
                this.b(super.i);
                return;
             }
 
             if (Char.countNullSlot() <= 0) {
                GameScr.chatPopup("Hành trang đầy");
                return;
             }
 
             GameScr.chatPopup("Hoàn thành NV " + c + "/20");
             GameScr.PickNpc(25, GameScr.fj, 2);
             this.d = null;
          } else if (this.d != null && TileMap.mapID == this.d.mapId) {
             if (this.d.count >= this.d.maxCount) {
                Auto.tuSat();
                return;
             }
 
             this.c(this.d.killId, 1);
             this.c(-1);
             if (a) {
                GameScr.chatPopup("Nhiệm vụ " + c + "/20: " + this.d.count + "/" + this.d.maxCount + " " + Mob.b[this.d.killId].g);
                a = false;
             }
          }
       } else {
          GameScr.chatPopup("Hoàn thành!");
          Code var1 = Code.a;
          Code.c();
       }
 
    }
 
    public final String toString() {
       return "Auto Nhiệm vụ hằng ngày: " + c + "/20";
    }
 }
 