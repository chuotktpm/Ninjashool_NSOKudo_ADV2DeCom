
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Vector;

public final class Code implements Runnable {

    public static Code a = new Code();
    private static boolean aq = false;
    private static Thread ar;
    public static Auto b;
    private static TanSat as = new TanSat();
    public static Stanima c = new Stanima();
    public static Class_ad d = new Class_ad();
    public static Class_ag e = new Class_ag();
    private static TuDanh at = new TuDanh();
    private static Class_gm au = new Class_gm();
    public static Class_ae f = new Class_ae();
    public static AutoDV autoDV = new AutoDV();
    public static String g = null;
    public static MyVector h = new MyVector();
    public static MyVector i = new MyVector();
    private static long av;
    private static long aw;
    public static short[] j;
    public static short[] delListID;
    public static int l;
    public static int m;
    public static int n;
    public static int o;
    public static boolean p;
    public static boolean q;
    public static int r;
    public static MyVector s;
    public static MyVector t;
    public static boolean u;
    public static int v;
    public static int[] w;
    public static boolean x, x1, x2;
    public static int y;
    public static int z1;
    private static long ax;
    private static MyVector tuDung;
    private static MyVector az;
    private static long ba;
    public static MyVector z;
    public static MyVector aa;
    public static long ab;
    public static long ac;
    public static boolean ad;
    public static boolean ae;
    public static boolean af;
    public static int ag;
    public static boolean ah;
    public static int ai;
    public static boolean aj;
    public static int ak;
    public static boolean al;
    public static int am;
    public static boolean an;
    public static String nameCharLoiDai;
    public static int mapLoiDai;
    public static int khuLoiDai;
    public static int mapDanhVong;
    public static int khuDanhVong;
    private static String[] bb;
    public static short[] throwListID;
    public static MyVector listLuyenNgoc;
    private static long timevut;
    public static MyVector vutdo;
    public static int gioADV;
    public static int phutADV;
    public static SettingADV settingADV = new SettingADV();

    public Code() {
    }

    public final void a() {
        if (!aq) {
            if (b != null) {
                b.b();
            }

            ax = System.currentTimeMillis();
            aq = true;
            (ar = new Thread(this)).start();
        }

    }

    public static void b() {
        aq = false;
        if (ar != null) {
            LockGame.tatAuto();
            ar.interrupt();
        }

    }

    public static void a(Auto var0) {
        var0.instance = b;
        b = var0;
    }

    public static void c() {
        LockGame.tatAuto();
        b = b.instance;
    }

    public final void tanSat(int var1, int var2) {
        as.a(var1, var2, Char.tickTSMapEmpty ? -1 : TileMap.zoneID);
        a((Auto) as);
    }

    private void c(int var1, int var2) {
        c.a(var1, var2, Char.tickTSMapEmpty ? -1 : TileMap.zoneID, false, false);
        a((Auto) c);
    }

    private void a(boolean var1, boolean var2) {
        c.a(-1, TileMap.mapID, TileMap.zoneID, var1, var2);
        c.g = true;
        a((Auto) c);
    }

    public final void d() {
        d.a();
        a((Auto) d);
    }

    public final void e() {
        e.a();
        a((Auto) e);
    }

    private void p() {
        at.a();
        a((Auto) at);
    }

    private void b(boolean var1, boolean var2) {
        au.a(TileMap.mapID, TileMap.zoneID, var1, var2);
        a((Auto) au);
    }

    private void q() {
        f.a();
        a((Auto) f);
    }

    public static void f() {
        LockGame.tatAuto();
        b = null;
    }
    
    public static void onAutoDV() {
      autoDV.init();
      a((Auto) autoDV);
   }

    public static MyVector g() {
        MyVector var0 = new MyVector();

        for (int var1 = 0; var1 < i.size(); ++var1) {
            var0.addElement(var1 + ". " + (String) i.elementAt(var1));
        }

        return var0;
    }

    private static void i(String var0) {
        if (!i.contains(var0)) {
            i.addElement(var0);
            s();
        }

    }

    private static void j(String var0) {
        if (i.contains(var0)) {
            i.removeElement(var0);
            s();
        }

    }

    private static void r() {
        i.removeAllElements();
        s();
    }

    public static boolean a(String var0) {
        return i.contains(var0);
    }

