
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Calendar;

public final class TanSat extends Auto {
   public int a;
   public static long b;

   public TanSat() {
   }

   public final void a(int var1, int var2, int var3) {
      super.a();
      super.h = var2;
      super.i = var3;
      super.j = TileMap.g(var2);
      this.a = var1;
   }

   public final void c() {
      if (super.i()) {
         if (Char.tickReMap) {
            Auto.a(true);
         }
      } else {
         Calendar var7;
         int var2 = (var7 = Class_fa.b()).get(11);
         int var3 = var7.get(12);

         if (Class_fn.a == 0 && var2 == Class_fn.b && var3 == Class_fn.c && System.currentTimeMillis() - b >= 5000L) {
            if (TileMap.mapID == 139 || TileMap.mapID == 140 || TileMap.mapID == 141 || TileMap.mapID == 142 || TileMap.mapID == 143 || TileMap.mapID == 144 || TileMap.mapID == 145 || TileMap.mapID == 146 || TileMap.mapID == 148 || TileMap.mapID == 147) {
               Code.n();
               Auto.sleep(1000L);
               Auto.a(true);
            }

            if (TileMap.mapID != 1) {
               TileMap.l(1);
            }

            Auto.sleep(3000L);
            GameScr.PickNpc(5, 1, 0);
            Auto.sleep(2000L);
            GameScr.PickNpc(25, 1, 0);
            Code.a.d();
            Auto.sleep(60000L);
            b = System.currentTimeMillis();
            return;
         }

         if (!Auto.q && Char.getMyChar().isHuman) {
            this.l();
            return;
         }

         if (super.h != TileMap.mapID || !super.j && super.i != TileMap.zoneID) {
            this.a(super.h, super.i, super.k, super.l);
         } else {
            if (Char.tickLuyenDaMax && Code.h() && Char.countNullSlot() < 5 && !TileMap.e(TileMap.mapID)) {
               Auto.tuSat();
               return;
            }

            this.c(this.a, this.a(Char.tickDanhQuaiThuong, Char.tickDanhTinhAnh, Char.tickDanhThuLinh, false));
            this.c(-1);
         }
      }

   }

   public final String toString() {
      return this.a >= 0 && this.a < Mob.b.length ? "Tàn sát " + Mob.b[this.a].g : "Tàn sát";
   }
}