    private static void s() {
        ByteArrayOutputStream var0 = new ByteArrayOutputStream();
        DataOutputStream var1 = new DataOutputStream(var0);

        try {
            var1.writeUTF(g == null ? "" : g);
            var1.writeByte(h.size());

            int var2;
            for (var2 = 0; var2 < h.size(); ++var2) {
                var1.writeUTF((String) h.elementAt(var2));
            }

            var1.writeInt(i.size());

            for (var2 = 0; var2 < i.size(); ++var2) {
                var1.writeUTF((String) i.elementAt(var2));
            }

            var1.flush();
            var0.flush();
            RMS.writeRecord("V6Group", var0.toByteArray());
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public static boolean b(String var0) {
        if (g != null && !d(var0)) {
            String var1;
            if ((var1 = Char.getMyChar().charName).equals(g)) {
                if (c(var0)) {
                    return true;
                }
            } else if (GameScr.vParty.size() > 1 && var1.equals(((Party) GameScr.vParty.firstElement()).d) && var0.equals(g)) {
                return true;
            }

            return false;
        } else {
            return false;
        }
    }

    public static boolean c(String var0) {
        for (int var1 = 0; var1 < h.size(); ++var1) {
            if (var0.equals(h.elementAt(var1))) {
                return true;
            }
        }

        return false;
    }

    public static boolean d(String var0) {
        if (var0.equals(Char.getMyChar().charName)) {
            return true;
        } else {
            for (int var1 = 0; var1 < GameScr.vParty.size(); ++var1) {
                if (((Party) GameScr.vParty.elementAt(var1)).d.equals(var0)) {
                    return true;
                }
            }

            return false;
        }
    }

    public static boolean h() {
        for (int var0 = 0; var0 < Char.ex - 1; ++var0) {
            if (Char.k(var0) >= 4) {
                return true;
            }
        }

        return false;
    }

    private static int g(int var0) {
        int var2 = 0;
        Char var3 = Char.getMyChar();

        for (int var1 = 0; var1 < var3.arrItemBag.length; ++var1) {
            Item var4;
            if ((var4 = var3.arrItemBag[var1]) != null && var4.template.type == 18 && var4.template.level == var0) {
                ++var2;
            }
        }

        return var2;
    }

    public final void run() {
        while (true) {
            try {
                if (aq) {
                    long var1 = System.currentTimeMillis();

                    try {
                        Char var3 = Char.getMyChar();
                        int var4 = Char.countNullSlot();
                        int var6;
                        int var11;
                        int var12;
                        int var13;
                        Item var14;
                        int var26;
                        int var31;
                        int var34;
                        int var35;
                        int var7;
                        if (b != null) {
                            if (!(b instanceof Class_fj) && !(b instanceof Class_fl) && Class_fj.e() && Class_fj.a != null) {
                                a((Auto) (new Class_fl(Class_fj.d, Class_fj.e, Class_fj.a)));
                            }

                            if (g != null && System.currentTimeMillis() - av > 5000L) {
                                if (g.equals(var3.charName)) {
                                    if (!Auto.q && GameScr.vParty.size() <= 0) {
                                        Service.getInstance().s();
                                    }
                                } else if (GameScr.getCharByName(g) != null && GameScr.vParty.size() == 0) {
                                    Service.getInstance().pleaseInputParty(g);
                                }

                                av = System.currentTimeMillis();
                            }

                            if (ac > 0L) {
                                long var5;
                                if ((var5 = System.currentTimeMillis()) - ab >= ac) {
                                    ac = 0L;
                                    LockGame.tatAuto();
                                    b = null;
                                    Session_ME.instance.c();
                                    Controller.getInstance().d();
                                    return;
                                }

                                ac -= var5 - ab;
                                ab = var5;
                            }

                            b.c();
                            if (var3.isHuman == Auto.q && (var3.bz == null || var3.bz.template.id != Auto.selectSkill.template.id)) {
                                var3.bz = Auto.selectSkill;
                            }

                            if (Char.tickDieKhiHetMP && Auto.s) {
                                Auto.s = false;
                                if (!(b instanceof Class_ag) && !(b instanceof Class_al) && !TileMap.e(TileMap.mapID) && var3.arrItemBody[15] == null) {
                                    Auto.tuSat();
                                }
                            }

                            boolean var24;
                            if (var3.r != 14 && var3.r != 5 && var3.cHP > 0) {
                                if (Char.dh && System.currentTimeMillis() - aw > 500L && Char.getMyChar().cMP < Char.getMyChar().cMaxMP * Char.et / 100) {
                                    Char.getMyChar().e(17);
                                    aw = System.currentTimeMillis();
                                }

                                if (Char.dg && System.currentTimeMillis() - var3.fq > 2000L && Char.getMyChar().cHP < Char.getMyChar().cMaxHP * Char.es / 100) {
                                    var24 = false;
                                    var6 = (int) (System.currentTimeMillis() / 1000L);

                                    for (var7 = 0; var7 < Char.getMyChar().by.size(); ++var7) {
                                        Class_cq var8;
                                        if ((var8 = (Class_cq) Char.getMyChar().by.elementAt(var7)).e.a == 21 && var8.c - (var6 - var8.b) >= 2) {
                                            var24 = true;
                                            break;
                                        }
                                    }

                                    if (!var24) {
                                        Char.getMyChar().e(16);
                                        var3.fq = System.currentTimeMillis();
                                    }
                                }
                            }

                            if (var3.aj > 0 && (Char.el || b instanceof As20) && Auto.selectSkill != null && Auto.selectSkill.point < Auto.selectSkill.template.maxPoint) {
                                SkillTemplate var25 = Auto.selectSkill.template;
                                var6 = 0;

                                for (var7 = Auto.selectSkill.point + 1; var7 <= var25.maxPoint && var25.skills[var7].level <= var3.cLevel && var6 < var3.aj; ++var7) {
                                    ++var6;
                                }

                                if (var6 > 0) {
                                    GameScr.chatPopup("Cộng skill " + var25.name + " " + var6 + " điểm");
                                    Service.getInstance().f(var25.id, var6);
                                    if (LockGame.u()) {
                                        Session_ME.getInstance().d();
                                    }
                                }
                            }

                            if (var3.ai > 0 && (Char.ek || b instanceof As20)) {
                                var26 = var3.isNoiCong() ? 3 : 0;
                                if (var3.ai >= 100) {
                                    GameScr.chatPopup("Cộng tiềm năng " + mResources.iz[var26] + " 60 điểm, " + mResources.iz[2] + " 40 điểm");
                                    Service.getInstance().e(2, 40);
                                    Service.getInstance().e(var26, 60);
                                } else {
                                    GameScr.chatPopup("Cộng tiềm năng " + mResources.iz[var26] + " " + var3.ai + " điểm");
                                    Service.getInstance().e(var26, var3.ai);
                                }

                                LockGame.w();
                            }

                            Item var27;
                            for (var26 = 0; var26 < var3.arrItemBag.length; ++var26) {
                                if (isItemDel(var27 = var3.arrItemBag[var26])) {
                                    var27.u = System.currentTimeMillis();
                                    Service.getInstance().saleItem1(var27.indexUI, 1);
                                }
                            }

                            for (var26 = 0; var26 < var3.arrItemBag.length; ++var26) {
                                if (isThrowItem(var27 = var3.arrItemBag[var26])) {
                                    var27.u = System.currentTimeMillis();
                                    Service.getInstance().throwItem(var27.indexUI);
                                }
                            }

                            Item var9;
                            if (Char.countNullSlotBox() > 0 && Class_fp.c == 0) {
                                for (var7 = 0; var7 < c(Class_fp.b, ",").length; ++var7) {
                                    for (var31 = 0; var31 < Char.getMyChar().arrItemBag.length; ++var31) {
                                        var9 = Char.getMyChar().arrItemBag[var31];
                                        if (var9 != null && var9.template.id == Integer.parseInt(c(Class_fp.b, ",")[var7])) {
                                            Service.getInstance().e(var9.indexUI);
                                        }
                                    }
                                }
                            }

                            Item var33;
                            if (az.size() > 0) {
                                int[] var30 = new int[]{150000, 247500, 408375, 673819, 1111801, 2056832, 4010822, 7420021, 12243035};
                                byte[] var28 = new byte[]{3, 5, 9, 4, 7, 10, 5, 7, 9};

                                for (var7 = 0; var7 < az.size(); ++var7) {
                                    var34 = (var33 = (Item) az.elementAt(var7)).getTinhLuyen(85);
                                    if (var33.w) {
                                        if (System.currentTimeMillis() - var33.y > z1 * 1000 || var33.x < var34) {
                                            var33.w = false;
                                        }
                                    } else if (var34 >= 0 && var34 < 9) {
                                        MyVector var10 = Char.getListItemByID(var34 < 3 ? 455 : (var34 < 6 ? 456 : 457));
                                        var11 = var30[var34];
                                        var12 = var28[var34];
                                        if (var3.yen >= var11 && var10.size() >= var12) {
                                            Item[] var37 = new Item[24];

                                            for (var13 = 0; var13 < var12; ++var13) {
                                                var14 = (Item) var10.elementAt(var10.size() - 1);
                                                var37[var13] = var14;
                                                var3.arrItemBag[var14.indexUI] = null;
                                                var10.removeElementAt(var10.size() - 1);
                                            }

                                            Service.getInstance().b(var33, var37);
                                            var33.w = true;
                                            var33.x = var34;
                                            var33.y = System.currentTimeMillis();
                                        }
                                    } else {
                                        az.removeElementAt(var7--);
                                    }
                                }
                            }

                            Item[] var29;
                            MyVector var32;
                            if (Char.tickAutoTTT && var4 > 0) {
                                var32 = Char.getListItemByID(455);

                                while (var32.size() >= 9) {
                                    var29 = new Item[24];

                                    for (var7 = 0; var7 < 9; ++var7) {
                                        var33 = (Item) var32.elementAt(var32.size() - 1);
                                        var29[var7] = var33;
                                        var3.arrItemBag[var33.indexUI] = null;
                                        var32.removeElementAt(var32.size() - 1);
                                    }

                                    Service.getInstance().e(var29);
                                }

                                var4 = Char.countNullSlot();
                            }

                            if (Char.tickAutoTTC && var4 > 0) {
                                var32 = Char.getListItemByID(456);

                                while (var32.size() >= 9) {
                                    var29 = new Item[24];

                                    for (var7 = 0; var7 < 9; ++var7) {
                                        var33 = (Item) var32.elementAt(var32.size() - 1);
                                        var29[var7] = var33;
                                        var3.arrItemBag[var33.indexUI] = null;
                                        var32.removeElementAt(var32.size() - 1);
                                    }

                                    Service.getInstance().e(var29);
                                }

                                var4 = Char.countNullSlot();
                            }

                            if (System.currentTimeMillis() - ba > 2000L) {
                                for (var26 = 0; var26 < z.size(); ++var26) {
                                    var6 = ((Integer) z.elementAt(var26)).intValue();
                                    if ((var7 = ((Integer) aa.elementAt(var26)).intValue()) < 5000) {
                                        z.removeElementAt(var26);
                                        aa.removeElementAt(var26);
                                        --var26;
                                    } else if ((var33 = Char.f(var6)) != null) {
                                        Service.getInstance().sendToSaleItem(var33, var7);
                                    }
                                }

                                var4 = Char.countNullSlot();
                                ba = System.currentTimeMillis();
                            }

                            if (TileMap.mapID != 138 && TileMap.e(TileMap.mapID) && Char.di && Char.tickAutoMuaTA && Char.eu <= 50 && var4 > 1 && g(Char.eu) == 0) {
                                TileMap.j(0);
                                TileMap.g();
                            }

                            if (TileMap.d(TileMap.mapID) || TileMap.f(TileMap.mapID)) {
                                if ((Char.tickAutoMuaTA || b instanceof As10) && var4 > 1 && var3.ctaskId > 3 && (var7 = b instanceof As10 ? (var3.ctaskId >= 9 ? 10 : 1) : Char.eu) <= 50 && g(var7) == 0) {
                                    var6 = 2;

                                    for (var26 = 0; var26 < var3.by.size(); ++var26) {
                                        if (((Class_cq) var3.by.elementAt(var26)).e.b == 0) {
                                            --var6;
                                            break;
                                        }
                                    }

                                    GameScr.PickNpc(4, 0, 0);
                                    if (var7 == 50) {
                                        Service.getInstance().buyItem1(9, 7, var6);
                                    } else {
                                        Service.getInstance().buyItem1(9, var7 / 10, var6);
                                    }

                                    LockGame.g();
                                }

                                if (TileMap.mapID == 138 && var4 > 1 && !Char.hasItem(35) && !Char.hasItem(37)) {
                                    GameScr.PickNpc(4, 0, 0);
                                    Service.getInstance().buyItem1(9, 6, 1);
                                    LockGame.g();
                                    ++var4;
                                }

                                if (var4 < 10 && !(b instanceof As10)) {
                                    if (Char.tickLuyenDaMax && var3.ctaskId > 9 && var4 > 0 && h()) {
                                        if (var24 = TileMap.f(TileMap.mapID)) {
                                            if ((var27 = Char.g(37)) == null && (var27 = Char.g(35)) == null) {
                                                GameScr.PickNpc(4, 0, 0);
                                                Service.getInstance().buyItem1(9, 6, 1);
                                                LockGame.g();
                                                Thread.sleep(100L);
                                                var27 = Char.g(35);
                                            }

                                            if (var27 != null) {
                                                Service.getInstance().useItemChangeMap(var27.indexUI, 5);
                                                TileMap.g();
                                            }
                                        }

                                        if (TileMap.d(TileMap.mapID)) {
                                            GameScr.PickNpc(6, 1, 1);
                                            LockGame.q();
                                            Vector var38 = new Vector();

                                            label438:
                                            for (var7 = 0; var7 < Char.ex - 1; ++var7) {
                                                var38.removeAllElements();

                                                for (var31 = 0; var31 < var3.arrItemBag.length; ++var31) {
                                                    if ((var9 = var3.arrItemBag[var31]) != null && var9.template.id == var7) {
                                                        var38.addElement(var9);
                                                    }
                                                }

                                                while (var38.size() >= 4) {
                                                    var31 = 1;

                                                    for (var34 = var7; var34 < Char.ex - 1 && GameScr.coinUpCrystals[var34] <= var3.yen && var31 << 2 <= var38.size() && var31 < 16; ++var34) {
                                                        var31 <<= 2;
                                                    }

                                                    if (var31 == 1) {
                                                        break label438;
                                                    }

                                                    GameScr.arrItemUpPeal = new Item[24];

                                                    for (var35 = 0; var35 < var31; ++var35) {
                                                        Item var39 = (Item) var38.elementAt(0);
                                                        GameScr.arrItemUpPeal[var35] = var39;
                                                        var3.arrItemBag[var39.indexUI] = null;
                                                        var38.removeElementAt(0);
                                                    }

                                                    Service.getInstance().crystalCollectLock1(GameScr.arrItemUpPeal);
                                                    LockGame.a();
                                                    if (GameScr.arrItemUpPeal[0] != null) {
                                                        var3.arrItemBag[GameScr.arrItemUpPeal[0].indexUI] = GameScr.arrItemUpPeal[0];
                                                    }
                                                }
                                            }

                                            GameCanvas.setMaxTextLenght();
                                        }

                                        if (Char.getMyChar().arrItemBox == null) {
                                            Service.getInstance().requestItem(4);
                                            LockGame.s();
                                        }

                                        GameScr.PickNpc(5, 0, 0);
                                        var6 = 0;

                                        for (var7 = Char.countNullSlotBox(); var6 < var3.arrItemBag.length; ++var6) {
                                            if ((var33 = var3.arrItemBag[var6]) != null && var33.template.id == Char.ex - 1 && var7 > 0) {
                                                Service.getInstance().e(var33.indexUI);
                                                --var7;
                                            }
                                        }

                                        if (var24) {
                                            Auto.tuSat();
                                        }
                                    }

                                    var4 = Char.countNullSlot();
                                    Service.getInstance().bagSort();
                                    LockGame.s();
                                }
                            }
                        }

                        if (p) {
                            var26 = 100;
                            ItemMap var41 = null;
                            var31 = 0;

                            while (true) {
                                if (var31 >= GameScr.af.size()) {
                                    if (var41 != null) {
                                        Service.getInstance().pickItem(var41.g);
                                        Thread.sleep(50L);
                                    }
                                    break;
                                }

                                ItemMap var40 = (ItemMap) GameScr.af.elementAt(var31);
                                var34 = Class_fa.a(var3.cx, var3.cy, var40.c, var40.d);
                                if ((var26 == -1 || var34 < var26) && (isItemCanPickUp(var40.h) || var3.nClass.classId == 1 && var40.h.id == 218) && (var4 > 2 || var40.h.type == 19 || var40.h.isUpToUp && Char.hasItem(var40.h.id))) {
                                    var26 = var34;
                                    var41 = var40;
                                }

                                ++var31;
                            }
                        }

                        if (x && var3.ah * 100L / (long) GameScr.crystals[var3.cLevel] >= 98L) {
                            LockGame.tatAuto();
                            b = null;
                            Session_ME.getInstance().b();
                        }

                        Class_gi.e = Class_gi.a(454);
                        Class_gi.f = Class_gi.a(455);
                        Class_gi.g = Class_gi.a(456);
                        Class_gi.h = Class_gi.a(457);
                        var35 = Char.getListItemByID(652).size();
                        var7 = Char.getListItemByID(653).size();
                        int var20 = Char.getListItemByID(654).size();
                        int var21 = Char.getListItemByID(655).size();
                        if (listLuyenNgoc.size() > 0) {
                            for (var11 = 0; var11 < listLuyenNgoc.size(); ++var11) {
                                GameScr.itemSplit = (Item) listLuyenNgoc.elementAt(var11);
                                if (var35 <= 2 && var7 <= 2 && var20 <= 2 && var21 <= 2) {
                                    listLuyenNgoc.removeElementAt(var11--);
                                } else {
                                    GameScr.getInstance().closeDialog();
                                    GameScr.getInstance().openUI(46);
                                    GameScr.arrItemSplit = new Item[24];
                                    var12 = 0;

                                    for (var13 = 0; var13 < Char.getMyChar().arrItemBag.length; ++var13) {
                                        var14 = Char.getMyChar().arrItemBag[var13];
                                        if (var12 < 24 && var14 != null && var14.upgrade < 2 && var14.upgrade == 1 && !var14.isLock && (var14.template.id == 652 || var14.template.id == 653 || var14.template.id == 654 || var14.template.id == 655)) {
                                            GameScr.arrItemSplit[var12++] = var14;
                                            Char.getMyChar().arrItemBag[var14.indexUI] = null;
                                        }
                                    }

                                    Auto.sleep(1000L);
                                    Service.getInstance().ngockham((byte) 1, (Item) null, GameScr.itemSplit, GameScr.arrItemSplit);
                                    Service.getInstance().viewInfo(Char.getMyChar().charName);
                                    GameScr.getInstance().closeDialog();
                                    Auto.sleep(3000L);
                                }
                            }
                        }
                        
                        if (System.currentTimeMillis() - timevut > 1L) {
                            var26 = 0;

                            while (true) {
                                if (var26 >= vutdo.size()) {
                                    timevut = System.currentTimeMillis();
                                    break;
                                }
                                labelvutdo:
                                {
                                    ItemTemplate var42 = ItemTemplateManager.get((short) (var6 = ((Integer) vutdo.elementAt(var26)).intValue()));
                                    if (Char.hasItem(var6)) {
                                        for (var31 = 0; var31 < var3.by.size(); ++var31) {
                                            Class_cq var36;
                                            if ((var36 = (Class_cq) var3.by.elementAt(var31)) != null && var36.e.c == var42.iconID) {
                                                break labelvutdo;
                                            }
                                        }

                                        if ((var31 = Char.getIndexItemById(var6)) >= 0) {
                                            Service.getInstance().throwItem(var31);
                                            break labelvutdo;
                                        }
                                    }

                                    vutdo.removeElementAt(var26);
                                    --var26;
                                }

                                ++var26;
                            }
                        }

                        if (System.currentTimeMillis() - ax > 2000L) {
                            var26 = 0;

                            while (true) {
                                if (var26 >= tuDung.size()) {
                                    ax = System.currentTimeMillis();
                                    break;
                                }

                                label690:
                                {
                                    ItemTemplate var42 = ItemTemplateManager.get((short) (var6 = ((Integer) tuDung.elementAt(var26)).intValue()));
                                    if (Char.hasItem(var6)) {
                                        for (var31 = 0; var31 < var3.by.size(); ++var31) {
                                            Class_cq var36;
                                            if ((var36 = (Class_cq) var3.by.elementAt(var31)) != null && var36.e.c == var42.iconID) {
                                                break label690;
                                            }
                                        }

                                        if ((var31 = Char.getIndexItemById(var6)) >= 0) {
                                            Service.getInstance().useItem(var31);
                                            break label690;
                                        }
                                    }

                                    tuDung.removeElementAt(var26);
                                    --var26;
                                }

                                ++var26;
                            }
                        }
                    } catch (Exception var23) {
                        var23.printStackTrace();
                    }

                    if (Char.getMyChar().isCaptcha) {
                        LockGame.i();
                    }

                    Thread.sleep((var1 = System.currentTimeMillis() - var1) < 100L ? 100L - var1 : 0L);
                    continue;
                }
            } catch (Exception var24) {
                var24.printStackTrace();
            }

            return;
        }
    }

    public static boolean hasVutdo(int var0) {
        return vutdo.contains(new Integer(var0));
    }

    public static void addVutdo(int var0) {
        Integer var1 = new Integer(var0);
        if (!vutdo.contains(var1)) {
            vutdo.addElement(var1);
        }
    }
    public static void removeVutdo(int var0) {
        vutdo.removeElement(new Integer(var0));
    }

    public static boolean hasTuDung(int var0) {
        return tuDung.contains(new Integer(var0));
    }

    public static void addTuDung(int var0) {
        Integer var1 = new Integer(var0);
        if (!tuDung.contains(var1)) {
            tuDung.addElement(var1);
        }

    }

    public static void removeTuDung(int var0) {
        tuDung.removeElement(new Integer(var0));
    }

    public static boolean a(Item var0) {
        return az.contains(var0);
    }

    public static void b(Item var0) {
        if (!az.contains(var0)) {
            az.addElement(var0);
        }

    }

    public static void c(Item var0) {
        az.removeElement(var0);
    }

    public static boolean d(int var0) {
        return z.contains(new Integer(var0));
    }

    public static int e(int var0) {
        return (var0 = z.indexOf(new Integer(var0))) >= 0 ? ((Integer) aa.elementAt(var0)).intValue() : 0;
    }

    public static boolean d1(int var0) {
        return z.contains(new Integer(var0));
    }

    public static int e1(int var0) {
        return (var0 = z.indexOf(new Integer(var0))) >= 0 ? ((Integer) aa.elementAt(var0)).intValue() : 0;
    }

    public static void b(int var0, int var1) {
        Integer var2 = new Integer(var0);
        if (!z.contains(var2)) {
            z.addElement(var2);
            aa.addElement(new Integer(var1));
        }

    }

    public static void fsw(int var0) {
        if ((var0 = z.indexOf(new Integer(var0))) >= 0) {
            z.removeElementAt(var0);
            aa.removeElementAt(var0);
        }

    }

    public static MyVector i() {
        MyVector var0 = new MyVector();

        for (int var1 = 0; var1 < z.size(); ++var1) {
            int var2 = ((Integer) z.elementAt(var1)).intValue();
            int var3 = ((Integer) aa.elementAt(var1)).intValue();
            ItemTemplate var4 = ItemTemplateManager.get((short) var2);
            var0.addElement(var1 + ". " + var4.name + " id " + var2 + " giá " + var3);
        }

        return var0;
    }

    public static void j() {
        Char var0 = Char.getMyChar();

        for (int var1 = 0; var1 < az.size(); ++var1) {
            Item var2;
            if ((var2 = (Item) az.elementAt(var1)).indexUI >= 0 && var2.indexUI < var0.arrItemBag.length) {
                if (var0.arrItemBag[var2.indexUI] != null && var0.arrItemBag[var2.indexUI].getTinhLuyen(85) >= 0 && var0.arrItemBag[var2.indexUI].getTinhLuyen(85) < 9) {
                    az.setElementAt(var0.arrItemBag[var2.indexUI], var1);
                } else {
                    az.removeElementAt(var1--);
                }
            }
        }

    }

    public static String k() {
        String var0 = "";

        for (int var1 = 0; var1 < w.length; ++var1) {
            var0 = var0 + (var1 == w.length - 1 ? String.valueOf(w[var1]) : w[var1] + " ");
        }

        return var0;
    }

    public static void e(String var0) {
        String[] var4;
        int[] var1 = new int[(var4 = c(var0, " ")).length];

        for (int var2 = 0; var2 < var4.length; ++var2) {
            try {
                var1[var2] = Integer.parseInt(var4[var2]);
            } catch (Exception var5) {
                var1[var2] = -1;
            }
        }

        w = var1;
    }

    public static void a(short var0) {
        int var1;
        for (var1 = 0; var1 < j.length; ++var1) {
            if (j[var1] == var0) {
                return;
            }
        }

        var1 = -1;

        for (int var2 = 0; var2 < j.length; ++var2) {
            if (j[var2] < 0) {
                var1 = var2;
                break;
            }
        }

        if (var1 == -1) {
            var1 = j.length;
            short[] var4;
            System.arraycopy(var4 = new short[j.length + 10], 0, j, 0, j.length);

            for (int var3 = j.length; var3 < var4.length; ++var3) {
                var4[var3] = -1;
            }

            j = var4;
        }

        j[var1] = var0;
    }

    public static void b(short var0) {
        for (int var1 = 0; var1 < j.length; ++var1) {
            if (j[var1] == var0) {
                j[var1] = -1;
            }
        }

    }

    public static void l() {
        for (int var0 = 0; var0 < j.length; ++var0) {
            if (j[var0] > 0) {
                for (int var1 = 0; var1 <= var0; ++var1) {
                    if (j[var1] == -1) {
                        j[var1] = j[var0];
                        j[var0] = -1;
                        break;
                    }
                }
            }
        }

    }

    public static void c(short var0) {
        int var1;
        for (var1 = 0; var1 < delListID.length; ++var1) {
            if (delListID[var1] == var0) {
                return;
            }
        }

        var1 = -1;

        for (int var2 = 0; var2 < delListID.length; ++var2) {
            if (delListID[var2] < 0) {
                var1 = var2;
                break;
            }
        }

        if (var1 == -1) {
            var1 = delListID.length;
            short[] var4;
            System.arraycopy(var4 = new short[delListID.length + 10], 0, delListID, 0, delListID.length);

            for (int var3 = delListID.length; var3 < var4.length; ++var3) {
                var4[var3] = -1;
            }

            delListID = var4;
        }

        delListID[var1] = var0;
    }

    public static void d(short var0) {
        for (int var1 = 0; var1 < delListID.length; ++var1) {
            if (delListID[var1] == var0) {
                delListID[var1] = -1;
            }
        }

    }

    public static void m() {
        for (int var0 = 0; var0 < delListID.length; ++var0) {
            if (delListID[var0] > 0) {
                for (int var1 = 0; var1 <= var0; ++var1) {
                    if (delListID[var1] == -1) {
                        delListID[var1] = delListID[var0];
                        delListID[var0] = -1;
                        break;
                    }
                }
            }
        }

    }

    public static boolean isItemCanPickUp(ItemTemplate itemTemplate) {
        if (b instanceof As20) {
            if (itemTemplate.type == 19) {
                return true;
            } else if ((itemTemplate.type == 16 || itemTemplate.type == 17) && itemTemplate.level == 10) {
                return true;
            } else {
                Char var3 = Char.getMyChar();
                if (Char.countNullSlot() <= 6) {
                    return false;
                } else if ((var3.ctaskId < 13 || var3.ctaskId == 13 && var3.arrItemBody[1] != null && var3.arrItemBody[1].upgrade < 2) && itemTemplate.type == 26 && itemTemplate.id > 0) {
                    return true;
                } else {
                    int var2 = var3.cgender == 1 ? 124 : 125;
                    return var3.ctaskId <= 12 && (itemTemplate.id == 174 && !Char.hasItem(174) || itemTemplate.id == var2 && !Char.hasItem(var2));
                }
            }
        } else if (b instanceof As10) {
            return itemTemplate.type == 19;
        } else if (itemTemplate.type == 19) {
            return Char.dn;
        } else if (itemTemplate.type != 16 && itemTemplate.type != 17) {
            if (itemTemplate.type == 26) {
                return Char.dp && itemTemplate.id >= Char.ew - 1;
            } else if (itemTemplate.isTypeBody()) {
                return (Char.tickNhatTrangBi || b instanceof Stanima) && itemTemplate.level >= Char.ey;
            } else if (itemTemplate.isTypeTask()) {
                return Char.tickNhatVPNhiemVu;
            } else if (itemTemplate.isTypeMounts() || itemTemplate.isTypeBijuu()) {
                return Char.tickNhatTrangBiLa;
            } else {
                if (itemTemplate.type == 27) {
                    if (itemTemplate.description.startsWith("Vật phẩm sự kiện") || itemTemplate.description.startsWith("Vật phẩm Sự kiện") || itemTemplate.description.startsWith("Item sự kiện") || itemTemplate.description.startsWith("Sự kiện")) {
                        return Char.tickNhatVPSK;
                    }

                    if (itemTemplate.name.startsWith("Sách võ công")) {
                        return Char.tickNhatSVC;
                    }

                    if (TileMap.e(TileMap.mapID) && itemTemplate.id == 38) {
                        return false;
                    }
                }

                for (int var1 = 0; var1 < j.length; ++var1) {
                    if (j[var1] > 0 && itemTemplate.id == j[var1]) {
                        return true;
                    }
                }

                return Char.tickNhatTatCa;
            }
        } else {
            return Char.doa && itemTemplate.level >= Char.ev;
        }
    }

    public static boolean isItemDel(Item item) {
        if (b instanceof As10) {
            return false;
        } else if (item == null) {
            return false;
        } else if (item.upgrade > 0) {
            item.v = true;
            return false;
        } else {
            for (int i = 0; i < delListID.length; ++i) {
                if (delListID[i] > 0 && item.template.id == delListID[i]) {
                    if (item.template.type >= 29 && item.template.type <= 32 && item.getTinhLuyen() > 0) {
                        item.v = true;
                        return false;
                    }
                    return true;
                }
            }

            if (!item.v && System.currentTimeMillis() - item.u >= 5000L) {
                if (b instanceof Stanima && item.template.type < 10 && item.template.level < 70) {
                    return true;
                } else if (item.template.type == 26 && item.template.id < (Char.dp ? Char.ew : Char.ex) - 1) {
                    return true;
                } else {
                    if (item.template.type < 10 || item.template.type >= 29 && item.template.type <= 32) {
                        if (!item.s && System.currentTimeMillis() - item.t > 5000L) {
                            item.t = System.currentTimeMillis();
                            Service.getInstance().requestItemInfo(item.typeUI, item.indexUI);
                            if (!LockGame.s() || !item.s) {
                                return false;
                            }
                        }

                        if (item.template.type >= 29 && item.template.type <= 32) {
                            if (item.saleCoinLock != 0 || item.getTinhLuyen() > 0) {
                                item.v = true;
                                return false;
                            }
                            return true;
                        }

                        if (item.saleCoinLock == 5) {
                            return true;
                        }
                        
                        if (item.hasOption(85)) {
                            item.v = true;
                            return false;
                        }

                        if (item.template.type == 1) {
                            if (item.hasOption(0) && item.hasOption(1)) {
                                if (!item.hasOption(8) && !item.hasOption(9)) {
                                    return true;
                                }

                                if (!item.hasOption(10)) {
                                    return true;
                                }

                                item.v = true;
                                return false;
                            }

                            return true;
                        }

                        if (!item.hasOption(6) || !item.hasOption(7)) {
                            return true;
                        }

                        if (item.countOptionByType(0) < 2) {
                            return true;
                        }

                        if (item.template.type == 8 && !item.hasOption(16)) {
                            return true;
                        }
                    }

                    item.v = true;
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    public static void n() {
        Char var0 = Char.getMyChar();
        if (!Char.hasItem(37) && !Char.hasItem(35)) {
            Npc var1;
            if ((var1 = GameScr.i(13)) != null && Math.abs(var1.cx - var0.cx) <= 200 && Math.abs(var1.cy - var0.cy) <= 200) {
                Char.c(var1.cx > 200 ? var1.cx - 200 : var1.cx + 200, var1.cy);
            }

            Service.getInstance().openUIZone();
        } else {
            Char.c(var0.cx, TileMap.d);
        }

    }

    public final boolean f(String var1) {
        int var3 = 0;
        StringBuffer var2 = new StringBuffer();
        StringBuffer var4 = new StringBuffer();

        int var5;
        int var7;
        label1068:
        for (var5 = 0; var5 < var1.length(); ++var5) {
            if ((var7 = var1.charAt(var5)) >= 48 && var7 <= 57 || var7 == 32) {
                while (true) {
                    if (var5 >= var1.length() || (var7 = var1.charAt(var5)) < 48 || var7 > 57) {
                        break label1068;
                    }

                    var4.append((char) var7);
                    ++var5;
                }
            }

            var2.append((char) var7);
        }

        String var22 = var2.toString().toLowerCase();
        if (var4.length() > 0) {
            try {
                var3 = Integer.parseInt(var4.toString());
            } catch (Exception var29) {
            }
        }

        if (var22.equals("s")) {
            if (var3 == 0) {
                GameScr.chatPopup("Chạy đi đou với tốc độ 0?");
            } else if (var3 > 100) {
                GameScr.chatPopup("Tốc giày nên để <= 100 để ko bị giật!");
            } else {
                GameScr.chatPopup("Fake tốc chạy " + var3);
                ag = var3;
                af = true;
            }

            return true;
        } else if (var22.equals("rs")) {
            GameScr.chatPopup("Reset tốc chạy");
            af = false;
            return true;
        } else if (var22.equals("n")) {
            if (var3 == 0) {
                var3 = 100;
            }

            GameScr.chatPopup("Fake tầm ngang " + var3);
            ah = true;
            ai = var3;
            return true;
        } else if (var22.equals("c")) {
            if (var3 == 0) {
                var3 = 100;
            }

            GameScr.chatPopup("Fake tầm cao " + var3);
            aj = true;
            ak = var3;
            return true;
        } else if (var22.equals("m")) {
            if (var3 == 0) {
                var3 = 1;
            }

            GameScr.chatPopup("Fake lan " + var3);
            al = true;
            am = var3;
            return true;
        } else if (var22.equals("rsk")) {
            GameScr.chatPopup("Reset fake tầm lan skill");
            al = false;
            ah = false;
            aj = false;
            return true;
        } else if (var22.equals("set")) {
            (new MenuADV()).show();
            return true;
        }else if (!var22.equals("bang") && !var22.equals("fz")) {
            if (!var22.equals("bangb") && !var22.equals("fb")) {
                if (!var22.equals("bangs") && !var22.equals("fs")) {
                    if (!var22.equals("pbang") && !var22.equals("wz")) {
                        if (var22.equals("u")) {
                            if (var3 == 0) {
                                var3 = 50;
                            }

                            GameScr.chatPopup("Khinh kông " + var3);
                            Char.c(Char.getMyChar().cx, Char.getMyChar().cy - var3);
                            return true;
                        } else if (var22.equals("d")) {
                            if (var3 == 0) {
                                var3 = 50;
                            }

                            GameScr.chatPopup("Độn thổ " + var3);
                            Char.c(Char.getMyChar().cx, Char.getMyChar().cy + var3);
                            return true;
                        } else if (var22.equals("l")) {
                            if (var3 == 0) {
                                var3 = 50;
                            }

                            GameScr.chatPopup("Dịch trái " + var3);
                            Char.c(Char.getMyChar().cx - var3, Char.getMyChar().cy);
                            return true;
                        } else if (var22.equals("r")) {
                            if (var3 == 0) {
                                var3 = 50;
                            }

                            GameScr.chatPopup("Dịch phải " + var3);
                            Char.c(Char.getMyChar().cx + var3, Char.getMyChar().cy);
                            return true;
                        } else {
                            Char var36;
                            if (var22.equals("g")) {
                                if ((var36 = Char.getMyChar()).charFocus != null) {
                                    GameScr.chatPopup("MoveTo " + var36.charFocus.charName);
                                    Char.c(var36.charFocus.cx, var36.charFocus.cy);
                                } else if (var36.npcFocus != null) {
                                    GameScr.chatPopup("MoveTo " + var36.npcFocus.charName);
                                    Char.c(var36.npcFocus.cx, var36.npcFocus.cy);
                                } else if (var36.mobFocus != null) {
                                    GameScr.chatPopup("MoveTo " + var36.mobFocus.b().g);
                                    Char.c(var36.mobFocus.i, var36.mobFocus.j);
                                } else if (var36.itemFocus != null) {
                                    GameScr.chatPopup("MoveTo " + var36.itemFocus.h.name);
                                    Char.c(var36.itemFocus.a, var36.itemFocus.b);
                                }

                                return true;
                            } else if (var22.equals("ta")) {
                                GameScr.getInstance().openUI(9);
                                return true;
                            } else if (var22.equals("sw")) {
                                GameScr.getInstance().openUI(36);
                                return true;
                            } else if (var22.equals("up")) {
                                Class_au.a().b();
                                return true;
                            } else if (var22.equals("aq")) {
                                if ((var36 = Char.getMyChar()).mobFocus != null) {
                                    GameScr.vMobAttack.removeElement(var36.mobFocus);
                                }

                                return true;
                            } else if (var22.equals("z")) {
                                GameScr.chatPopup((Char.tickChuyenMapHetBoss ? "Tắt" : "Bật") + " auto chuyển map");
                                Char.tickChuyenMapHetBoss = !Char.tickChuyenMapHetBoss;
                                return true;
                            } else if (var22.equals("rm")) {
                                GameScr.chatPopup((Char.tickReMap ? "Tắt" : "Bật") + " auto next map");
                                Char.tickReMap = !Char.tickReMap;
                                return true;
                            } else if (var22.equals("aq")) {
                                if ((var36 = Char.getMyChar()).mobFocus != null) {
                                    GameScr.vMobAttack.removeElement(var36.mobFocus);
                                }

                                return true;
                            } else if (var22.equals("x")) {
                                if (var3 == 0) {
                                    var3 = -1;
                                }

                                GameScr.chatPopup("KC Nhặt " + var3);
                                l = var3;
                                return true;
                            } else if (var22.equals("kts")) {
                                if (var3 == 0) {
                                    var3 = -1;
                                }

                                GameScr.chatPopup("KC Tàn sát " + var3);
                                n = Char.getMyChar().cx;
                                o = Char.getMyChar().cy;
                                m = var3;
                                return true;
                            } else {
                                Mob var33;
                                if (var22.equals("ts")) {
                                    if ((var33 = Mob.b(var3)) == null) {
                                        GameScr.chatPopup("Tàn sát all");
                                        this.tanSat(-1, TileMap.mapID);
                                    } else {
                                        GameScr.chatPopup("Tàn sát " + var33.b().g + " lv " + var3);
                                        this.tanSat(var33.s, TileMap.mapID);
                                    }

                                    return true;
                                } else {
                                    Class_cx var10000;
                                    if (var22.equals("tsx")) {
                                        var10000 = var3 >= 0 && var3 < Mob.b.length ? Mob.b[var3] : null;
                                        if (var10000 == null) {
                                            GameScr.chatPopup("Tàn sát all");
                                            this.tanSat(-1, TileMap.mapID);
                                        } else {
                                            GameScr.chatPopup("Tàn sát " + var10000.g + " id " + var3);
                                            this.tanSat(var10000.e, TileMap.mapID);
                                        }

                                        return true;
                                    } else if (var22.equals("tsa")) {
                                        GameScr.chatPopup("Tàn sát all");
                                        this.tanSat(-1, TileMap.mapID);
                                        return true;
                                    } else if (var22.equals("anv")) {
                                        if (TileMap.mapID != 1 && TileMap.mapID != 27 && TileMap.mapID != 72) {
                                            GameScr.chatPopup("Bạn phải đứng ở trường để Auto");
                                            return true;
                                        } else {
                                            GameScr.chatPopup("Auto Nhiệm Vụ Hằng Ngày");
                                            this.d();
                                            return true;
                                        }
                                    } else if (var22.equals("att")) {
                                        GameScr.chatPopup("Auto Tà Thú");
                                        this.e();
                                        return true;
                                    } else if (var22.equals("ak")) {
                                        if (b == at) {
                                            GameScr.chatPopup("Tắt tự đánh");
                                            f();
                                        } else {
                                            GameScr.chatPopup("Bật tự đánh");
                                            this.p();
                                        }

                                        return true;
                                    }else if (var22.equals("adv")) {
                                        GameScr.chatPopup("Auto Danh Vọng");
                                        onAutoDV();
                                        return true;
                                     } else if (var22.equals("ld")) {
                                        settingADV.show();
                                        return true;
                                     } else if (var22.equals("pk")) {
                                        an = !an;
                                        GameScr.chatPopup((an ? " Bật " : " Tắt ") + "auto pk!");
                                        return true;
                                    } else if (!var22.equals("e") && !var22.equals("pe")) {
                                        if (var22.equals("k")) {
                                            GameScr.chatPopup("Chuyển Khu: " + var3);
                                            GameScr.getInstance().j(var3);
                                            return true;
                                        } else if (var22.equals("ltd")) {
                                            if (!TileMap.f(TileMap.mapID) && !TileMap.d(TileMap.mapID)) {
                                                GameScr.chatPopup("Hãy đứng ở làng hoặc trường để lưu tọa độ");
                                            } else {
                                                GameScr.h(5);
                                                Service.getInstance().openMenu(5);
                                                Service.getInstance().menu(5, 1, 0);
                                            }

                                            return true;
                                        } else if (var22.equals("nm")) {
                                            GameScr.chatPopup("Next map: " + var3);
                                            TileMap.m(var3);
                                            return true;
                                        } else if (var22.equals("gm")) {
                                            if (var3 < TileMap.mapNames.length && var3 >= 0) {
                                                GameScr.chatPopup("Go to: " + TileMap.mapNames[var3]);
                                                TileMap.l(var3);
                                                return true;
                                            } else {
                                                return true;
                                            }
                                        } else if (var22.equals("npc")) {
                                            if (var3 < Npc.arrNpcTemplate.length) {
                                                GameScr.chatPopup("Act NPC: " + Npc.arrNpcTemplate[var3].name);
                                                GameScr.h(var3);
                                            }

                                            return true;
                                        } else if (var22.equals("hs")) {
                                            GameScr.chatPopup("Next to hirosaki");
                                            TileMap.l(1);
                                            return true;
                                        } else if (var22.equals("hr")) {
                                            GameScr.chatPopup("Next to haruna");
                                            TileMap.l(27);
                                            return true;
                                        } else if (var22.equals("oz")) {
                                            GameScr.chatPopup("Next to Ozawa(Oozaka)");
                                            TileMap.l(72);
                                            return true;
                                        } else if (var22.equals("kj")) {
                                            GameScr.chatPopup("Next to Kojin");
                                            TileMap.l(10);
                                            return true;
                                        } else if (var22.equals("sz")) {
                                            GameScr.chatPopup("Next to Sanzu");
                                            TileMap.l(17);
                                            return true;
                                        } else if (var22.equals("tn")) {
                                            GameScr.chatPopup("Next to Tone");
                                            TileMap.l(22);
                                            return true;
                                        } else if (var22.equals("lc")) {
                                            GameScr.chatPopup("Next to Chài");
                                            TileMap.l(32);
                                            return true;
                                        } else if (var22.equals("ck")) {
                                            GameScr.chatPopup("Next to Chakumi");
                                            TileMap.l(38);
                                            return true;
                                        } else if (var22.equals("eg")) {
                                            GameScr.chatPopup("Next to Echigo");
                                            TileMap.l(43);
                                            return true;
                                        } else if (var22.equals("os")) {
                                            GameScr.chatPopup("Next to Oshin");
                                            TileMap.l(48);
                                            return true;
                                        } else if (var22.equals("mnv")) {
                                            GameScr.chatPopup("Next to Map Nhiệm Vụ");
                                            TileMap.l(GameScr.ad());
                                            return true;
                                        } else if (var22.equals("mnvp")) {
                                            GameScr.chatPopup("Next to Map Nhiệm Vụ Phụ");
                                            TaskOrder var39;
                                            if ((var39 = Char.l(0)) != null) {
                                                TileMap.l(var39.mapId);
                                            }

                                            return true;
                                        } else {
                                            ItemMap var38;
                                            if (var22.equals("add")) {
                                                GameScr.chatPopup("Thêm vật phẩm vào ds nhặt");
                                                if ((var38 = Char.getMyChar().itemFocus) != null) {
                                                    a(var38.h.id);
                                                }

                                                return true;
                                            } else if (var22.equals("del")) {
                                                GameScr.chatPopup("Xóa vật phẩm khỏi ds nhặt");
                                                if ((var38 = Char.getMyChar().itemFocus) != null) {
                                                    b(var38.h.id);
                                                }

                                                return true;
                                            } else {
                                                ItemTemplate var37;
                                                if (var22.equals("ait")) {
                                                    if ((var37 = ItemTemplateManager.get((short) var3)) != null) {
                                                        GameScr.chatPopup("Thêm " + var37.name + " vào ds nhặt");
                                                        a(var37.id);
                                                    }

                                                    return true;
                                                } else if (var22.equals("dit")) {
                                                    if ((var37 = ItemTemplateManager.get((short) var3)) != null) {
                                                        GameScr.chatPopup("Xóa " + var37.name + " khỏi ds nhặt");
                                                        b(var37.id);
                                                    }

                                                    return true;
                                                } else if (var22.equals("ajt")) {
                                                    if ((var37 = ItemTemplateManager.get((short) var3)) != null) {
                                                        GameScr.chatPopup("Thêm " + var37.name + " vào ds nhặt");
                                                        c(var37.id);
                                                    }

                                                    return true;
                                                } else if (var22.equals("djt")) {
                                                    if ((var37 = ItemTemplateManager.get((short) var3)) != null) {
                                                        GameScr.chatPopup("Xóa " + var37.name + " khỏi ds nhặt");
                                                        d(var37.id);
                                                    }

                                                    return true;
                                                } else if (var22.equals("cnhat")) {
                                                    if (p) {
                                                        GameScr.chatPopup("Bật nhặt xa");
                                                    } else {
                                                        GameScr.chatPopup("Bật hút VP");
                                                    }

                                                    p = !p;
                                                    return true;
                                                } else if (var22.equals("ruong")) {
                                                    GameScr.getInstance().showTabBag();
                                                    return true;
                                                } else if (var22.equals("vpnhat")) {
                                                    GameScr.getInstance().openUI(46);
                                                    return true;
                                                } else if (var22.equals("die")) {
                                                    n();
                                                    return true;
                                                } else if (var22.equals("dcvt")) {
                                                    if (q) {
                                                        GameScr.chatPopup("Tắt đánh chuyển vị trí");
                                                    } else {
                                                        GameScr.chatPopup("Bật đánh chuyển vị trí");
                                                    }

                                                    q = !q;
                                                    if (Char.em) {
                                                        Service.getInstance().k("dcvt " + (q ? 1 : 0));
                                                    }

                                                    return true;
                                                } else if (var22.equals("avt")) {
                                                    GameScr.chatPopup("Thêm vị trí " + s.size());
                                                    s.addElement(new Integer(Char.getMyChar().cx));
                                                    t.addElement(new Integer(Char.getMyChar().cy));
                                                    if (Char.em) {
                                                        Service.getInstance().k("avt " + Char.getMyChar().cx + " " + Char.getMyChar().cy);
                                                    }

                                                    return true;
                                                } else if (var22.equals("dvt")) {
                                                    GameScr.chatPopup("Xóa hết vị trí");
                                                    s.removeAllElements();
                                                    t.removeAllElements();
                                                    if (Char.em) {
                                                        Service.getInstance().k("dvt");
                                                    }

                                                    return true;
                                                } else if (var22.equals("dvtx")) {
                                                    GameScr.chatPopup("Xóa vị trí " + var3);
                                                    s.removeElementAt(var3);
                                                    t.removeElementAt(var3);
                                                    if (Char.em) {
                                                        Service.getInstance().k("dtvx " + var3);
                                                    }

                                                    return true;
                                                } else if (var22.equals("dck")) {
                                                    if (u = !u) {
                                                        GameScr.chatPopup("Tắt đánh chuyển khu");
                                                    } else {
                                                        GameScr.chatPopup("Bật đánh chuyển khu");
                                                        GameCanvas.ak.a("Khu", new Command("Đặt", 1100090), 1);
                                                        GameCanvas.ak.tfInput.a(k());
                                                    }

                                                    return true;
                                                } else if (var22.equals("glv")) {
                                                    if (x) {
                                                        GameScr.chatPopup("Tắt giữ lv");
                                                    } else {
                                                        GameScr.chatPopup("Bật giữ lv");
                                                    }

                                                    x = !x;
                                                    return true;
                                                } else if (var22.equals("addn")) {
                                                    GameScr.chatPopup("Thêm nhóm");
                                                    if ((var36 = Char.getMyChar().charFocus) != null) {
                                                        if (!c(var36.charName)) {
                                                            h.addElement(var36.charName);
                                                        }

                                                        Service.getInstance().addParty(var36.charName);
                                                    }

                                                    return true;
                                                } else if (var22.equals("cn")) {
                                                    GameScr.chatPopup("Xóa nhóm");
                                                    g = null;
                                                    h.removeAllElements();
                                                    s();
                                                    return true;
                                                } else {
                                                    String var30;
                                                    if (var22.equals("pt")) {
                                                        if (!Char.getMyChar().charName.equals(g)) {
                                                            GameScr.chatPopup("Bạn không là nhóm trưởng");
                                                            return true;
                                                        } else {
                                                            GameScr.chatPopup("PT nhóm");

                                                            for (var5 = 0; var5 < h.size(); ++var5) {
                                                                if (!d(var30 = (String) h.elementAt(var5))) {
                                                                    Service.getInstance().addParty(var30);
                                                                }

                                                                if (b instanceof Class_al) {
                                                                    Service.getInstance().a(var30, "pkm " + b.h);
                                                                    Service.getInstance().a(var30, "pkk " + b.i);
                                                                } else if (b != null) {
                                                                    Service.getInstance().a(var30, "map " + b.h);
                                                                    Service.getInstance().a(var30, "khu " + b.i);
                                                                }
                                                            }

                                                            return true;
                                                        }
                                                    } else if (var22.equals("sn")) {
                                                        GameScr.chatPopup("Lưu nhóm");
                                                        s();
                                                        return true;
                                                    } else if (var22.equals("tsn")) {
                                                        if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).a == Char.getMyChar().charID) {
                                                            if ((var33 = Mob.b(var3)) == null) {
                                                                GameScr.chatPopup("Tàn sát nhóm all");
                                                                this.tanSat(-1, TileMap.mapID);
                                                            } else {
                                                                GameScr.chatPopup("Tàn sát nhóm " + var33.b().g + " lv " + var3);
                                                                this.tanSat(var33.s, TileMap.mapID);
                                                            }

                                                            as.g = true;
                                                            Service.getInstance().k("ts " + as.h + " " + as.i + " " + as.a);
                                                            return true;
                                                        } else {
                                                            GameScr.chatPopup("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                                            return true;
                                                        }
                                                    } else if (var22.equals("tsnx")) {
                                                        if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).a == Char.getMyChar().charID) {
                                                            var10000 = var3 >= 0 && var3 < Mob.b.length ? Mob.b[var3] : null;
                                                            if (var10000 == null) {
                                                                GameScr.chatPopup("Tàn sát nhóm all");
                                                                this.tanSat(-1, TileMap.mapID);
                                                            } else {
                                                                GameScr.chatPopup("Tàn sát nhóm " + var10000.g + " id " + var3);
                                                                this.tanSat(var10000.e, TileMap.mapID);
                                                            }

                                                            as.g = true;
                                                            Service.getInstance().k("ts " + as.h + " " + as.i + " " + as.a);
                                                            return true;
                                                        } else {
                                                            GameScr.chatPopup("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                                            return true;
                                                        }
                                                    } else if (var22.equals("tsan")) {
                                                        if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).a == Char.getMyChar().charID) {
                                                            GameScr.chatPopup("Tàn sát nhóm all");
                                                            this.tanSat(-1, TileMap.mapID);
                                                            as.g = true;
                                                            Service.getInstance().k("tsa " + as.h + " " + as.i);
                                                            return true;
                                                        } else {
                                                            GameScr.chatPopup("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                                            return true;
                                                        }
                                                    } else if (var22.equals("attn")) {
                                                        if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).a == Char.getMyChar().charID) {
                                                            GameScr.chatPopup("Auto Tà Thú Nhóm");
                                                            this.e();
                                                            e.g = true;
                                                            Service.getInstance().k("att " + e.h + " " + e.i + " " + e.a);
                                                            return true;
                                                        } else {
                                                            GameScr.chatPopup("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                                            return true;
                                                        }
                                                    } else if (var22.equals("buff")) {
                                                        GameScr.chatPopup("Bật Buff HS Xa");
                                                        this.b(true, true);
                                                        return true;
                                                    } else if (var22.equals("bux")) {
                                                        GameScr.chatPopup("Bật Buff Xa");
                                                        this.b(true, false);
                                                        return true;
                                                    } else if (var22.equals("hsx")) {
                                                        GameScr.chatPopup("Bật HS Xa");
                                                        this.b(false, true);
                                                        return true;
                                                    } else {
                                                        int var8;
                                                        if (var22.equals("cy")) {
                                                            if (b == null) {
                                                                GameScr.chatPopup("Bạn chưa up yên");
                                                            } else {
                                                                var7 = Char.getMyChar().yen - b.m;
                                                                var8 = (int) ((System.currentTimeMillis() - b.o) / 1000L);
                                                                GameScr.chatPopup("Up " + var7 + " trong " + NinjaUtil.b(var8) + " perh=" + var7 / var8 * 3600);
                                                            }

                                                            return true;
                                                        } else {
                                                            int var24;
                                                            if (var22.equals("clv")) {
                                                                if (b == null) {
                                                                    GameScr.chatPopup("Bạn chưa up level");
                                                                } else {
                                                                    long var35;
                                                                    float var25 = (float) ((var35 = Char.getMyChar().k - b.n) * 10000L / GameScr.exps[Char.getMyChar().cLevel]) / 100.0F;
                                                                    var24 = (int) ((System.currentTimeMillis() - b.o) / 1000L);
                                                                    long var34;
                                                                    float var27 = (float) ((var34 = var35 * 3600L / (long) var24) * 10000L / GameScr.exps[Char.getMyChar().cLevel]) / 100.0F;
                                                                    GameScr.chatPopup("Up " + var35 + " - " + var25 + "% trong " + NinjaUtil.b(var24) + " perh=" + var34 + " - " + var27 + "%");
                                                                }

                                                                return true;
                                                            } else if (var22.equals("st")) {
                                                                if ((var33 = Mob.b(var3)) == null) {
                                                                    GameScr.chatPopup("Stanima all");
                                                                    this.c(-1, TileMap.mapID);
                                                                } else {
                                                                    GameScr.chatPopup("Stanima " + var33.b().g + " lv " + var3);
                                                                    this.c(var33.s, TileMap.mapID);
                                                                }

                                                                return true;
                                                            } else if (var22.equals("sta")) {
                                                                GameScr.chatPopup("Stanima all");
                                                                this.c(-1, TileMap.mapID);
                                                                return true;
                                                            } else if (var22.equals("stn")) {
                                                                if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).a == Char.getMyChar().charID) {
                                                                    if ((var33 = Mob.b(var3)) == null) {
                                                                        GameScr.chatPopup("Stanima nhóm all");
                                                                        this.c(-1, TileMap.mapID);
                                                                    } else {
                                                                        GameScr.chatPopup("Stanima nhóm " + var33.b().g + " lv " + var3);
                                                                        this.c(var33.s, TileMap.mapID);
                                                                    }

                                                                    c.g = true;
                                                                    Service.getInstance().k("st " + c.h + " " + c.i + " " + c.b);
                                                                    return true;
                                                                } else {
                                                                    GameScr.chatPopup("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                                                    return true;
                                                                }
                                                            } else if (var22.equals("stan")) {
                                                                if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).a == Char.getMyChar().charID) {
                                                                    GameScr.chatPopup("Stanima nhóm all");
                                                                    this.c(-1, TileMap.mapID);
                                                                    c.g = true;
                                                                    Service.getInstance().k("sta " + c.h + " " + c.i);
                                                                    return true;
                                                                } else {
                                                                    GameScr.chatPopup("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                                                    return true;
                                                                }
                                                            } else if (var22.equals("stx")) {
                                                                var10000 = var3 >= 0 && var3 < Mob.b.length ? Mob.b[var3] : null;
                                                                if (var10000 == null) {
                                                                    GameScr.chatPopup("Tàn sát all");
                                                                    this.tanSat(-1, TileMap.mapID);
                                                                } else {
                                                                    GameScr.chatPopup("Tàn sát " + var10000.g + " id " + var3);
                                                                    this.c(var10000.e, TileMap.mapID);
                                                                }

                                                                return true;
                                                            } else if (!var22.equals("stnx")) {
                                                                if (var22.equals("sts")) {
                                                                    GameScr.chatPopup("Step Stanima");
                                                                    c.e();
                                                                    if (Char.getMyChar().charName.equals(g) && GameScr.vParty.size() > 0) {
                                                                        Service.getInstance().k("sts");
                                                                    }

                                                                    return true;
                                                                } else if (var22.equals("stb")) {
                                                                    if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).a != Char.getMyChar().charID) {
                                                                        if (Char.getMyChar().nClass.classId != 6) {
                                                                            GameScr.chatPopup("Bạn không phải là quạt");
                                                                            return true;
                                                                        } else {
                                                                            GameScr.chatPopup("Stanima Buff HS");
                                                                            this.a(true, true);
                                                                            return true;
                                                                        }
                                                                    } else {
                                                                        GameScr.chatPopup("Chưa có nhóm hoặc bạn là nhóm trưởng");
                                                                        return true;
                                                                    }
                                                                } else if (var22.equals("stbx")) {
                                                                    if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).a != Char.getMyChar().charID) {
                                                                        if (Char.getMyChar().nClass.classId != 6) {
                                                                            GameScr.chatPopup("Bạn không phải là quạt");
                                                                            return true;
                                                                        } else {
                                                                            GameScr.chatPopup("Stanima Buff");
                                                                            this.a(true, false);
                                                                            return true;
                                                                        }
                                                                    } else {
                                                                        GameScr.chatPopup("Chưa có nhóm hoặc bạn là nhóm trưởng");
                                                                        return true;
                                                                    }
                                                                } else if (var22.equals("sths")) {
                                                                    if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).a != Char.getMyChar().charID) {
                                                                        if (Char.getMyChar().nClass.classId != 6) {
                                                                            GameScr.chatPopup("Bạn không phải là quạt");
                                                                            return true;
                                                                        } else {
                                                                            GameScr.chatPopup("Stanima HS");
                                                                            this.a(false, true);
                                                                            return true;
                                                                        }
                                                                    } else {
                                                                        GameScr.chatPopup("Chưa có nhóm hoặc bạn là nhóm trưởng");
                                                                        return true;
                                                                    }
                                                                } else if (var22.equals("pkb")) {
                                                                    GameScr.chatPopup("PK Thần Thú");
                                                                    a((Auto) (new Class_al(TileMap.mapID)));
                                                                    if (g != null && Char.getMyChar().charName.equals(g) && GameScr.vParty.size() > 1) {
                                                                        Service.getInstance().k("pkm " + TileMap.mapID);
                                                                    }

                                                                    return true;
                                                                } else if (var22.equals("pkk")) {
                                                                    GameScr.chatPopup("PK Thần Thú");
                                                                    Class_al var32;
                                                                    (var32 = new Class_al(TileMap.mapID)).i = var3;
                                                                    a((Auto) var32);
                                                                    if (g != null && Char.getMyChar().charName.equals(g) && GameScr.vParty.size() > 1) {
                                                                        Service.getInstance().k("pkm " + TileMap.mapID);
                                                                        Service.getInstance().k("pkk " + var3);
                                                                    }

                                                                    return true;
                                                                } else if (var22.equals("lb")) {
                                                                    var30 = "";

                                                                    for (var8 = 0; var8 < GameScr.vMobAttack.size(); ++var8) {
                                                                        Mob var23;
                                                                        if ((var23 = (Mob) GameScr.vMobAttack.elementAt(var8)).y) {
                                                                            var30 = var30 + var23.b().g + " lv: " + var23.x + ", ";
                                                                        }
                                                                    }

                                                                    GameScr.chatPopup("Mob: " + var30);
                                                                    return true;
                                                                } else if (var22.equals("tb")) {
                                                                    (new Thread(new Class_gn(this))).start();
                                                                    return true;
                                                                } else if (var22.equals("sell")) {
                                                                    GameScr.chatPopup("Auto Sell");
                                                                    this.q();
                                                                    return true;
                                                                } else if (var22.equals("h")) {
                                                                    Calendar var31 = Class_fa.b();
                                                                    GameScr.chatPopup("Time " + var31.get(11) + ":" + var31.get(12) + ":" + var31.get(13));
                                                                    return true;
                                                                } else if (var22.equals("dt")) {
                                                                    a((Auto) (new Class_ah()));
                                                                    return true;
                                                                } else if (var22.equals("dh")) {
                                                                    a((Auto) (new Class_ai()));
                                                                    return true;
                                                                } else if (var22.equals("nv")) {
                                                                    a((Auto) (new Class_as()));
                                                                    return true;
                                                                } else if (var22.equals("ld")) {
                                                                    (new Thread(new Class_ab(this))).start();
                                                                    return true;
                                                                } else if (var22.equals("f")) {
                                                                    GameScr.getInstance().openUI(var3);
                                                                    return true;
                                                                } else if (var1.equals("SSSSSSSSSS")) {
                                                                    GameScr.chatPopup("Hang động 9x");
                                                                    a((Auto) (new Class_aj()));
                                                                    if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).a == Char.getMyChar().charID) {
                                                                        Service.getInstance().k("EEEEEEEEEE");
                                                                    }

                                                                    return true;
                                                                } else {
                                                                    if (var1.length() == 4) {
                                                                        if (var1.equals("as10")) {
                                                                            a((Auto) (new As10()));
                                                                            return true;
                                                                        }

                                                                        if (var1.equals("as20")) {
                                                                            a((Auto) (new As20(0)));
                                                                            return true;
                                                                        }

                                                                        if (var1.equals("a20k")) {
                                                                            a((Auto) (new As20(1)));
                                                                            return true;
                                                                        }

                                                                        if (var1.equals("a20t")) {
                                                                            a((Auto) (new As20(2)));
                                                                            return true;
                                                                        }

                                                                        if (var1.equals("a20u")) {
                                                                            a((Auto) (new As20(3)));
                                                                            return true;
                                                                        }

                                                                        if (var1.equals("a20c")) {
                                                                            a((Auto) (new As20(4)));
                                                                            return true;
                                                                        }

                                                                        if (var1.equals("a20d")) {
                                                                            a((Auto) (new As20(5)));
                                                                            return true;
                                                                        }

                                                                        if (var1.equals("a20q")) {
                                                                            a((Auto) (new As20(6)));
                                                                            return true;
                                                                        }
                                                                    } else {
                                                                        if (var22.equals("boss")) {
                                                                            GameScr.chatPopup("Auto Boss " + var3);
                                                                            a((Auto) (new Class_am(var3)));
                                                                            return true;
                                                                        }

                                                                        if (var22.equals("kpk")) {
                                                                            GameScr.chatPopup("Khu PK " + var3);
                                                                            Auto.u = var3;
                                                                            return true;
                                                                        }

                                                                        if (var22.equals("cpk")) {
                                                                            GameScr.chatPopup("Xóa ds PK");
                                                                            Class_ao.b();
                                                                            return true;
                                                                        }

                                                                        String[] var29;
                                                                        if (var1.startsWith("apk")) {
                                                                            if ((var29 = c(var1, " ")).length > 1) {
                                                                                GameScr.chatPopup("Thêm " + var29[1] + " vào ds PK");
                                                                                Class_ao.a(var29[1]);
                                                                            } else if (Char.getMyChar().charFocus != null) {
                                                                                GameScr.chatPopup("Thêm " + Char.getMyChar().charFocus.charName + " vào ds PK");
                                                                                Class_ao.a(Char.getMyChar().charFocus.charName);
                                                                            }

                                                                            return true;
                                                                        }

                                                                        if (var1.startsWith("dpk")) {
                                                                            if ((var29 = c(var1, " ")).length > 1) {
                                                                                GameScr.chatPopup("Xóa " + var29[1] + " khỏi ds PK");
                                                                                Class_ao.b(var29[1]);
                                                                            } else if (Char.getMyChar().charFocus != null) {
                                                                                GameScr.chatPopup("Xóa " + Char.getMyChar().charFocus.charName + " khỏi ds PK");
                                                                                Class_ao.b(Char.getMyChar().charFocus.charName);
                                                                            }

                                                                            return true;
                                                                        }

                                                                        if (var22.equals("chs")) {
                                                                            GameScr.chatPopup("Xóa ds HS");
                                                                            r();
                                                                            return true;
                                                                        }

                                                                        if (var1.startsWith("ahs")) {
                                                                            if ((var29 = c(var1, " ")).length > 1) {
                                                                                GameScr.chatPopup("Thêm " + var29[1] + " vào ds HS");
                                                                                i(var29[1]);
                                                                            } else if (Char.getMyChar().charFocus != null) {
                                                                                GameScr.chatPopup("Thêm " + Char.getMyChar().charFocus.charName + " vào ds HS");
                                                                                i(Char.getMyChar().charFocus.charName);
                                                                            }

                                                                            return true;
                                                                        }

                                                                        if (var22.equals("dhs")) {
                                                                            if ((var29 = c(var1, " ")).length > 1) {
                                                                                GameScr.chatPopup("Xóa " + var29[1] + " khỏi ds HS");
                                                                                j(var29[1]);
                                                                            } else if (Char.getMyChar().charFocus != null) {
                                                                                GameScr.chatPopup("Xóa " + Char.getMyChar().charFocus.charName + " khỏi ds PK");
                                                                                j(Char.getMyChar().charFocus.charName);
                                                                            }

                                                                            return true;
                                                                        }

                                                                        if (var1.startsWith("a20s")) {
                                                                            if ((var29 = c(var1, " ")).length > 1) {
                                                                                a((Auto) (new Class_gl(6, var29[1])));
                                                                            }

                                                                            return true;
                                                                        }

                                                                        ItemTemplate var21;
                                                                        if (var1.startsWith("dg")) {
                                                                            if ((var8 = (var30 = var1.substring(3)).indexOf(32)) > 0) {
                                                                                try {
                                                                                    Class_af.a(var21 = ItemTemplateManager.get(Short.parseShort(var30.substring(0, var8))), var30.substring(var8 + 1, var30.length()));
                                                                                    GameScr.chatPopup("Đặt giá: " + var21.name);
                                                                                } catch (Exception var23) {
                                                                                    var23.printStackTrace();
                                                                                }
                                                                            }

                                                                            return true;
                                                                        }

                                                                        int var20;
                                                                        if (var1.startsWith("asw")) {
                                                                            var29 = c(var1, " ");

                                                                            try {
                                                                                var8 = Integer.parseInt(var29[1]);
                                                                                var20 = Integer.parseInt(var29[2]);
                                                                                ItemTemplate var26 = ItemTemplateManager.get((short) var8);
                                                                                GameScr.chatPopup("Thêm: " + var26.name + " giá: " + var20 + " vào ds bán Shinwa");
                                                                                b(var8, var20);
                                                                            } catch (Exception var25) {
                                                                                var25.printStackTrace();
                                                                            }

                                                                            return true;
                                                                        }

                                                                        if (var1.startsWith("rsw")) {
                                                                            var29 = c(var1, " ");

                                                                            try {
                                                                                var21 = ItemTemplateManager.get((short) (var8 = Integer.parseInt(var29[1])));
                                                                                if (d(var8)) {
                                                                                    var24 = e(var8);
                                                                                    GameScr.chatPopup("Xóa: " + var21.name + " giá: " + var24 + " khỏi ds bán Shinwa");
                                                                                    fsw(var8);
                                                                                } else {
                                                                                    GameScr.chatPopup("Item " + var21.name + " chưa có trong ds bán Shinwa");
                                                                                }
                                                                            } catch (Exception var25) {
                                                                                var25.printStackTrace();
                                                                            }

                                                                            return true;
                                                                        }

                                                                        if (var1.startsWith("ask")) {
                                                                            if (TileMap.f(TileMap.mapID)) {
                                                                                var29 = c(var1, " ");

                                                                                try {
                                                                                    var8 = Integer.parseInt(var29[1]);
                                                                                } catch (Exception var28) {
                                                                                    return false;
                                                                                }

                                                                                int var11;
                                                                                try {
                                                                                    var11 = Integer.parseInt(var29[2]);
                                                                                } catch (Exception var27) {
                                                                                    var11 = 0;
                                                                                }

                                                                                var20 = var11;

                                                                                try {
                                                                                    var11 = Integer.parseInt(var29[3]);
                                                                                } catch (Exception var26) {
                                                                                    var11 = 0;
                                                                                }

                                                                                GameScr.chatPopup("Auto đầu xuân may mắn " + var8 + " lần");
                                                                                (new Thread(new Class_ac(this, var8, var20, var11))).start();
                                                                                return true;
                                                                            }

                                                                            GameScr.chatPopup("Hãy đứng trường để auto làm");
                                                                        }
                                                                    }

                                                                    return false;
                                                                }
                                                            } else if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).a == Char.getMyChar().charID) {
                                                                var10000 = var3 >= 0 && var3 < Mob.b.length ? Mob.b[var3] : null;
                                                                if (var10000 == null) {
                                                                    GameScr.chatPopup("Stanima nhóm all");
                                                                    this.c(-1, TileMap.mapID);
                                                                } else {
                                                                    GameScr.chatPopup("Stanima nhóm " + var10000.g + " id " + var3);
                                                                    this.c(var10000.e, TileMap.mapID);
                                                                }

                                                                c.g = true;
                                                                Service.getInstance().k("st " + c.h + " " + c.i + " " + c.b);
                                                                return true;
                                                            } else {
                                                                GameScr.chatPopup("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        GameScr.chatPopup("End Auto");
                                        f();
                                        if (Char.em) {
                                            Service.getInstance().k("pe");
                                        }

                                        return true;
                                    }
                                }
                            }
                        }
                    } else {
                        GameScr.chatPopup("Phá băng");
                        ad = false;
                        ae = false;
                        return true;
                    }
                } else {
                    GameScr.chatPopup("Băng skill");
                    ae = true;
                    return true;
                }
            } else {
                GameScr.chatPopup("Băng boss");
                ad = true;
                return true;
            }
        } else {
            GameScr.chatPopup("Đóng băng");
            ad = true;
            ae = true;
            return true;
        }
    }

    public static void g(String var0) {
        for (int var1 = 0; var1 < bb.length; ++var1) {
            a(var0, bb[var1].trim());
        }

    }

    public static void a(String var0, String var1) {
        Class_bu.d().a(var0, Char.getMyChar().charName, var1);
        Service.getInstance().a(var0, var1);
        NinjaUtil.sleep(20L);
    }

    public static String h(String var0) {
        InputStream var3 = RMS.a("/" + var0);

        try {
            byte[] var1 = new byte[var3.available()];
            var3.read(var1);
            var0 = new String(var1, "UTF-8");
        } catch (Exception var4) {
            var0 = "";
        }

        return var0;
    }

    public final void b(String var1, String var2) {
        if (Char.em && g != null && var1.equals(g) && !Char.getMyChar().charName.equals(g)) {
            this.d(var1, var2);
        }

        Class_bt var3;
        boolean var10000;
        if ((var3 = Class_bu.d().a(var1)) == null) {
            var10000 = true;
        } else if (System.currentTimeMillis() - var3.d > 1000L) {
            var3.d = System.currentTimeMillis();
            var10000 = true;
        } else {
            var10000 = false;
        }

        if (var10000) {
            Char var15 = Char.getMyChar();

            int var4;
            for (var4 = 0; var4 < c(Class_fj.a, ",").length; ++var4) {
                if (var1.equals(c(Class_fj.a, ",")[var4]) && var2.startsWith("anxin") && c(Class_fj.a, ",")[var4] != null) {
                    Class_fp.a = c(var2, " ")[3];
                    a((Auto) (new Class_fl(Integer.parseInt(c(var2, " ")[1]), Integer.parseInt(c(var2, " ")[2]), c(Class_fj.a, ",")[var4])));
                    return;
                }
            }

            if (var2.toLowerCase().equals("yenxu")) {
                a(var1, "Yên: " + var15.yen + " Xu: " + var15.xu + " Lượng: " + var15.luong);
                if (b != null) {
                    var4 = Char.getMyChar().yen - b.m;
                    int var5 = (int) ((System.currentTimeMillis() - b.o) / 1000L);
                    a(var1, "Up " + var4 + " trong " + NinjaUtil.b(var5) + " perh=" + var4 / var5 * 3600);
                    return;
                }
            } else if (var2.toLowerCase().equals("level")) {
                long var17;
                long var6 = (var17 = (Char.getMyChar().l > 0L ? Char.getMyChar().l : Char.getMyChar().ah) * 10000L / GameScr.exps[Char.getMyChar().cLevel]) % 100L;
                a(var1, "LV: " + var15.cLevel + " + " + (Char.getMyChar().l > 0L ? "-" : "") + var17 / 100L + "." + (var6 < 10L ? "0" + var6 : String.valueOf(var6)) + "%");
                if (b != null) {
                    long var8;
                    float var14 = (float) ((var8 = Char.getMyChar().k - b.n) * 10000L / GameScr.exps[Char.getMyChar().cLevel]) / 100.0F;
                    int var16 = (int) ((System.currentTimeMillis() - b.o) / 1000L);
                    long var12;
                    float var18 = (float) ((var12 = var8 * 3600L / (long) var16) * 10000L / GameScr.exps[Char.getMyChar().cLevel]) / 100.0F;
                    a(var1, "Up " + var8 + " - " + var14 + "% trong " + NinjaUtil.b(var16) + " perh=" + var12 + " - " + var18 + "%");
                    return;
                }
            } else if (b != null && ac > 0L) {
                if (var2.toLowerCase().equals("time")) {
                    a(var1, "Thời gian còn lại: " + NinjaUtil.b((int) (ac / 1000L)));
                    return;
                }
            } else {
                if (b instanceof Class_ae) {
                    f.a(var1, var2);
                    return;
                }

                if (var2.equals(SelectServerScr.pass)) {
                    LockGame.tatAuto();
                    b = null;
                    Session_ME.getInstance().b();
                }
            }
        }

    }

    public static String[] c(String var0, String var1) {
        int var2 = 0;
        int var3 = var1.length();

        int var4;
        for (var4 = var0.indexOf(var1, 0); var4 != -1; ++var2) {
            var4 += var3;
            var4 = var0.indexOf(var1, var4);
        }

        String[] var7 = new String[var2 + 1];
        var4 = var0.indexOf(var1);
        int var5 = 0;

        int var6;
        for (var6 = 0; var4 != -1; ++var6) {
            var7[var6] = var0.substring(var5, var4);
            var5 = var4 + var3;
            var4 = var0.indexOf(var1, var5);
        }

        var7[var6] = var0.substring(var5, var0.length());
        return var7;
    }

    public final void d(String var1, String var2) {
        if (Char.em && g != null && var1.equals(g) && !Char.getMyChar().charName.equals(g)) {
            String[] var6 = c(var2, " ");

            try {
                if (var6[0].equals("dcvt")) {
                    q = Integer.parseInt(var6[1]) == 1;
                    return;
                }

                if (var6[0].equals("avt")) {
                    GameScr.chatPopup("Thêm vị trí " + s.size());
                    s.addElement(Integer.valueOf(var6[1]));
                    t.addElement(Integer.valueOf(var6[2]));
                    return;
                }

                if (var6[0].equals("dvt")) {
                    GameScr.chatPopup("Xóa hết vị trí");
                    s.removeAllElements();
                    t.removeAllElements();
                    return;
                }

                int var9;
                if (var6[0].equals("dvtx")) {
                    var9 = Integer.parseInt(var6[1]);
                    GameScr.chatPopup("Xóa vị trí " + var9);
                    s.removeElementAt(var9);
                    t.removeElementAt(var9);
                    return;
                }

                if (var6[0].equals("pe")) {
                    GameScr.chatPopup("End Auto");
                    LockGame.tatAuto();
                    b = null;
                    return;
                }

                if (var6[0].equals("tsa")) {
                    if (b == au) {
                        au.h = Integer.parseInt(var6[1]);
                        au.i = Integer.parseInt(var6[2]);
                        return;
                    }

                    as.a(-1, Integer.parseInt(var6[1]), Integer.parseInt(var6[2]));
                    as.g = true;
                    a((Auto) as);
                    return;
                }

                if (var6[0].equals("ts")) {
                    if (b == au) {
                        au.h = Integer.parseInt(var6[1]);
                        au.i = Integer.parseInt(var6[2]);
                        return;
                    }

                    as.a(Integer.parseInt(var6[3]), Integer.parseInt(var6[1]), Integer.parseInt(var6[2]));
                    as.g = true;
                    a((Auto) as);
                    return;
                }

                if (var6[0].equals("att")) {
                    if (b == au) {
                        au.h = Integer.parseInt(var6[1]);
                        au.i = Integer.parseInt(var6[2]);
                        return;
                    }

                    var9 = Integer.parseInt(var6[1]);
                    int var3 = Integer.parseInt(var6[3]);
                    TaskOrder var4;
                    if ((var4 = Char.l(1)) != null && var4.mapId == var9) {
                        e.a();
                    } else {
                        e.a(var9, var3);
                    }

                    e.i = Integer.parseInt(var6[2]);
                    e.g = true;
                    a((Auto) e);
                    return;
                }

                if (var6[0].equals("sta")) {
                    if (b == au) {
                        au.h = Integer.parseInt(var6[1]);
                        au.i = Integer.parseInt(var6[2]);
                        return;
                    }

                    c.a(-1, Integer.parseInt(var6[1]), Integer.parseInt(var6[2]), false, false);
                    c.g = true;
                    a((Auto) c);
                    return;
                }

                if (var6[0].equals("st")) {
                    if (b == au) {
                        au.h = Integer.parseInt(var6[1]);
                        au.i = Integer.parseInt(var6[2]);
                        return;
                    }

                    c.a(Integer.parseInt(var6[3]), Integer.parseInt(var6[1]), Integer.parseInt(var6[2]), false, false);
                    c.g = true;
                    a((Auto) c);
                    return;
                }

                if (var6[0].equals("EEEEE")) {
                    a((Auto) (new Class_aj()));
                    return;
                }

                if (var6[0].equals("pkms")) {
                    if (b instanceof Class_an) {
                        Class_an var8;
                        (var8 = (Class_an) b).h = Integer.parseInt(var6[1]);
                        var8.b = Integer.parseInt(var6[2]);
                        var8.a = 3;
                        return;
                    }
                } else if (var6[0].equals("pkes")) {
                    if (b instanceof Class_an) {
                        ((Class_an) b).a = 4;
                        return;
                    }
                } else {
                    if (var6[0].equals("pkm")) {
                        if (b == au) {
                            au.h = Integer.parseInt(var6[1]);
                            return;
                        }

                        Auto var7 = b instanceof Class_al ? b.instance : b;
                        a((Auto) (new Class_al(Integer.parseInt(var6[1]))));
                        b.instance = var7;
                        return;
                    }

                    if (var6[0].equals("pkk")) {
                        if (b instanceof Class_al || b == au) {
                            b.i = Integer.parseInt(var6[1]);
                            return;
                        }
                    } else if (var6[0].equals("pke")) {
                        if (b instanceof Class_al) {
                            c();
                            return;
                        }
                    } else if (b != null) {
                        if (var6[0].equals("map")) {
                            b.h = Integer.parseInt(var6[1]);
                            return;
                        }

                        if (var6[0].equals("khu")) {
                            b.i = Integer.parseInt(var6[1]);
                            return;
                        }

                        if (b instanceof Class_ag) {
                            if (var6[0].equals("waitGr")) {
                                Class_ag.c = System.currentTimeMillis();
                                Class_ag.b = true;
                                return;
                            }

                            if (var6[0].equals("notifyGr")) {
                                Class_ag.b = false;
                                return;
                            }
                        } else if (b instanceof Stanima && var6[0].equals("sts")) {
                            c.e();
                            return;
                        }
                    }
                }
            } catch (Exception var7) {
                var7.printStackTrace();
            }
        }

    }

    public static void e(short var0) {
        for (int var1 = 0; var1 < throwListID.length; ++var1) {
            if (throwListID[var1] == var0) {
                throwListID[var1] = -1;
            }
        }

    }

    public static void f(short var0) {
        int var1;
        for (var1 = 0; var1 < throwListID.length; ++var1) {
            if (throwListID[var1] == var0) {
                return;
            }
        }

        var1 = -1;

        for (int var2 = 0; var2 < throwListID.length; ++var2) {
            if (throwListID[var2] < 0) {
                var1 = var2;
                break;
            }
        }

        if (var1 == -1) {
            var1 = throwListID.length;
            short[] var4;
            System.arraycopy(var4 = new short[throwListID.length + 10], 0, throwListID, 0, throwListID.length);

            for (int var3 = throwListID.length; var3 < var4.length; ++var3) {
                var4[var3] = -1;
            }

            throwListID = var4;
        }

        throwListID[var1] = var0;
    }

    public static void o() {
        for (int var0 = 0; var0 < throwListID.length; ++var0) {
            if (throwListID[var0] > 0) {
                for (int var1 = 0; var1 <= var0; ++var1) {
                    if (throwListID[var1] == -1) {
                        throwListID[var1] = throwListID[var0];
                        throwListID[var0] = -1;
                        break;
                    }
                }
            }
        }

    }

    public static boolean isThrowItem(Item var0) {
        if (var0 == null) {
            return false;
        } else {
            for (int var1 = 0; var1 < throwListID.length; ++var1) {
                if (throwListID[var1] > 0 && var0.template.id == throwListID[var1]) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean containsLuyenNgoc(Item var0) {
        return listLuyenNgoc.contains(var0);
    }

    public static void addLuyenNgoc(Item var0) {
        if (!listLuyenNgoc.contains(var0)) {
            listLuyenNgoc.addElement(var0);
        }

    }

    public static void removeLuyenNgoc(Item var0) {
        listLuyenNgoc.removeElement(var0);
    }

    static {
        try {
            ByteArrayInputStream var0 = new ByteArrayInputStream(RMS.getRecord("V6Group"));
            DataInputStream var1;
            if ((g = (var1 = new DataInputStream(var0)).readUTF()).equals("")) {
                g = null;
            }

            int var2 = var1.readByte();

            int var3;
            for (var3 = 0; var3 < var2; ++var3) {
                h.addElement(var1.readUTF());
            }

            var2 = var1.readInt();

            for (var3 = 0; var3 < var2; ++var3) {
                i.addElement(var1.readUTF());
            }

            var1.close();
            var0.close();
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        av = 0L;
        aw = 0L;
        j = new short[120];
        delListID = new short[120];
        throwListID = new short[120];
        l = -1;
        m = -1;
        n = -1;
        o = -1;
        p = false;
        q = false;
        s = new MyVector();
        t = new MyVector();
        u = false;
        w = new int[0];
        x = false;
        x1 = true;
        x2 = true;
        y = 40;
        z1 = 5;
        ax = 0L;
        tuDung = new MyVector();
        vutdo = new MyVector();
        timevut = 0;
        az = new MyVector();
        listLuyenNgoc = new MyVector();
        ba = 0L;
        z = new MyVector();
        aa = new MyVector();

        int var6;
        for (var6 = 0; var6 < j.length; ++var6) {
            j[var6] = -1;
        }

        for (var6 = 0; var6 < delListID.length; ++var6) {
            delListID[var6] = -1;
        }

        ab = 0L;
        ac = 0L;
        ad = false;
        ae = false;
        af = false;
        ag = 5;
        ah = false;
        ai = 100;
        aj = false;
        ak = 100;
        al = false;
        am = 100;

        for (var6 = 0; var6 < throwListID.length; ++var6) {
            throwListID[var6] = -1;
        }

        an = false;

        try {
            bb = c(h("text.txt"), "\n");
        } catch (Exception var4) {
            var4.printStackTrace();
            bb = new String[0];
        }

    }
}
