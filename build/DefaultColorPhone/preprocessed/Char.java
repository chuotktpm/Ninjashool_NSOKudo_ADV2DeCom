// Source code is decompiled from idEf .class file using FernFlower decompiler.
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Char extends MainObject {
   public Char d;
   public Char e;
   public boolean isHuman;
   public boolean isNhanban;
   public boolean isCaptcha;
   private int b = 0;
   private int c = 0;
   public long i;
   public ChatPopup chatPopup;
   public long k;
   public long l;
   private int gk;
   private int gl;
   public int cx = 24;
   public int cy = 24;
   public int o;
   public int p;
   public int q;
   private int gm;
   private int gn;
   public int r = 5;
   public int s = 1;
   public int charID;
   public int cgender;
   public int ctaskId;
   public int w;
   public int cDmg;
   public int cGiamDmg;
   public int cLevel;
   public int cMP;
   public int cMaxMP;
   public int cHP;
   public int ad;
   public int cMaxHP;
   private int go;
   public int eff5BuffHp;
   public int eff5BuffMp;
   public long ah;
   public int ai;
   public int aj;
   public int ak;
   public int al;
   public int am;
   public int an;
   public int ao;
   public int ap;
   public int aq;
   public int ar;
   public int as;
   public int at;
   public int au;
   public int av;
   public int aw;
   public int ax;
   public int ay;
   public int az;
   public int ba;
   public int bb;
   public int bc;
   public int[] bd = new int[4];
   public String charName;
   public String cClanName = "";
   public byte ctypeClan;
   public static Clan clan;
   public int bi = 22;
   public int bj = 32;
   private int gp = 11;
   private int gq = 16;
   public boolean bk = true;
   private boolean gr;
   public boolean bl;
   public boolean bm;
   public int bn;
   private int gs;
   public boolean bo = false;
   public boolean bp = false;
   public boolean bq;
   private boolean gt;
   public int xu;
   public int bs;
   public int yen;
   public int luong;
   public NClass nClass;
   public MyVector bw = new MyVector();
   public MyVector bx = new MyVector();
   public MyVector by = new MyVector();
   private MyVector gu = new MyVector();
   public Skill bz;
   public Task taskMaint;
   private boolean gv = true;
   public Item[] arrItemBag;
   public Item[] arrItemBox;
   public Item[] arrItemBody;
   public Item[] arrItemMounts = new Item[5];
   public Item[] arrItemBijuus = new Item[5];
   public short cResFire;
   public short cResIce;
   public short cResWind;
   public short cMiss;
   public short cExactly;
   public short cCrit;
   public short cCritRate;
   public byte hieuChien;
   public byte cm;
   public short cReactDmg;
   public short sysUp;
   public short sysDown;
   public Mob mobFocus;
   public Mob mobMe;
   public Npc npcFocus;
   public Char charFocus;
   public ItemMap itemFocus;
   public MyVector focus = new MyVector();
   public Mob[] attMobs;
   public Char[] attChars;
   public short[] moveFast;
   public int cz = -9999;
   public int da = -9999;
   public byte db;
   public int dc;
   public int dd;
   public int de;
   private int gw;
   private int gx;
   public boolean df;
   public static boolean dg;
   public static boolean dh;
   public static boolean di;
   public static boolean isABuff = true;
   public static boolean dk = true;
   public static boolean dl = false;
   public static boolean dm = false;
   public static boolean dn = true;
   public static boolean doa = true;
   public static boolean dp;
   public static boolean tickLuyenDaMax;
   public static boolean tickNhatTrangBi;
   public static boolean tickNhatTrangBiLa = false;
   public static boolean tickNhatVPNhiemVu;
   public static boolean tickNhatVPSK = true;
   public static boolean tickNhatTatCa;
   public static boolean tickNhatSVC;
   public static boolean tickKhongNhat;
   public static boolean tickAutoTTT = false;
   public static boolean tickAutoTTC = false;
   public static boolean tickReMap = true;
   public static boolean tickTSMapEmpty = true;
   public static boolean tickAutoMuaTA;
   public static boolean tickDieKhiHetMP = true;
   public static boolean tickAutoReconnect = true;
   public static boolean tickChuyenMapHetBoss = true;
   public static boolean tickSanTATL = true;
   public static boolean tickDanhQuaiThuong = true;
   public static boolean tickDanhTinhAnh = true;
   public static boolean tickDanhThuLinh = true;
   public static boolean ek;
   public static boolean el;
   public static boolean em = true;
   public static boolean en = false;
   public static boolean eo = false;
   public static boolean ep = false;
   public static boolean isAResuscitate;
   public static boolean er;
   public static int es = 90;
   public static int et = 80;
   public static int eu = 70;
   public static int ev = 30;
   public static int ew = 3;
   public static int ex = 5;
   public static int ey = 30;
   public static int aCID;
   private long gy = 0L;
   public MyVector taskOrders = new MyVector();
   public static int fb;
   public static int fc;
   private long gz;
   public long fd;
   public static final int[][][] fe = new int[][][]{{{0, -10, 32}, {1, -7, 7}, {1, -11, 15}, {1, -9, 45}}, {{0, -10, 33}, {1, -7, 7}, {1, -11, 16}, {1, -9, 46}}, {{1, -10, 33}, {2, -10, 11}, {2, -9, 16}, {1, -12, 49}}, {{1, -10, 32}, {3, -11, 9}, {3, -11, 16}, {1, -13, 47}}, {{1, -10, 34}, {4, -9, 9}, {4, -8, 16}, {1, -12, 47}}, {{1, -10, 34}, {5, -11, 11}, {5, -10, 17}, {1, -13, 49}}, {{1, -10, 33}, {6, -9, 9}, {6, -8, 16}, {1, -12, 47}}, {{0, -9, 36}, {7, -5, 15}, {7, -10, 21}, {1, -8, 49}}, {{4, -13, 26}, new int[3], new int[3], new int[3]}, {{5, -13, 25}, new int[3], new int[3], new int[3]}, {{6, -12, 26}, new int[3], new int[3], new int[3]}, {{7, -13, 25}, new int[3], new int[3], new int[3]}, {{0, -9, 35}, {8, -4, 13}, {8, -14, 27}, {1, -9, 49}}, {{0, -9, 31}, {9, -11, 8}, {10, -10, 17}, new int[3]}, {{2, -7, 33}, {9, -11, 8}, {11, -8, 15}, new int[3]}, {{2, -8, 32}, {9, -11, 8}, {12, -8, 14}, new int[3]}, {{2, -7, 32}, {9, -11, 8}, {13, -12, 15}, new int[3]}, {{0, -11, 31}, {9, -11, 8}, {14, -15, 18}, new int[3]}, {{2, -9, 32}, {9, -11, 8}, {15, -13, 19}, new int[3]}, {{2, -9, 31}, {9, -11, 8}, {16, -7, 22}, new int[3]}, {{2, -9, 32}, {9, -11, 8}, {17, -11, 18}, new int[3]}, {{3, -12, 34}, {8, -4, 13}, {8, -15, 25}, {1, -10, 46}}, {{0, -9, 32}, {8, -4, 9}, {10, -10, 18}, new int[3]}, {{2, -7, 34}, {8, -4, 9}, {11, -8, 16}, new int[3]}, {{2, -8, 33}, {8, -4, 9}, {12, -8, 15}, new int[3]}, {{2, -7, 33}, {8, -4, 9}, {13, -12, 16}, new int[3]}, {{0, -11, 32}, {7, -5, 9}, {14, -15, 19}, new int[3]}, {{2, -9, 33}, {7, -5, 9}, {15, -13, 20}, new int[3]}, {{2, -9, 32}, {7, -5, 9}, {16, -7, 23}, new int[3]}, {{2, -9, 33}, {7, -5, 9}, {17, -11, 19}, new int[3]}};
   private static Char ha;
   private int hb;
   public int ff;
   public int fg;
   public int fh;
   public int fi;
   public MyVector fj = new MyVector();
   public static boolean fk;
   public static boolean fl;
   public boolean fm;
   public boolean fn;
   public boolean fo;
   public Class_cy fp;
   private int hc = 0;
   private boolean hd;
   public long fq = System.currentTimeMillis();
   public int fr = 0;
   private long he;
   private static boolean hf = true;
   private int hg;
   private int hh;
   private int hi;
   private long hj = 0L;
   private boolean hk = false;
   public static byte[] fs = new byte[]{0, 0, 0, -1, -1, -1, -2, -2, -2, -1, -1, -1};
   private long hl;
   private long hm;
   private static short hn = 250;
   public short head;
   public short leg;
   public short body;
   public short weapon;
   public short fx = -1;
   public short fy = -1;
   private int ho = -1;
   public int fz = -1;
   private EffectCharPaint hp;
   public EffectCharPaint ga;
   private int hq;
   private int hr;
   private int hs;
   private int ht;
   private int hu;
   private int hv;
   private int hw;
   private int hx;
   private int hy;
   private int hz;
   private EffectCharPaint ia = null;
   private EffectCharPaint ib = null;
   private EffectCharPaint ic = null;
   public Class_bq gb = null;
   public SkillPaint gc;
   public Class_cc[] gd;
   private int id;
   private byte ie;
   private int ifa = 0;
   private int ig = 0;
   private int ih = 0;
   private int ii = 0;
   private int ij = 0;
   private int[] ik = new int[]{1715, 1737, 1714, 1738};
   public static boolean ge = false;
   public short gf;
   public short gg;
   public boolean gh;
   public Skill gi;
   public boolean gj;
   private int il;
   private int im;
   private int in;
   private int io;

   static {
      System.out.println("Load Auto");

      try {
         ByteArrayInputStream var0 = new ByteArrayInputStream(RMS.getRecord("V7ProSetting"));
         DataInputStream var1;
         dg = (var1 = new DataInputStream(var0)).readBoolean();
         es = var1.readInt();
         dh = var1.readBoolean();
         et = var1.readInt();
         di = var1.readBoolean();
         eu = var1.readInt();
         isABuff = var1.readBoolean();
         dl = var1.readBoolean();
         dm = var1.readBoolean();
         dk = var1.readBoolean();
         dn = var1.readBoolean();
         doa = var1.readBoolean();
         ev = var1.readInt();
         dp = var1.readBoolean();
         ew = var1.readInt();
         tickLuyenDaMax = var1.readBoolean();
         ex = var1.readInt();
         tickNhatTrangBi = var1.readBoolean();
         tickNhatTrangBiLa = var1.readBoolean();
         ey = var1.readInt();
         tickNhatVPNhiemVu = var1.readBoolean();
         tickNhatVPSK = var1.readBoolean();
         tickNhatTatCa = var1.readBoolean();
         tickNhatSVC = var1.readBoolean();
         tickKhongNhat = var1.readBoolean();
         int var2 = var1.readInt();
         if (Code.throwListID.length < var2) {
            Code.throwListID = new short[10 * (var2 / 10 + 1)];
         }

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            Code.throwListID[var3] = var1.readShort();
         }

         tickReMap = var1.readBoolean();
         tickTSMapEmpty = var1.readBoolean();
         tickAutoMuaTA = var1.readBoolean();
         tickDieKhiHetMP = var1.readBoolean();
         tickAutoReconnect = var1.readBoolean();
         tickChuyenMapHetBoss = var1.readBoolean();
         en = var1.readBoolean();
         tickSanTATL = var1.readBoolean();
         tickDanhQuaiThuong = var1.readBoolean();
         Char.tickDanhTinhAnh = var1.readBoolean();
         tickDanhThuLinh = var1.readBoolean();
         ek = var1.readBoolean();
         el = var1.readBoolean();
         em = var1.readBoolean();
         var2 = var1.readInt();
         System.out.println("lent: " + var2);
         if (Code.j.length < var2) {
            Code.j = new short[10 * (var2 / 10 + 1)];
         }

         for(var3 = 0; var3 < var2; ++var3) {
            Code.j[var3] = var1.readShort();
         }

         Code.y = var1.readInt();
         
         tickAutoTTT = var1.readBoolean();
         tickAutoTTC = var1.readBoolean();
         var2 = var1.readInt();
         System.out.println("lentDel: " + var2);
         if (Code.delListID.length < var2) {
            Code.delListID = new short[10 * (var2 / 10 + 1)];
         }

         for(var3 = 0; var3 < var2; ++var3) {
            Code.delListID[var3] = var1.readShort();
         }

         eo = var1.readBoolean();
         var2 = var1.readInt();

         for(var3 = 0; var3 < var2; ++var3) {
            Code.z.addElement(new Integer(var1.readShort()));
            Code.aa.addElement(new Integer(var1.readInt()));
         }

         ep = var1.readBoolean();
         Code.x1 = var1.readBoolean();
         Code.x2 = var1.readBoolean();
         var0.close();
         var1.close();
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public static void c() {
      System.out.println("Save Auto");
      ByteArrayOutputStream var0 = new ByteArrayOutputStream();
      DataOutputStream var1 = new DataOutputStream(var0);

      try {
         var1.writeBoolean(dg);
         var1.writeInt(es);
         var1.writeBoolean(dh);
         var1.writeInt(et);
         var1.writeBoolean(di);
         var1.writeInt(eu);
         var1.writeBoolean(isABuff);
         var1.writeBoolean(dl);
         var1.writeBoolean(dm);
         var1.writeBoolean(dk);
         var1.writeBoolean(dn);
         var1.writeBoolean(doa);
         var1.writeInt(ev);
         var1.writeBoolean(dp);
         var1.writeInt(ew);
         var1.writeBoolean(tickLuyenDaMax);
         var1.writeInt(ex);
         var1.writeBoolean(tickNhatTrangBi);
         var1.writeBoolean(tickNhatTrangBiLa);
         var1.writeInt(ey);
         var1.writeBoolean(tickNhatVPNhiemVu);
         var1.writeBoolean(tickNhatVPSK);
         var1.writeBoolean(tickNhatTatCa);
         var1.writeBoolean(tickNhatSVC);
         var1.writeBoolean(tickKhongNhat);
         int var2 = 0;

         int var3;
         for(var3 = 0; var3 < Code.throwListID.length; ++var3) {
            if (Code.throwListID[var3] >= 0) {
               ++var2;
            }
         }

         var1.writeInt(var2);

         for(var3 = 0; var3 < Code.throwListID.length; ++var3) {
            if (Code.throwListID[var3] >= 0) {
               var1.writeShort(Code.throwListID[var3]);
            }
         }

         var1.writeBoolean(tickReMap);
         var1.writeBoolean(tickTSMapEmpty);
         var1.writeBoolean(tickAutoMuaTA);
         var1.writeBoolean(tickDieKhiHetMP);
         var1.writeBoolean(tickAutoReconnect);
         var1.writeBoolean(tickChuyenMapHetBoss);
         var1.writeBoolean(en);
         var1.writeBoolean(tickSanTATL);
         var1.writeBoolean(tickDanhQuaiThuong);
         var1.writeBoolean(Char.tickDanhTinhAnh);
         var1.writeBoolean(tickDanhThuLinh);
         var1.writeBoolean(ek);
         var1.writeBoolean(el);
         var1.writeBoolean(em);
         var2 = 0;

         for(var3 = 0; var3 < Code.j.length; ++var3) {
            if (Code.j[var3] >= 0) {
               ++var2;
            }
         }

         System.out.println("lent: " + var2);
         var1.writeInt(var2);

         for(var3 = 0; var3 < Code.j.length; ++var3) {
            if (Code.j[var3] >= 0) {
               var1.writeShort(Code.j[var3]);
            }
         }

         var1.writeInt(Code.y);
         
         var1.writeBoolean(tickAutoTTT);
         var1.writeBoolean(tickAutoTTC);
         var2 = 0;

         for(var3 = 0; var3 < Code.delListID.length; ++var3) {
            if (Code.delListID[var3] >= 0) {
               ++var2;
            }
         }

         System.out.println("lent: " + var2);
         var1.writeInt(var2);

         for(var3 = 0; var3 < Code.delListID.length; ++var3) {
            if (Code.delListID[var3] >= 0) {
               var1.writeShort(Code.delListID[var3]);
            }
         }

         var1.writeBoolean(eo);
         var1.writeInt(Code.z.size());

         for(var3 = 0; var3 < Code.z.size(); ++var3) {
            var1.writeShort(((Integer)Code.z.elementAt(var3)).intValue());
            var1.writeInt(((Integer)Code.aa.elementAt(var3)).intValue());
         }

         var1.writeBoolean(ep);
         var1.writeBoolean(Code.x1);
         var1.writeBoolean(Code.x2);
         var1.flush();
         var0.flush();
         RMS.writeRecord("V7ProSetting", var0.toByteArray());
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public final int d() {
      return this.bz != null ? this.bz.b() : 0;
   }

   public final int e() {
      return this.bz != null ? this.bz.c() : 0;
   }

   public Char() {
      this.r = 6;
   }

   public final int getSys() {
      if (this.nClass.classId != 1 && this.nClass.classId != 2 && this.nClass.classId != 7) {
         if (this.nClass.classId != 3 && this.nClass.classId != 4) {
            return this.nClass.classId != 5 && this.nClass.classId != 6 ? 0 : 3;
         } else {
            return 2;
         }
      } else {
         return 1;
      }
   }

   public final int getSpeed() {
      if (Code.af) {
         return Code.ag;
      } else {
         return !this.bp && !this.bo ? this.w : this.w + 2;
      }
   }

   public final boolean isNoiCong() {
      return this.nClass.classId == 2 || this.nClass.classId == 4 || this.nClass.classId == 6 || this.nClass.classId == 8 || this.nClass.classId == 10;
   }

   public static Char getMyChar() {
      if (ha == null) {
         (ha = new Char()).bl = true;
         ha.gr = true;
         ha.hm = System.currentTimeMillis();
      }

      return ha;
   }

   public static void j() {
      isAResuscitate = false;
      er = false;
      ha = null;
   }

   public final void a(Message var1) {
      try {
         this.w = var1.reader().readByte();
         this.cMaxHP = var1.reader().readInt();
         this.cMaxMP = var1.reader().readInt();
      } catch (Exception var2) {
         var2.printStackTrace();
         System.out.println("Char.readParam()");
      }
   }

   public final void k() {
      try {
         MyVector var1 = new MyVector();

         int var2;
         Item var3;
         for(var2 = 0; var2 < this.arrItemBag.length; ++var2) {
            if ((var3 = this.arrItemBag[var2]) != null && var3.template.isUpToUp && !var3.isExpires) {
               var1.addElement(var3);
            }
         }

         int var4;
         for(var2 = 0; var2 < var1.size(); ++var2) {
            if ((var3 = (Item)var1.elementAt(var2)) != null) {
               for(var4 = var2 + 1; var4 < var1.size(); ++var4) {
                  Item var5;
                  if ((var5 = (Item)var1.elementAt(var4)) != null && var3.template.equals(var5.template) && var3.isLock == var5.isLock) {
                     var3.quantity += var5.quantity;
                     this.arrItemBag[var5.indexUI] = null;
                     var1.setElementAt((Object)null, var4);
                  }
               }
            }
         }

         for(var2 = 0; var2 < this.arrItemBag.length; ++var2) {
            if (this.arrItemBag[var2] != null) {
               for(var4 = 0; var4 <= var2; ++var4) {
                  if (this.arrItemBag[var4] == null) {
                     this.arrItemBag[var4] = this.arrItemBag[var2];
                     this.arrItemBag[var4].indexUI = var4;
                     this.arrItemBag[var2] = null;
                     break;
                  }
               }
            }
         }

      } catch (Exception var6) {
         var6.printStackTrace();
         System.out.println("Char.bagSort()");
      }
   }

   public final void l() {
      try {
         MyVector var1 = new MyVector();

         int var2;
         Item var3;
         for(var2 = 0; var2 < this.arrItemBox.length; ++var2) {
            if ((var3 = this.arrItemBox[var2]) != null && var3.template.isUpToUp && !var3.isExpires) {
               var1.addElement(var3);
            }
         }

         int var4;
         for(var2 = 0; var2 < var1.size(); ++var2) {
            if ((var3 = (Item)var1.elementAt(var2)) != null) {
               for(var4 = var2 + 1; var4 < var1.size(); ++var4) {
                  Item var5;
                  if ((var5 = (Item)var1.elementAt(var4)) != null && var3.template.equals(var5.template) && var3.isLock == var5.isLock) {
                     var3.quantity += var5.quantity;
                     this.arrItemBox[var5.indexUI] = null;
                     var1.setElementAt((Object)null, var4);
                  }
               }
            }
         }

         for(var2 = 0; var2 < this.arrItemBox.length; ++var2) {
            if (this.arrItemBox[var2] != null) {
               for(var4 = 0; var4 <= var2; ++var4) {
                  if (this.arrItemBox[var4] == null) {
                     this.arrItemBox[var4] = this.arrItemBox[var2];
                     this.arrItemBox[var4].indexUI = var4;
                     this.arrItemBox[var2] = null;
                     break;
                  }
               }
            }
         }

      } catch (Exception var6) {
         var6.printStackTrace();
         System.out.println("Char.boxSort()");
      }
   }

   public final void a(int var1) {
      Item var2;
      int var3;
      Item var5;
      if ((var2 = this.arrItemBag[var1]).isTypeBody()) {
         var2.isLock = true;
         var2.typeUI = 5;
         var5 = this.arrItemBody[var2.template.type];
         this.arrItemBag[var1] = null;
         if (var5 != null) {
            var5.typeUI = 3;
            this.arrItemBody[var2.template.type] = null;
            var5.indexUI = var1;
            this.arrItemBag[var1] = var5;
         }

         var2.indexUI = var2.template.type;
         this.arrItemBody[var2.indexUI] = var2;

         for(var3 = 0; var3 < this.arrItemBody.length; ++var3) {
            Item var6;
            if ((var6 = this.arrItemBody[var3]) != null) {
               if (var6.template.type == 1) {
                  this.weapon = var6.template.part;
               } else if (var6.template.type == 2) {
                  this.body = var6.template.part;
               } else if (var6.template.type == 6) {
                  this.leg = var6.template.part;
               }
            }
         }

      } else {
         if (var2.isTypeMounts()) {
            var2.isLock = true;
            var2.typeUI = 41;
            this.arrItemBag[var1] = null;

            for(var3 = 0; var3 < this.arrItemMounts.length; ++var3) {
               int var4;
               if ((var4 = var2.template.type - 29) == var3) {
                  if ((var5 = this.arrItemMounts[var4]) != null) {
                     var5.typeUI = 41;
                     this.arrItemMounts[var4] = null;
                     var5.indexUI = var1;
                     this.arrItemBag[var1] = var5;
                  }

                  var2.indexUI = var2.template.type;
                  this.arrItemMounts[var4] = var2;
                  return;
               }
            }
         }

      }
   }

   public final Skill a(SkillTemplate var1) {
      for(int var2 = 0; var2 < this.bw.size(); ++var2) {
         Skill var3;
         if ((var3 = (Skill)this.bw.elementAt(var2)).template.equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   private boolean a() {
      int var1 = TileMap.vGo.size();

      for(byte var2 = 0; var2 < var1; ++var2) {
         Class_ds var3 = (Class_ds)TileMap.vGo.elementAt(var2);
         if (this.cx >= var3.a && this.cx <= var3.c && this.cy >= var3.b && this.cy <= var3.d) {
            return true;
         }
      }

      return false;
   }

   private static int f(int var0, int var1) {
      return Class_fa.e(var0 - var1);
   }

   public void b() {
      this.hg = this.cx;
      this.hh = this.cy;
      int var1;
      int var2;
      if (this.bl && this.cHP > 0) {
         var1 = f(this.ff, this.cx);
         var2 = f(this.fg, this.cy);
         if ((var1 > 0 || var2 > 0) && System.currentTimeMillis() - this.he >= 250L) {
            hf = true;
         }

         if (hf) {
            hf = false;
            if (!fk) {
               Service.getInstance().charMove(this.cx, this.cy);
            }

            this.he = System.currentTimeMillis();
            this.ff = this.cx;
            this.fg = this.cy;
         }
      }

      if (this.mobMe != null) {
         Mob var10000;
         if (this.mobMe.s == 122 || this.mobMe.s == 70 || this.mobMe.b() != null && this.mobMe.b().d == 1) {
            if (this.mobMe.h != 3) {
               this.mobMe.i = this.cx + (3 - GameCanvas.gameTick % 6) * 6;
               this.mobMe.j = this.cy - 60;
               var1 = this.mobMe.i - this.mobMe.e;
               var2 = this.mobMe.j - this.mobMe.f;
               if (var1 > 50 || var1 < -50) {
                  var10000 = this.mobMe;
                  var10000.e += var1 / 10;
               }

               if (var2 > 50 || var2 < -50) {
                  var10000 = this.mobMe;
                  var10000.f += var2 / 10;
               }
            }

            this.mobMe.g();
         } else {
            if (this.mobMe.h != 3) {
               if (this.s == -1) {
                  this.mobMe.i = this.cx + 20;
                  this.mobMe.j = this.cy;
                  this.mobMe.g = this.s;
                  this.mobMe.f = this.cy - 20;
               } else {
                  this.mobMe.i = this.cx - 20;
                  this.mobMe.j = this.cy;
                  this.mobMe.g = this.s;
                  this.mobMe.f = this.cy - 20;
               }

               var1 = this.mobMe.i - this.mobMe.e;
               var2 = this.mobMe.j - this.mobMe.f;
               if (var1 <= 50 && var1 >= -50) {
                  var10000 = this.mobMe;
                  var10000.e += var1;
               } else {
                  var10000 = this.mobMe;
                  var10000.e += var1 / 10;
               }

               if (var2 > 50 || var2 < -50) {
                  var10000 = this.mobMe;
                  var10000.f += var2 / 10;
               }
            }

            this.mobMe.g();
         }
      }

      this.hd = false;
      if (this.db > 0 && GameCanvas.gameTick % 2 == 0) {
         --this.db;
         if (this.db == 30 || this.db == 60) {
            this.db = 0;
         }
      }

      if (this.bz != null && (this.bz.template.id == 77 || this.bz.template.id == 73)) {
         this.aj();
      }

      this.aj();
      if (this.mobMe != null) {
         this.mobMe.g();
      }

      if (this.gb != null) {
         this.gb.a();
      }

      if (this.arrItemMounts[4] != null && this.arrItemMounts[4].options != null) {
         for(var1 = 0; var1 < this.arrItemMounts[4].options.size(); ++var1) {
            ItemOption var7;
            if ((var7 = (ItemOption)this.arrItemMounts[4].options.elementAt(var1)).optionTemplate.id == 66) {
               this.fr = var7.param;
            }
         }
      }

      if (this.bp && this.fr < 500) {
         this.bp = false;
      }

      Class_bp var3;
      Class_bp var8;
      if (this.bp) {
         if (this.arrItemMounts[4].template.id == 443 && this.arrItemMounts[4].sys >= 2) {
            if (this.ik[1] == 1737) {
               this.im -= 5;
            }

            if (this.s != 1) {
               var8 = new Class_bp(this.il - 4, this.im, 0);
               var3 = new Class_bp(this.il - 1, this.im, 0);
            } else {
               var8 = new Class_bp(this.il + 4, this.im, 0);
               var3 = new Class_bp(this.il + 1, this.im, 0);
            }

            if (this.r != 1 || this.r != 6) {
               this.gu.addElement(var8);
               this.gu.addElement(var3);
            }
         }

         for(var1 = 0; var1 < this.gu.size(); ++var1) {
            (var8 = (Class_bp)this.gu.elementAt(var1)).a();
            if (var8.a >= 6) {
               this.gu.removeElementAt(var1);
            }
         }
      } else if (this.bo) {
         if (this.arrItemMounts[4].template.id == 524 && this.arrItemMounts[4].sys >= 2) {
            if (this.s != 1) {
               var8 = new Class_bp(this.il, this.im, 1);
               var3 = new Class_bp(this.in, this.io, 1);
            } else {
               var8 = new Class_bp(this.il, this.im, 1);
               var3 = new Class_bp(this.in, this.io, 1);
            }

            if ((this.r == 2 || this.r == 10) && GameCanvas.gameTick % 3 == 0) {
               this.gu.addElement(var8);
               this.gu.addElement(var3);
            }
         }

         for(var1 = 0; var1 < this.gu.size(); ++var1) {
            (var8 = (Class_bp)this.gu.elementAt(var1)).a();
            if (var8.a >= 6) {
               this.gu.removeElementAt(var1);
            }
         }
      }

      Item var14;
      if (this.bl && dg && Code.b == null && this.cHP < this.cMaxHP * es / 100 && System.currentTimeMillis() - this.fq > 3000L && this.r != 14 && this.r != 5 && this.cHP > 0) {
         if (this.by.size() == 0) {
            for(var1 = 0; var1 < this.arrItemBag.length; ++var1) {
               if ((var14 = this.arrItemBag[var1]) != null && var14.template.type == 16 && var14.template.level <= this.cLevel) {
                  GameScr.w();
                  this.fq = System.currentTimeMillis();
                  break;
               }
            }
         } else {
            for(var1 = 0; var1 < this.by.size() && ((Class_cq)getMyChar().by.elementAt(var1)).e.b != 17; ++var1) {
               if (var1 == this.by.size() - 1) {
                  GameScr.w();
                  this.fq = System.currentTimeMillis();
               }
            }
         }
      }

      if (this.bl && (di || Code.b instanceof As10) && GameCanvas.gameTick % 10 == 0 && !GameScr.cj && this.r != 14 && this.r != 5 && this.cHP > 0) {
         int var10 = Code.b instanceof As10 ? (this.ctaskId >= 9 ? 10 : 1) : eu;
         if (this.by.size() == 0) {
            for(var1 = 0; var1 < this.arrItemBag.length; ++var1) {
               if ((var14 = this.arrItemBag[var1]) != null && var14.template.type == 18 && var14.template.level == var10) {
                  Service.getInstance().useItem(var1);
                  break;
               }
            }
         } else {
            for(var1 = 0; var1 < this.by.size() && ((Class_cq)getMyChar().by.elementAt(var1)).e.b != 0; ++var1) {
               if (var1 == this.by.size() - 1) {
                  for(var2 = 0; var2 < this.arrItemBag.length; ++var2) {
                     Item var4;
                     if ((var4 = this.arrItemBag[var2]) != null && var4.template.type == 18 && var4.template.level == var10) {
                        Service.getInstance().useItem(var2);
                        break;
                     }
                  }
               }
            }
         }
      }

      int var5;
      Skill var12;
      if (this.bl && isABuff && Code.b == null && !TileMap.ag && getMyChar().r != 14 && getMyChar().r != 5 && this.cHP > 0 && System.currentTimeMillis() - this.gy > 500L) {
         for(var1 = 0; var1 < this.bw.size(); ++var1) {
            boolean var9 = false;
            if (((var12 = (Skill)this.bw.elementAt(var1)).template.id < 67 || var12.template.id > 72) && var12 != null && var12.template.type == 2 && !var12.isCooldown()) {
               for(var5 = 0; var5 < this.by.size(); ++var5) {
                  Class_cq var17;
                  if ((var17 = (Class_cq)this.by.elementAt(var5)) != null && var17.e.c == var12.template.iconId) {
                     var9 = true;
                     break;
                  }
               }

               if (!var9) {
                  GameScr.getInstance().a(var12, true);
                  Service.getInstance().r();
                  this.m();
                  this.gy = System.currentTimeMillis();
                  break;
               }
            }
         }
      }

      if (this.bl && dh && Code.b == null && this.cMP < this.cMaxMP * et / 100 && GameCanvas.gameTick % 4 == 0 && this.r != 14 && this.r != 5 && this.cHP > 0) {
         GameScr.v();
      }

      Char var11;
      if (this.bl && isAResuscitate && this.nClass.classId == 6 && aCID > 0 && getMyChar().r != 14 && getMyChar().r != 5 && (var11 = GameScr.getCharByID(aCID)) != null && (var11.cHP <= 0 || var11.r == 14 || var11.r == 5 || er)) {
         for(var1 = 0; var1 < this.bw.size(); ++var1) {
            if ((var12 = (Skill)getMyChar().bw.elementAt(var1)) != null && var12.template.type == 4) {
               if (Class_fa.e(this.cx - var11.cx) < var12.b() && Class_fa.e(this.cy - var11.cy) < var12.c()) {
                  getMyChar().bz = var12;
                  GameScr.getInstance().g(aCID);
                  er = false;
                  this.m();
               } else {
                  InfoMe.a(mResources.rh, 20, mFont.tahoma_7_white);
               }
               break;
            }
         }
      }

      if (this.cHP > 0) {
         for(var1 = 0; var1 < this.by.size(); ++var1) {
            Class_cq var13;
            if ((var13 = (Class_cq)this.by.elementAt(var1)).e.b != 0 && var13.e.b != 12) {
               if (var13.e.b != 4 && var13.e.b != 17) {
                  if (var13.e.b == 13) {
                     if (GameCanvas.w) {
                        this.cHP -= this.cMaxHP * 3 / 100;
                        if (this.cHP <= 0) {
                           this.cHP = 1;
                        }
                     }
                  } else if (var13.e.b == 7) {
                     this.hd = true;
                  }
               } else if (GameCanvas.w) {
                  this.cHP += var13.d;
               }
            } else if (GameCanvas.w) {
               this.cHP += var13.d;
               this.cMP += var13.d;
            }
         }

         if (this.hd) {
            ++this.hc;
         } else {
            this.hc = 0;
         }

         if (this.eff5BuffHp > 0 && GameCanvas.x) {
            this.cHP += this.eff5BuffHp;
         }

         if (this.eff5BuffMp > 0 && GameCanvas.x) {
            this.cMP += this.eff5BuffMp;
         }

         if (this.cHP > this.cMaxHP) {
            this.cHP = this.cMaxHP;
         }

         if (this.cMP > this.cMaxMP) {
            this.cMP = this.cMaxMP;
         }
      }

      if (this.gr) {
         GameScr.k = this.cx - GameScr.d + GameScr.h * this.s;
         GameScr.l = this.cy - GameScr.e;
      }

      this.gs = (this.gs + 1) % 100;
      if (this.bl) {
         if (this.charFocus != null && (this.charFocus.ae() || !GameScr.vCharInMap.contains(this.charFocus))) {
            this.charFocus = null;
         }

         if (this.cx < 10) {
            this.o = 0;
            this.cx = 10;
         } else if (this.cx > TileMap.c - 10) {
            this.cx = TileMap.c - 10;
            this.o = 0;
         }

         if (!fk && this.a()) {
            fl = true;
            fk = true;
            Service.getInstance().c();
            GameCanvas.l();
            GameCanvas.k();
            return;
         }

         if (this.fo) {
            this.fo = System.currentTimeMillis() - this.gz < 2000L;
         }

         if (this.fm) {
            this.fp = null;
         }

         if (this.fp != null && (this.r == 1 || this.r == 2)) {
            this.r = 2;
            if (this.cx - this.fp.a > 0) {
               this.s = -1;
               if (this.cx - this.fp.a <= 10) {
                  this.fp = null;
               }
            } else {
               this.s = 1;
               if (this.cx - this.fp.a >= -10) {
                  this.fp = null;
               }
            }

            if (this.fp != null) {
               this.o = this.getSpeed() * this.s;
               this.p = 0;
            }
         }

         this.aw();
         if (this.r != 1 && this.r != 6) {
            this.hj = System.currentTimeMillis();
            this.hk = true;
         } else if (System.currentTimeMillis() - this.hj > 500L && this.hk) {
            hf = true;
            this.hk = false;
            this.hj = System.currentTimeMillis();
         }
      } else {
         if (GameCanvas.gameTick % 20 == 0 && this.charID >= 0) {
            this.gv = true;

            for(var1 = 0; var1 < GameScr.vCharInMap.size(); ++var1) {
               Char var15 = null;

               try {
                  var15 = (Char)GameScr.vCharInMap.elementAt(var1);
               } catch (Exception var6) {
               }

               if (var15 != null && !var15.equals(this) && (var15.cy == this.cy && Class_fa.e(var15.cx - this.cx) < 35 || this.cy - var15.cy < 32 && this.cy - var15.cy > 0 && Class_fa.e(var15.cx - this.cx) < 24)) {
                  this.gv = false;
               }
            }
         }

         if (this.r == 1 || this.r == 6) {
            boolean var16 = false;
            if (this.fp != null) {
               if (m(this.fp.a - this.cx) < 4 && m(this.fp.b - this.cy) < 4) {
                  this.cx = this.fp.a;
                  this.cy = this.fp.b;
                  this.fp = null;
                  if ((TileMap.a(this.cx, this.cy) & 2) == 2) {
                     this.ay();
                     GameCanvas.b().a(-1, this.cx - -8, this.cy);
                     GameCanvas.b().a(1, this.cx - 8, this.cy);
                  } else {
                     this.r = 4;
                     this.p = 0;
                  }

                  var16 = true;
               } else if (this.cy == this.fp.b) {
                  if (this.cx != this.fp.a) {
                     this.cx = (this.cx + this.fp.a) / 2;
                     this.bn = GameCanvas.gameTick % 5 + 2;
                  }
               } else if (this.cy < this.fp.b) {
                  this.bn = 12;
                  this.cx = (this.cx + this.fp.a) / 2;
                  if (this.p < 0) {
                     this.p = 0;
                  }

                  this.cy += this.p;
                  if ((TileMap.a(this.cx, this.cy) & 2) == 2) {
                     GameCanvas.b().a(-1, this.cx - -8, this.cy);
                     GameCanvas.b().a(1, this.cx - 8, this.cy);
                  }

                  ++this.p;
                  if (this.p > 16) {
                     this.cy = (this.cy + this.fp.b) / 2;
                  }
               } else {
                  this.bn = 7;
                  this.cx = (this.cx + this.fp.a) / 2;
                  this.cy = (this.cy + this.fp.b) / 2;
               }
            } else {
               var16 = true;
            }

            if (var16 && this.fj.size() > 0) {
               if (this.fj.size() > 5) {
                  this.fp = (Class_cy)this.fj.lastElement();
                  this.fj.removeElementAt(0);
                  this.cx = this.fp.a;
                  this.cy = this.fp.b;
                  this.fj.removeAllElements();
                  this.r = 6;
                  this.fp = null;
                  return;
               }

               this.fp = (Class_cy)this.fj.firstElement();
               this.fj.removeElementAt(0);
               if (this.fp.c == 2) {
                  this.r = 2;
                  if (this.cx - this.fp.a > 0) {
                     this.s = -1;
                  } else if (this.cx - this.fp.a < 0) {
                     this.s = 1;
                  }

                  this.o = 5 * this.s;
                  this.p = 0;
               } else if (this.fp.c == 3) {
                  this.r = 3;
                  GameCanvas.b().a(-1, this.cx - -8, this.cy);
                  GameCanvas.b().a(1, this.cx - 8, this.cy);
                  if (this.cx - this.fp.a > 0) {
                     this.s = -1;
                  } else if (this.cx - this.fp.a < 0) {
                     this.s = 1;
                  }

                  this.o = m(this.cx - this.fp.a) / 9 * this.s;
                  this.p = -10;
               } else if (this.fp.c == 4) {
                  this.r = 4;
                  if (this.cx - this.fp.a > 0) {
                     this.s = -1;
                  } else if (this.cx - this.fp.a < 0) {
                     this.s = 1;
                  }

                  this.o = m(this.cx - this.fp.a) / 9 * this.s;
                  this.p = 0;
               } else {
                  this.cx = this.fp.a;
                  this.cy = this.fp.b;
                  this.fp = null;
               }
            }

            if (this.r == 6) {
               if (this.bn >= 8 && this.bn <= 11) {
                  ++this.bn;
                  ++this.q;
                  if (this.bn > 11) {
                     this.bn = 8;
                  }

                  if (this.q > 5) {
                     this.bn = 0;
                  }
               }

               if (this.bn <= 1) {
                  ++this.q;
                  if (this.q > 6) {
                     this.bn = 0;
                  } else {
                     this.bn = 1;
                  }

                  if (this.q > 10) {
                     this.q = 0;
                  }
               }
            }

            this.gk = this.cx;
            this.gl = this.cy;
            if (System.currentTimeMillis() - this.fd > 7000L) {
               if (!this.bp && this.isWoft() && this.fr >= 500) {
                  this.bp = true;
                  Class_bj.a(60, this, 1);
               }

               if (this.bo && this.isBike()) {
                  this.bo = false;
                  this.bq = true;
               }
            }
         }
      }

      if (this.ie > 0) {
         this.bn = 21;
         --this.ie;
      } else {
         switch (this.r) {
            case 1:
               this.gt = false;
               this.c = 0;
               if (this.bp) {
                  if (this.s == 1) {
                     this.il = this.cx + 21 + 4;
                     this.im = this.cy - 15;
                  } else {
                     this.il = this.cx - 24 - 4;
                     this.im = this.cy - 15;
                  }
               }

               var11 = this;

               for(var1 = 0; var1 < var11.gu.size(); ++var1) {
                  (var3 = (Class_bp)var11.gu.elementAt(var1)).a();
                  if (var3.a >= 6) {
                     var11.gu.removeElementAt(var1);
                  }
               }

               var11.o = 0;
               var11.p = 0;
               ++var11.q;
               var11.gk = var11.cx;
               var11.gl = var11.cy;
               if (var11.q > 30) {
                  var11.q = 0;
               }

               if (var11.q % 15 < 5) {
                  var11.bn = 0;
               } else {
                  var11.bn = 1;
               }

               var11.ax();
               if (System.currentTimeMillis() - var11.fd > 7000L) {
                  if (!var11.bp && var11.isWoft() && var11.fr >= 500) {
                     var11.bp = true;
                     Class_bj.a(60, var11, 1);
                  }

                  if (var11.bo && var11.isBike()) {
                     var11.bo = false;
                     var11.bq = true;
                  }
               }
               break;
            case 2:
               if (this.bo) {
                  ++this.c;
                  if (this.arrItemMounts[4].template.id == 485 && this.arrItemMounts[4].sys >= 4) {
                     this.gt = true;
                  }

                  if (this.c > 20) {
                     this.gt = false;
                  }
               }

               if (this.bp) {
                  if (this.s == 1) {
                     if (this.ik[this.ij] == 1737) {
                        this.il = this.cx + 21 + 4;
                        this.im = this.cy - 19;
                     } else {
                        this.il = this.cx + 21 + 4;
                        this.im = this.cy - 16;
                     }
                  } else if (this.ik[this.ij] == 1737) {
                     this.il = this.cx - 24 - 4;
                     this.im = this.cy - 19;
                  } else {
                     this.il = this.cx - 24 - 4;
                     this.im = this.cy - 16;
                  }
               } else if (this.bo) {
                  if (this.s == 1) {
                     this.il = this.cx + 15;
                     this.in = this.cx - 25;
                     this.im = this.cy;
                     this.io = this.cy;
                  } else {
                     this.il = this.cx - 18;
                     this.in = this.cx + 25;
                     this.im = this.cy;
                     this.io = this.cy;
                  }
               }

               var1 = 0;
               if (!this.bl && this.fp != null) {
                  var1 = m(this.cx - this.fp.a);
               }

               ++this.q;
               if (this.q >= 10) {
                  this.q = 0;
               }

               this.bn = (this.q >> 1) + 2;
               if ((TileMap.a(this.cx, this.cy - 1) & 64) == 64) {
                  this.cx += this.o >> 1;
               } else {
                  this.cx += this.o;
               }

               if (this.s == 1) {
                  if (GameScr.es != 1) {
                     if (TileMap.a(this.cx + this.gp, this.cy - this.gq, 4)) {
                        if (this.bl) {
                           this.o = 0;
                           this.cx = TileMap.c(this.cx + this.gp) - this.gp;
                        } else {
                           this.al();
                        }
                     }
                  } else if (TileMap.a(this.cx + this.gp, this.cy - this.gq, 4)) {
                     if (this.bl) {
                        this.r = 3;
                        if (this.r == 3) {
                           this.p -= 10;
                        }
                     } else {
                        this.al();
                     }
                  }
               } else if (GameScr.es != 1) {
                  if (TileMap.a(this.cx - this.gp - 1, this.cy - this.gq, 8)) {
                     if (this.bl) {
                        this.o = 0;
                        this.cx = TileMap.c(this.cx - this.gp - 1) + TileMap.size + this.gp;
                     } else {
                        this.al();
                     }
                  }
               } else if (TileMap.a(this.cx - this.gp - 1, this.cy - this.gq, 8)) {
                  if (this.bl) {
                     this.r = 3;
                     if (this.r == 3) {
                        this.p -= 10;
                     }
                  } else {
                     this.al();
                  }
               }

               if (!this.bo && this.isBike()) {
                  this.bo = true;
                  this.bq = false;
               }

               if (!this.bp && this.isWoft() && this.fr >= 500) {
                  this.hu = Class_fa.e(this.cx - this.gk);
                  this.hx = Class_fa.e(this.cy - this.gl);
                  this.hu = this.hu > this.hx ? this.hu : this.hx;
                  if (this.bl && this.hu > 150 || !this.bl && this.hu > 40) {
                     this.bp = true;
                     Class_bj.a(60, this, 1);
                  }

                  this.hu = this.hx = 0;
               }

               if (this.bl) {
                  if (this.o > 0) {
                     --this.o;
                  } else if (this.o < 0) {
                     ++this.o;
                  } else {
                     this.ay();
                  }
               }

               if ((TileMap.a(this.cx, this.cy) & 2) != 2) {
                  if (this.bl) {
                     if ((this.cx - this.ff != 0 || this.cy - this.fg != 0) && this.bl) {
                        this.bn = 7;
                        this.r = 4;
                        this.o = 3 * this.s;
                        this.gm = 0;
                     }
                  } else {
                     this.al();
                  }
               }

               if (!this.bl && this.fp != null && m(this.cx - this.fp.a) > var1) {
                  this.al();
               }

               if (this.bo) {
                  if (GameCanvas.gameTick % 5 == 0) {
                     Class_bj.a(120, this.cx - (this.s << 5), this.cy, 0, (byte)this.s);
                  }
               } else {
                  GameCanvas.b().a(this.s, this.cx - (this.s << 3), this.cy);
               }

               this.ax();
               var5 = this.cx - (this.s << 4);
               var2 = this.cy;
               if (this.bp && this.arrItemMounts[4].sys >= 4 && this.getSys() > 0 && GameCanvas.gameTick % 8 == 0) {
                  if (this.getSys() == 1) {
                     Class_bj.a(116, var5, var2, 2);
                  } else if (this.getSys() == 2) {
                     Class_bj.a(117, var5, var2, 2);
                  } else if (this.getSys() == 3) {
                     Class_bj.a(118, var5, var2, 2);
                  }
               }
               break;
            case 3:
               this.gt = false;
               this.c = 0;
               if (this.bp) {
                  if (this.s == 1) {
                     this.il = this.cx + 21 + 4;
                     this.im = this.cy - 30;
                  } else {
                     this.il = this.cx - 23 - 4;
                     this.im = this.cy - 30;
                  }
               }

               if (GameScr.es == 1) {
                  if (this.s == 1) {
                     this.o = 5;
                  } else {
                     this.o = -5;
                  }
               }

               if (this.isBike()) {
                  this.bo = true;
                  this.bq = false;
               }

               this.cx += this.o;
               this.cy += this.p;
               if (this.cy < 0) {
                  this.cy = 0;
                  this.p = -1;
               }

               ++this.p;
               if (!this.bl && this.fp != null) {
                  label1335: {
                     if ((var1 = this.fp.a - this.cx) > 0) {
                        if (this.o > var1) {
                           this.o = var1;
                        }

                        if (this.o >= 0) {
                           break label1335;
                        }
                     } else if (var1 < 0) {
                        if (this.o < var1) {
                           this.o = var1;
                        }

                        if (this.o <= 0) {
                           break label1335;
                        }
                     }

                     this.o = var1;
                  }
               }

               if (this.q == 0) {
                  this.bn = 7;
               } else {
                  this.bn = 23;
               }

               if (this.bk) {
                  if (this.p == -3) {
                     this.bn = 8;
                  } else if (this.p == -2) {
                     this.bn = 9;
                  } else if (this.p == -1) {
                     this.bn = 10;
                  } else if (this.p == 0) {
                     this.bn = 11;
                  }
               }

               if (this.s == 1) {
                  if ((TileMap.a(this.cx + this.gp, this.cy - 1) & 4) == 4 && this.cx <= TileMap.c(this.cx + this.gp) + 12) {
                     this.cx = TileMap.c(this.cx + this.gp) - this.gp;
                     this.o = 0;
                  }
               } else if ((TileMap.a(this.cx - this.gp, this.cy - 1) & 8) == 8 && this.cx >= TileMap.c(this.cx - this.gp) + 12) {
                  this.cx = TileMap.c(this.cx + 24 - this.gp) + this.gp;
                  this.o = 0;
               }

               if (this.p == 0) {
                  if (this.bl) {
                     this.go = this.cy;
                     this.r = 4;
                     this.q = 0;
                     if (this.bk) {
                        this.gm = 1;
                     } else {
                        this.gm = 0;
                     }

                     this.p = 1;
                  } else {
                     this.al();
                  }
               }

               if (this.bl && !fk && this.a()) {
                  fk = true;
                  fl = true;
                  Service.getInstance().c();
                  GameCanvas.l();
                  GameCanvas.k();
               } else {
                  if (this.gn < 0) {
                     ++this.gn;
                  }

                  if (this.cy > this.bj && TileMap.a(this.cx, this.cy - this.bj, 8192)) {
                     if (this.bl) {
                        this.r = 4;
                        this.q = 0;
                        this.gm = 0;
                        this.p = 1;
                     } else {
                        this.al();
                     }
                  }

                  if (!this.bl && this.fp != null && this.cy < this.fp.b) {
                     this.al();
                  }
               }
               break;
            case 4:
               this.gt = false;
               this.c = 0;
               if (this.bp) {
                  if (this.s == 1) {
                     this.il = this.cx + 21 + 4;
                     this.im = this.cy - 19;
                  } else {
                     this.il = this.cx - 24;
                     this.im = this.cy - 20;
                  }
               }

               this.am();
               break;
            case 5:
               this.gt = false;
               this.c = 0;
               ++this.q;
               this.cx += (this.gm - this.cx) / 4;
               if (this.q > 7) {
                  this.cy += (this.gn - this.cy) / 4;
               } else {
                  this.cy += this.q - 10;
               }

               if (Class_fa.e(this.gm - this.cx) < 4 && Class_fa.e(this.gn - this.cy) < 10) {
                  this.cx = this.gm;
                  this.cy = this.gn;
                  this.r = 14;
                  this.n(60);
                  if (this.bl) {
                     GameScr.getInstance().resetButton();
                  }
               }

               this.bn = 21;
               break;
            case 6:
               this.gt = false;
               this.c = 0;
               if (this.bn == 21 && this.ie <= 0) {
                  this.bn = 0;
               }
            case 7:
            case 8:
            default:
               break;
            case 9:
               this.gt = false;
               this.c = 0;
               this.cx += this.o * this.s;
               this.cy += this.hb;
               ++this.hb;
               if (this.q == 0) {
                  this.bn = 7;
               } else {
                  this.bn = 23;
               }

               if (this.bk) {
                  if (this.hb == -3) {
                     this.bn = 8;
                  } else if (this.hb == -2) {
                     this.bn = 9;
                  } else if (this.hb == -1) {
                     this.bn = 10;
                  } else if (this.hb == 0) {
                     this.bn = 11;
                  }
               }

               if (this.hb == 0) {
                  this.r = 6;
                  ((Class_cy)this.fj.firstElement()).c = 4;
                  this.q = 0;
                  this.p = 1;
               }
               break;
            case 10:
               this.gt = false;
               this.c = 0;
               if (!TileMap.a(this.cx, this.cy, 64)) {
                  this.r = 4;
               }

               ++this.q;
               if (this.q >= 5) {
                  this.q = 0;
               }

               this.bn = this.q + 2;
               if (this.s == 1) {
                  if (TileMap.a(this.cx + this.gp, this.cy - 1, 4)) {
                     this.o = 0;
                     this.cx = TileMap.c(this.cx + this.gp) - this.gp;
                  }
               } else if (TileMap.a(this.cx - this.gp - 1, this.cy - 1, 8)) {
                  this.o = 0;
                  this.cx = TileMap.c(this.cx - this.gp - 1) + TileMap.size + this.gp;
               }

               this.cx += this.o;
               if (this.o > 0) {
                  --this.o;
               } else if (this.o < 0) {
                  ++this.o;
               } else if (this.cx - this.ff != 0) {
                  if (this.bl && System.currentTimeMillis() - (this.hm + (long)hn) >= 0L) {
                     hf = true;
                  }

                  this.r = 11;
               }

               GameCanvas.b();
               GameCanvas.d(this.cx, this.cy);
               GameCanvas.b().a(this.s, this.cx - (this.s << 3), this.cy);
               break;
            case 11:
               this.gt = false;
               this.c = 0;
               this.an();
               break;
            case 12:
               this.gt = false;
               this.c = 0;
               this.ak();
               break;
            case 13:
               this.gt = false;
               this.c = 0;
               break;
            case 14:
               this.gt = false;
               this.c = 0;
         }
      }

      if (this.gf != 0 || this.gg != 0) {
         this.b(this.gf, this.gg);
         this.gf = 0;
         this.gg = 0;
      }

      if (this.moveFast != null) {
         if (this.moveFast[0] == 0) {
            ++this.moveFast[0];
            Class_bj.a(60, this, 1);
         } else if (this.moveFast[0] < 10) {
            ++this.moveFast[0];
         } else {
            this.cx = this.moveFast[1];
            this.cy = this.moveFast[2];
            this.moveFast = null;
            Class_bj.a(60, this, 1);
            if (this.bl) {
               if ((TileMap.a(this.cx, this.cy) & 2) != 2) {
                  this.r = 4;
                  getMyChar().b(GameScr.skillPaints[38], 1);
               } else {
                  getMyChar().b(GameScr.skillPaints[38], 0);
               }
            }
         }
      }

      if (!this.bl && this.fj.size() == 0 && this.fh != 0 && this.fi != 0 && this.fp == null) {
         if (this.fh != this.cx) {
            this.cx = this.fh;
         }

         if (this.fi != this.cy) {
            this.cy = this.fi;
         }

         if (this.cHP > 0) {
            this.r = 6;
         }
      }

      ++this.b;
      if (this.b > 5) {
         this.b = 0;
      }

      this.ai();
      super.a((byte)0, this.r);
   }

   private void ai() {
      if (!this.bl) {
         if (this.bn == 12 && this.hg == this.cx && this.hh == this.cy) {
            ++this.hi;
         } else if (this.bn == 0 && (TileMap.a(this.cx, this.cy) & 2) != 2) {
            ++this.hi;
         } else {
            this.hi = 0;
         }

         if (this.hi > 1) {
            for(int var1 = this.cy; var1 < this.cy + 150; var1 += 24) {
               if ((TileMap.a(this.cx, var1) & 2) != 2) {
                  if ((var1 = TileMap.b(var1) + 24) - this.cy > 24) {
                     this.cy += (var1 - this.cy) / 2;
                     if (!this.bo && !this.bp) {
                        this.bn = 12;
                     }

                     this.fj.removeAllElements();
                     this.fp = null;
                  } else {
                     this.r = 1;
                     this.fj.removeAllElements();
                     this.fp = null;
                     this.o = 0;
                     this.p = 0;
                     this.q = 0;
                     this.gm = 0;
                     this.gn = 0;
                     this.hi = 0;
                     this.fh = 0;
                     this.fi = 0;
                     this.cy = var1;
                  }

                  this.gl = this.cy;
                  return;
               }
            }
         }
      }

   }

   private void aj() {
      if (this.r != 14 && this.r != 5) {
         if (this.gc != null && this.mobFocus != null && this.mobFocus.h == 0) {
            if (!this.bl) {
               if ((TileMap.a(this.cx, this.cy) & 2) == 2) {
                  this.ay();
               } else {
                  this.r = 6;
               }
            }

            this.hq = 0;
            this.gc = null;
            this.ia = this.ib = this.ic = null;
            this.hr = this.hs = this.ht = 0;
            this.mobFocus = null;
            this.gd = null;
            this.gb = null;
         }

         if (this.gc != null && this.gb == null && this.hq >= this.ao().length) {
            if (!this.bl) {
               if ((TileMap.a(this.cx, this.cy) & 2) == 2) {
                  this.ay();
               } else {
                  this.r = 6;
               }
            }

            this.hq = 0;
            this.gc = null;
            this.ia = this.ib = this.ic = null;
            this.hr = this.hs = this.ht = 0;
            this.gb = null;
         }

         Class_dj[] var1;
         if ((var1 = this.ao()) != null) {
            if (this.bl && this.bz.template.type == 2) {
               if (this.hq == var1.length - var1.length / 3) {
                  Service.getInstance().r();
                  this.m();
                  return;
               }
            } else if ((this.mobFocus != null || !this.bl && this.charFocus != null || this.bl && this.charFocus != null && b(this.charFocus)) && this.gb == null && this.hq == var1.length - var1.length / 3) {
               this.r();
               if (this.bl) {
                  this.m();
               }
            }
         }
      }

   }

   public final void m() {
      if (System.currentTimeMillis() - this.hl > 500L) {
         if (this.gi != null && this.bz.template.type != 1 && this.gi != null) {
            this.bz = this.gi;
            Service.getInstance().g(this.bz.template.id);
         }

         if (this.gj) {
            if (this.gi != null) {
               this.bz = this.gi;
               Service.getInstance().g(this.bz.template.id);
            }
         } else if (GameScr.es != 1) {
            this.gi = this.bz;
         }

         this.hl = System.currentTimeMillis();
      }

   }

   private void ak() {
      ++this.q;
      if (this.s == 1) {
         if ((TileMap.a(this.cx + this.gp, this.cy - this.gq) & 4) == 4) {
            this.o = 0;
         }
      } else if ((TileMap.a(this.cx - this.gp, this.cy - this.gq) & 8) == 8) {
         this.o = 0;
      }

      if (this.cy > this.bj && TileMap.a(this.cx, this.cy - this.bj, 8192)) {
         if (!TileMap.a(this.cx, this.cy, 2)) {
            this.r = 4;
            this.q = 0;
            this.gm = 0;
            this.p = 1;
         } else {
            this.cy = TileMap.b(this.cy);
         }
      }

      this.cx += this.o;
      this.cy += this.p;
      if (this.cy < 0) {
         this.cy = this.p = 0;
      }

      if (this.p == 0) {
         if ((TileMap.a(this.cx, this.cy) & 2) != 2) {
            this.r = 4;
            this.o = (this.getSpeed() >> 1) * this.s;
            this.q = this.gm = 0;
         }
      } else if (this.p < 0) {
         ++this.p;
         if (this.p == 0) {
            this.p = 1;
         }
      } else {
         if (this.p < 20 && this.q % 5 == 0) {
            ++this.p;
         }

         if (this.p > 3) {
            this.p = 3;
         }

         if ((TileMap.a(this.cx, this.cy + 3) & 2) == 2 && this.cy <= TileMap.c(this.cy + 3)) {
            this.o = this.p = 0;
            this.cy = TileMap.c(this.cy + 3);
         }

         if (TileMap.a(this.cx, this.cy, 64) && this.cy % TileMap.size > 8) {
            this.r = 10;
            this.o = this.s << 1;
            this.p >>= 2;
            this.cy = TileMap.b(this.cy) + 12;
            this.r = 11;
            return;
         }

         if (TileMap.a(this.cx, this.cy, 2048)) {
            this.r = 11;
            return;
         }
      }

      if (this.o > 0) {
         --this.o;
      } else {
         if (this.o < 0) {
            ++this.o;
         }

      }
   }

   private void al() {
      this.r = 6;
      this.o = 0;
      this.p = 0;
      this.q = this.gm = 0;
   }

   private static int m(int var0) {
      return var0 > 0 ? var0 : -var0;
   }

   private void am() {
      if (this.cy + 4 >= TileMap.d) {
         this.ay();
         this.o = this.p = 0;
      } else {
         if (this.cy % 24 == 0 && (TileMap.a(this.cx, this.cy) & 2) == 2) {
            if (this.bl) {
               this.o = this.p = 0;
               this.q = this.gm = 0;
               this.ay();
               return;
            }

            this.al();
            this.bn = 0;
            GameCanvas.b().a(-1, this.cx - -8, this.cy);
            GameCanvas.b().a(1, this.cx - 8, this.cy);
         }

         this.bn = 12;
         this.cx += this.o;
         if (!this.bl && this.fp != null) {
            label106: {
               int var1;
               if ((var1 = this.fp.a - this.cx) > 0) {
                  if (this.o > var1) {
                     this.o = var1;
                  }

                  if (this.o >= 0) {
                     break label106;
                  }
               } else if (var1 < 0) {
                  if (this.o < var1) {
                     this.o = var1;
                  }

                  if (this.o <= 0) {
                     break label106;
                  }
               }

               this.o = var1;
            }
         }

         this.cy += this.p;
         if (this.p < 20) {
            ++this.p;
         }

         if (this.s == 1) {
            if ((TileMap.a(this.cx + this.gp, this.cy - 1) & 4) == 4 && this.cx <= TileMap.c(this.cx + this.gp) + 12) {
               this.cx = TileMap.c(this.cx + this.gp) - this.gp;
               this.o = 0;
            }
         } else if ((TileMap.a(this.cx - this.gp, this.cy - 1) & 8) == 8 && this.cx >= TileMap.c(this.cx - this.gp) + 12) {
            this.cx = TileMap.c(this.cx + 24 - this.gp) + this.gp;
            this.o = 0;
         }

         if (this.p > 4 && (this.go == 0 || this.go <= TileMap.b(this.cy + 3)) && (TileMap.a(this.cx, this.cy + 3) & 2) == 2) {
            if (this.bl) {
               this.go = 0;
               this.o = this.p = 0;
               this.q = this.gm = 0;
               this.cy = TileMap.c(this.cy + 3);
               this.ay();
               GameCanvas.b().a(-1, this.cx - -8, this.cy);
               GameCanvas.b().a(1, this.cx - 8, this.cy);
            } else {
               this.al();
               this.cy = TileMap.c(this.cy + 3);
               this.bn = 0;
               GameCanvas.b().a(-1, this.cx - -8, this.cy);
               GameCanvas.b().a(1, this.cx - 8, this.cy);
            }
         } else {
            if (this.gm == 1) {
               if (this.p == 3) {
                  this.bn = 11;
               } else if (this.p == 2) {
                  this.bn = 8;
               } else if (this.p == 1) {
                  this.bn = 9;
               } else if (this.p == 0) {
                  this.bn = 10;
               }
            } else {
               this.bn = 12;
            }

            if (this.p > 6 && TileMap.a(this.cx, this.cy, 64) && this.cy % TileMap.size > 8) {
               this.cy = TileMap.b(this.cy) + 8;
               this.r = 10;
               this.o = this.s << 1;
               this.p >>= 2;
               this.cy = TileMap.b(this.cy) + 12;
            }

            if (!this.bl) {
               if ((TileMap.a(this.cx, this.cy + 1) & 2) == 2) {
                  this.bn = 0;
               }

               if (this.fp != null && this.cy > this.fp.b) {
                  this.al();
               }
            }

         }
      }
   }

   private void an() {
      this.cy += this.p;
      if (this.p < 20 && GameCanvas.gameTick % 2 == 0) {
         ++this.p;
      }

      this.bn = 7;
      if (this.cy >= TileMap.d) {
         this.cHP = 0;
         this.r = 5;
      } else if (TileMap.a(this.cx, this.cy, 2)) {
         this.ay();
         this.o = this.p = 0;
         this.q = this.gm = 0;
         this.cy = TileMap.c(this.cy);
      } else {
         if (TileMap.a(this.cx, this.cy, 2048)) {
            this.cHP = 0;
            this.r = 5;
         }

      }
   }

   public final void n() {
      this.weapon = 15;
      this.p();
      this.q();
   }

   public final void o() {
      this.weapon = 15;
   }

   public static Part b(int var0) {
      try {
         return var0 == 0 ? GameScr.parts[27] : GameScr.parts[2];
      } catch (Exception var1) {
         return null;
      }
   }

   public final void p() {
      if (this.cgender == 0) {
         this.body = 10;
      } else {
         this.body = 1;
      }
   }

   public final void q() {
      if (this.cgender == 0) {
         this.leg = 9;
      } else {
         this.leg = 0;
      }
   }

   public final void a(SkillPaint var1, int var2) {
      long var3 = System.currentTimeMillis();
      if (this.bl) {
         if (var3 - this.bz.lastTimeUseThisSkill < (long)this.bz.coolDown) {
            this.bz.paintCanNotUseSkill = true;
            return;
         }

         this.bz.lastTimeUseThisSkill = var3;
         this.cMP -= this.bz.manaUse;
         if (this.cMP < 0) {
            this.cMP = 0;
         }
      }

      this.b(var1, var2);
   }

   public final void b(SkillPaint var1, int var2) {
      this.gc = var1;
      this.id = var2;
      this.hq = 0;
      this.hr = this.hs = this.ht = this.hu = this.hv = this.hw = this.hx = this.hy = this.hz = 0;
      this.ia = null;
      this.ib = null;
      this.ic = null;
   }

   private Class_dj[] ao() {
      if (this.gc == null) {
         return null;
      } else {
         return this.id == 0 ? this.gc.b : this.gc.c;
      }
   }

   public final void r() {
      try {
         int var1;
         MyVector var3;
         mResources var8;
         if (this.bl) {
            if (this.bz.template.type == 2) {
               return;
            }

            if (this.bz.template.id == 42 && !this.bz.isCooldown()) {
               this.fo = true;
               this.gz = System.currentTimeMillis();
            }

            if (this.gc != null && (this.mobFocus != null || this.charFocus != null && b(this.charFocus))) {
               if (Code.b != null) {
                  Auto.a(this.gc);
                  return;
               }

               var1 = this.bz.b();
               int var2 = this.bz.c();
               var3 = new MyVector();
               MyVector var4 = new MyVector();
               int var5;
               Mob var6;
               Char var11;
               if (this.charFocus != null) {
                  var4.addElement(this.charFocus);

                  for(var5 = 0; var5 < GameScr.vCharInMap.size() && var3.size() + var4.size() < this.bz.d(); ++var5) {
                     if ((var11 = (Char)GameScr.vCharInMap.elementAt(var5)).r != 14 && var11.r != 5 && var11.r != 15 && !var11.df && !var11.equals(this.charFocus) && b(var11) && this.charFocus.cx - var1 <= var11.cx && var11.cx <= this.charFocus.cx + var1 && this.charFocus.cy - var2 <= var11.cy && var11.cy <= this.charFocus.cy + var2 && (this.s == -1 && var11.cx <= this.cx || this.s == 1 && var11.cx >= this.cx)) {
                        var4.addElement(var11);
                     }
                  }

                  for(var5 = 0; var5 < GameScr.vMobAttack.size() && var3.size() + var4.size() < this.bz.d(); ++var5) {
                     if ((var6 = (Mob)GameScr.vMobAttack.elementAt(var5)).h != 1 && var6.h != 0 && this.charFocus.cx - var1 <= var6.e && var6.e <= this.charFocus.cx + var1 && this.charFocus.cy - var2 <= var6.f && var6.f <= this.charFocus.cy + var2 && (this.s == -1 && var6.e <= this.cx || this.s == 1 && var6.e >= this.cx)) {
                        var3.addElement(var6);
                     }
                  }
               } else if (this.mobFocus != null && this.mobFocus.h != 1 && this.mobFocus.h != 0) {
                  var3.addElement(this.mobFocus);

                  for(var5 = 0; var5 < GameScr.vMobAttack.size() && var3.size() + var4.size() < this.bz.d(); ++var5) {
                     if ((var6 = (Mob)GameScr.vMobAttack.elementAt(var5)).h != 1 && var6.h != 0 && !var6.equals(this.mobFocus) && this.mobFocus.e - 100 <= var6.e && var6.e <= this.mobFocus.e + 100 && this.mobFocus.f - 50 <= var6.f && var6.f <= this.mobFocus.f + 50) {
                        var3.addElement(var6);
                     }
                  }

                  for(var5 = 0; var5 < GameScr.vCharInMap.size() && var3.size() + var4.size() < this.bz.d(); ++var5) {
                     if ((var11 = (Char)GameScr.vCharInMap.elementAt(var5)).r != 14 && var11.r != 5 && var11.r != 15 && !var11.df && (this.cm == 4 && var11.cm == 5 || this.cm == 5 && var11.cm == 4 || var11.cm == 3 || this.cm == 3 || var11.cm == 1 && this.cm == 1 || this.cz >= 0 && this.cz == var11.charID || this.da >= 0 && this.da == var11.charID) && this.mobFocus.e - var1 <= var11.cx && var11.cx <= this.mobFocus.e + var1 && this.mobFocus.f - var2 <= var11.cy && var11.cy <= this.mobFocus.f + var2 && (this.s == -1 && var11.cx <= this.cx || this.s == 1 && var11.cx >= this.cx)) {
                        var4.addElement(var11);
                     }
                  }
               }

               this.gd = new Class_cc[var3.size() + var4.size()];

               for(var5 = 0; var5 < var3.size(); ++var5) {
                  this.gd[var5] = new Class_cc();
                  this.gd[var5].d = GameScr.efs[this.gc.a - 1];
                  this.gd[var5].b = (Mob)var3.elementAt(var5);
               }

               for(var5 = 0; var5 < var4.size(); ++var5) {
                  this.gd[var5 + var3.size()] = new Class_cc();
                  this.gd[var5 + var3.size()].d = GameScr.efs[this.gc.a - 1];
                  this.gd[var5 + var3.size()].c = (Char)var4.elementAt(var5);
               }

               if (this.gd.length > 1) {
                  var8 = new mResources();
                  if (this.gd[0].b != null) {
                     var8 = new mResources(this.gd[0].b.e, this.gd[0].b.f);
                  } else if (this.gd[0].c != null) {
                     var8 = new mResources(this.gd[0].c.cx, this.gd[0].c.cy);
                  }

                  MyVector var12 = new MyVector();

                  for(var1 = 1; var1 < this.gd.length; ++var1) {
                     if (this.gd[var1].b != null) {
                        var12.addElement(new mResources(this.gd[var1].b.e, this.gd[var1].b.f));
                     } else if (this.gd[var1].c != null) {
                        var12.addElement(new mResources(this.gd[var1].c.cx, this.gd[var1].c.cy));
                     }

                     if (var1 > 5) {
                        break;
                     }
                  }

                  Class_bb.a(var12, var8, this.w());
               }

               byte var9 = 0;
               if (this.mobFocus != null) {
                  var9 = 1;
               } else if (this.charFocus != null) {
                  var9 = 2;
               }

               if (this.bl) {
                  Service.getInstance().a(var3, var4, var9);
                  return;
               }
            }
         } else if (this.gc != null && (this.mobFocus != null || this.charFocus != null)) {
            if (this.attMobs != null && this.attChars != null) {
               this.gd = new Class_cc[this.attMobs.length + this.attChars.length];

               for(var1 = 0; var1 < this.attMobs.length; ++var1) {
                  this.gd[var1] = new Class_cc();
                  this.gd[var1].d = GameScr.efs[this.gc.a - 1];
                  this.gd[var1].b = this.attMobs[var1];
               }

               for(var1 = 0; var1 < this.attChars.length; ++var1) {
                  this.gd[var1 + this.attMobs.length] = new Class_cc();
                  this.gd[var1 + this.attMobs.length].d = GameScr.efs[this.gc.a - 1];
                  this.gd[var1 + this.attMobs.length].c = this.attChars[var1];
               }

               this.attMobs = null;
               this.attChars = null;
            } else if (this.attMobs != null) {
               this.gd = new Class_cc[this.attMobs.length];

               for(var1 = 0; var1 < this.attMobs.length; ++var1) {
                  this.gd[var1] = new Class_cc();
                  this.gd[var1].d = GameScr.efs[this.gc.a - 1];
                  this.gd[var1].b = this.attMobs[var1];
               }

               this.attMobs = null;
            } else if (this.attChars != null) {
               this.gd = new Class_cc[this.attChars.length];

               for(var1 = 0; var1 < this.attChars.length; ++var1) {
                  this.gd[var1] = new Class_cc();
                  this.gd[var1].d = GameScr.efs[this.gc.a - 1];
                  this.gd[var1].c = this.attChars[var1];
               }

               this.attChars = null;
            }

            if (this.gd.length > 1 && this.gd[0] != null) {
               var8 = new mResources();
               if (this.gd[0].b != null) {
                  var8 = new mResources(this.gd[0].b.e, this.gd[0].b.f);
               } else if (this.gd[0].c != null) {
                  var8 = new mResources(this.gd[0].c.cx, this.gd[0].c.cy);
               }

               var3 = new MyVector();

               for(int var10 = 1; var10 < this.gd.length; ++var10) {
                  if (this.gd[var10].b != null) {
                     var3.addElement(new mResources(this.gd[var10].b.e, this.gd[var10].b.f));
                  } else if (this.gd[var10].c != null) {
                     var3.addElement(new mResources(this.gd[var10].c.cx, this.gd[var10].c.cy));
                  }

                  if (var10 > 5) {
                     break;
                  }
               }

               Class_bb.a(var3, var8, this.w());
               return;
            }
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }

   }

   public final boolean isWoft() {
      return this.arrItemMounts != null && this.arrItemMounts[4] != null && this.arrItemMounts[4].template != null && (this.arrItemMounts[4].template.id == 443 || this.arrItemMounts[4].template.id == 523);
   }

   public final boolean isBike() {
      return this.arrItemMounts != null && this.arrItemMounts[4] != null && this.arrItemMounts[4].template != null && (this.arrItemMounts[4].template.id == 485 || this.arrItemMounts[4].template.id == 524);
   }
   
   public final boolean isNewMount() {
      return this.arrItemMounts != null && this.arrItemMounts[4] != null && this.arrItemMounts[4].template != null && this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523 && this.arrItemMounts[4].template.id != 485 && this.arrItemMounts[4].template.id != 524;
   }

   public final boolean u() {
      return this.cx >= GameScr.i && this.cx <= GameScr.i + GameScr.b && this.cy >= GameScr.j && this.cy <= GameScr.j + GameScr.c + 30;
   }

   public void a(mGraphics var1) {
      if (!this.u()) {
         if (this.gc != null) {
            this.hq = this.ao().length;
            this.gc = null;
            this.gd = null;
            this.hp = null;
            this.ga = null;
            this.ho = -1;
            this.fz = -1;
            return;
         }
      } else {
         this.b(var1, this.cx, this.cy, 0);
         if (this.r != 15 && (this.moveFast == null || this.moveFast[0] <= 0)) {
            this.c(var1);
            Char var2;
            if (this.gc != null && this.hq < this.ao().length) {
               mGraphics var3 = var1;
               var2 = this;

               try {
                  Class_dj[] var4 = var2.ao();
                  var2.bn = var4[var2.hq].a;
                  if (var4[var2.hq].b != 0) {
                     var2.ia = GameScr.efs[var4[var2.hq].b - 1];
                     var2.hr = var2.hu = var2.hx = 0;
                  }

                  if (var4[var2.hq].e != 0) {
                     var2.ib = GameScr.efs[var4[var2.hq].e - 1];
                     var2.hs = var2.hv = var2.hy = 0;
                  }

                  if (var4[var2.hq].h != 0) {
                     var2.ic = GameScr.efs[var4[var2.hq].h - 1];
                     var2.ht = var2.hw = var2.hz = 0;
                  }

                  if (var4 != null && var4[var2.hq] != null && var4[var2.hq].k != 0) {
                     var2.gb = new Class_bq(var2, GameScr.t[var4[var2.hq].k - 1]);
                     var2.gb.a = 10;
                     var2.gb.b = var2.cx + var4[var2.hq].l;
                     var2.gb.c = var2.cy + var4[var2.hq].m;
                  }

                  var2.d(var3);
                  if (var2.s == 1) {
                     if (var2.ia != null) {
                        if (var2.hu == 0) {
                           var2.hu = var4[var2.hq].c;
                        }

                        if (var2.hx == 0) {
                           var2.hx = var4[var2.hq].d;
                        }

                        SmallImage.paintImage(var3, var2.ia.arrEfInfo[var2.hr].c, var2.cx + var2.hu + var2.ia.arrEfInfo[var2.hr].a, var2.cy + var2.hx + var2.ia.arrEfInfo[var2.hr].b, 0, 3);
                        ++var2.hr;
                        if (var2.hr >= var2.ia.arrEfInfo.length) {
                           var2.ia = null;
                           var2.hr = var2.hu = var2.hx = 0;
                        }
                     }

                     if (var2.ib != null) {
                        if (var2.hv == 0) {
                           var2.hv = var4[var2.hq].f;
                        }

                        if (var2.hy == 0) {
                           var2.hy = var4[var2.hq].g;
                        }

                        SmallImage.paintImage(var3, var2.ib.arrEfInfo[var2.hs].c, var2.cx + var2.hv + var2.ib.arrEfInfo[var2.hs].a, var2.cy + var2.hy + var2.ib.arrEfInfo[var2.hs].b, 0, 3);
                        ++var2.hs;
                        if (var2.hs >= var2.ib.arrEfInfo.length) {
                           var2.ib = null;
                           var2.hs = var2.hv = var2.hy = 0;
                        }
                     }

                     if (var2.ic != null) {
                        if (var2.hw == 0) {
                           var2.hw = var4[var2.hq].i;
                        }

                        if (var2.hz == 0) {
                           var2.hz = var4[var2.hq].j;
                        }

                        SmallImage.paintImage(var3, var2.ic.arrEfInfo[var2.ht].c, var2.cx + var2.hw + var2.ic.arrEfInfo[var2.ht].a, var2.cy + var2.hz + var2.ic.arrEfInfo[var2.ht].b, 0, 3);
                        ++var2.ht;
                        if (var2.ic.arrEfInfo != null && var2.ht >= var2.ic.arrEfInfo.length) {
                           var2.ic = null;
                           var2.ht = var2.hw = var2.hz = 0;
                        }
                     }
                  } else {
                     if (var2.ia != null) {
                        if (var2.hu == 0) {
                           var2.hu = var4[var2.hq].c;
                        }

                        if (var2.hx == 0) {
                           var2.hx = var4[var2.hq].d;
                        }

                        SmallImage.paintImage(var3, var2.ia.arrEfInfo[var2.hr].c, var2.cx - var2.hu - var2.ia.arrEfInfo[var2.hr].a, var2.cy + var2.hx + var2.ia.arrEfInfo[var2.hr].b, 2, 3);
                        ++var2.hr;
                        if (var2.hr >= var2.ia.arrEfInfo.length) {
                           var2.ia = null;
                           var2.hr = 0;
                           var2.hu = 0;
                           var2.hx = 0;
                        }
                     }

                     if (var2.ib != null) {
                        if (var2.hv == 0) {
                           var2.hv = var4[var2.hq].f;
                        }

                        if (var2.hy == 0) {
                           var2.hy = var4[var2.hq].g;
                        }

                        SmallImage.paintImage(var3, var2.ib.arrEfInfo[var2.hs].c, var2.cx - var2.hv - var2.ib.arrEfInfo[var2.hs].a, var2.cy + var2.hy + var2.ib.arrEfInfo[var2.hs].b, 2, 3);
                        ++var2.hs;
                        if (var2.hs >= var2.ib.arrEfInfo.length) {
                           var2.ib = null;
                           var2.hs = 0;
                           var2.hv = 0;
                           var2.hy = 0;
                        }
                     }

                     if (var2.ic != null) {
                        if (var2.hw == 0) {
                           var2.hw = var4[var2.hq].i;
                        }

                        if (var2.hz == 0) {
                           var2.hz = var4[var2.hq].j;
                        }

                        SmallImage.paintImage(var3, var2.ic.arrEfInfo[var2.ht].c, var2.cx - var2.hw - var2.ic.arrEfInfo[var2.ht].a, var2.cy + var2.hz + var2.ic.arrEfInfo[var2.ht].b, 2, 3);
                        ++var2.ht;
                        if (var2.ic.arrEfInfo != null && var2.ht >= var2.ic.arrEfInfo.length) {
                           var2.ic = null;
                           var2.ht = 0;
                           var2.hw = 0;
                           var2.hz = 0;
                        }
                     }
                  }

                  ++var2.hq;
               } catch (Exception var6) {
                  System.out.println("loi paint charskill");
               }
            } else {
               this.d(var1);
            }

            if (this.gb != null) {
               this.gb.a(var1);
            }

            int var8;
            if (this.gd != null) {
               try {
                  for(var8 = 0; var8 < this.gd.length; ++var8) {
                     if (this.gd[var8] != null) {
                        if (this.gd[var8].b != null) {
                           if (!this.gd[var8].e) {
                              this.gd[var8].b.a();
                              this.gd[var8].b.ac = this;
                              if (this.bl) {
                                 getMyChar();
                                 getMyChar();
                                 NinjaUtil.a(11);
                              }

                              if (this.gd[var8].b.s != 98 && this.gd[var8].b.s != 99) {
                                 GameScr.a(this.gd[var8].b.e, this.gd[var8].b.f - (this.gd[var8].b.l >> 1), this.s);
                              }

                              this.gd[var8].e = true;
                           }

                           SmallImage.paintImage(var1, this.gd[var8].a(), this.gd[var8].b.e, this.gd[var8].b.f, 0, 33);
                        } else if (this.gd[var8].c != null) {
                           if (!this.gd[var8].e) {
                              if (this.gd[var8].c.charID >= 0) {
                                 (var2 = this.gd[var8].c).ie = 4;
                                 var2.n(49);
                              }

                              GameScr.a(this.gd[var8].c.cx, this.gd[var8].c.cy - (this.gd[var8].c.bj >> 1), this.s);
                              this.gd[var8].e = true;
                           }

                           SmallImage.paintImage(var1, this.gd[var8].a(), this.gd[var8].c.cx, this.gd[var8].c.cy, 0, 33);
                        }

                        if (++this.gd[var8].a >= this.gd[var8].d.arrEfInfo.length) {
                           this.gd[var8] = null;
                        }
                     }
                  }
               } catch (Exception var7) {
               }
            }

            if (this.ho >= 0 && this.hp != null) {
               SmallImage.paintImage(var1, this.hp.arrEfInfo[this.ho].c, this.cx + this.hp.arrEfInfo[this.ho].a, this.cy + this.hp.arrEfInfo[this.ho].b, 0, 3);
               if (GameCanvas.gameTick % 2 == 0) {
                  ++this.ho;
                  if (this.ho >= this.hp.arrEfInfo.length) {
                     this.ho = -1;
                     this.hp = null;
                  }
               }
            }

            if (this.fz >= 0 && this.ga != null) {
               SmallImage.paintImage(var1, this.ga.arrEfInfo[this.fz].c, this.cx + this.ga.arrEfInfo[this.fz].a, this.cy + this.ga.arrEfInfo[this.fz].b, 0, 3);
               if (GameCanvas.gameTick % 2 == 0) {
                  ++this.fz;
                  if (this.fz >= this.ga.arrEfInfo.length) {
                     this.fz = -1;
                     this.ga = null;
                  }
               }
            }

            if (this.hd) {
               if (this.hc < 2) {
                  SmallImage.paintImage(var1, 1366, this.cx, this.cy - this.gq, 0, 3);
               } else if (this.hc < 4) {
                  SmallImage.paintImage(var1, 1367, this.cx, this.cy - this.gq, 0, 3);
               } else if (this.hc < 8) {
                  SmallImage.paintImage(var1, 1368, this.cx, this.cy - this.gq, 0, 3);
               } else if (GameCanvas.gameTick % 2 == 0) {
                  SmallImage.paintImage(var1, 1369, this.cx, this.cy - this.gq, 0, 3);
               } else {
                  SmallImage.paintImage(var1, 1370, this.cx, this.cy - this.gq, 0, 3);
               }
            }

            try {
               if (this.mobMe != null) {
                  this.mobMe.a(var1);
               }
            } catch (Exception var5) {
               var5.printStackTrace();
            }

            if (this.r != 1 && this.r != 6) {
               for(var8 = 0; var8 < this.gu.size(); ++var8) {
                  ((Class_bp)this.gu.elementAt(var8)).a(var1);
               }
            }

            this.a(var1, this.cx, this.cy, 0);
         }
      }

   }

   public final void a(mGraphics var1, int var2, int var3) {
      int var4 = this.cHP * 26 / this.cMaxHP;
      if (this.r != 5 && this.r != 14 && var4 < 2) {
         var4 = 2;
      } else if (this.r == 5 || this.r == 14) {
         var4 = 0;
      }

      if (var4 > 26) {
         var4 = 0;
      }

      var1.setColor(16777215);
      var1.fillRect(var2, var3, 26, 4);
      var1.setColor(this.w());
      var1.fillRect(var2, var3, var4, 4);
      var1.setColor(0);
      var1.drawRect(var2, var3, 26, 4);
   }

   private int[] ap() {
      int[] var1 = null;
      if (this.bo && this.arrItemMounts[4].template.id == 485 && this.arrItemMounts[4].sys >= 3) {
         var1 = new int[]{2094, 2095, 2096};
      }

      return var1;
   }

   private int[] aq() {
      int[] var1 = null;
      if (this.bo) {
         var1 = new int[]{2082, 2083, 2084, 2089};
      }

      return var1;
   }

   private int[] ar() {
      int[] var1 = null;
      if (this.bp) {
         var1 = new int[]{2085, 2086, 2087, 2088};
      }

      return var1;
   }

   public final int[] v() {
      int[] var1 = null;
      short var2 = -1;
      if (this.bl) {
         if (this.arrItemBody[12] != null) {
            var2 = this.arrItemBody[12].template.id;
         }
      } else {
         var2 = this.fx;
      }

      if (var2 == -1) {
         return null;
      } else {
         if (var2 == 420) {
            if (!this.bp && !this.bo) {
               var1 = new int[]{1635, 1636, 1637, 1636};
            } else {
               var1 = new int[]{2029, 2030, 2031, 2030};
            }
         } else if (var2 == 421) {
            if (!this.bp && !this.bo) {
               var1 = new int[]{1652, 1653, 1654, 1653};
            } else {
               var1 = new int[]{2035, 2036, 2037, 2036};
            }
         } else if (var2 == 422) {
            if (!this.bp && !this.bo) {
               var1 = new int[]{1655, 1656, 1657, 1656};
            } else {
               var1 = new int[]{2032, 2033, 2034, 2033};
            }
         }

         return var1;
      }
   }

   public final int w() {
      int var1 = 9145227;
      if (this.nClass.classId != 1 && this.nClass.classId != 2 && this.nClass.classId != 7) {
         if (this.nClass.classId != 3 && this.nClass.classId != 4) {
            if (this.nClass.classId == 5 || this.nClass.classId == 6) {
               var1 = 7443811;
            }
         } else {
            var1 = 33023;
         }
      } else {
         var1 = 16711680;
      }

      return var1;
   }

   public final void b(mGraphics var1) {
      if (this.u()) {
         if (getMyChar().charFocus == null || !getMyChar().charFocus.equals(this)) {
            mFont.tahoma_7_yellow.writeText(var1, this.charName, this.cx, this.cy - this.bj - mFont.tahoma_7_green.c() - 5, 2, mFont.tahoma_7_grey);
            return;
         }

         if (getMyChar().charFocus != null && getMyChar().charFocus.equals(this)) {
            mFont.tahoma_7_yellow.writeText(var1, this.charName, this.cx, this.cy - this.bj - mFont.tahoma_7_green.c() - 10, 2, mFont.tahoma_7_grey);
         }
      }

   }

   public final void c(mGraphics var1) {
      int var2 = this.bj + 5 + (!this.bp && !this.bo ? 0 : 15);
      if (!this.df || this.bl) {
         boolean var3;
         label125: {
            var3 = false;
            if (this.bl) {
               GameScr.getInstance();
               if (GameScr.es != 1) {
                  if (this.npcFocus == null && this.charFocus == null && this.mobFocus == null && this.itemFocus == null) {
                     var3 = true;
                     var2 += mFont.tahoma_7.c();
                     if (!this.isHuman) {
                        mFont.tahoma_7_blue1.writeText(var1, this.charName, this.cx, this.cy - var2, 2, mFont.tahoma_7_grey);
                     } else {
                        mFont.tahoma_7_white.writeText(var1, this.charName, this.cx, this.cy - var2, 2, mFont.tahoma_7_grey);
                     }

                     ++var2;
                  }
                  break label125;
               }

               if (!GameScr.getInstance().et) {
                  var2 += mFont.tahoma_7.c();
                  mFont.tahoma_7_yellow.writeText(var1, mResources.ao, this.cx, this.cy - var2, 2, mFont.tahoma_7_grey);
               } else {
                  var2 += mFont.tahoma_7.c();
                  mFont.tahoma_7_yellow.writeText(var1, mResources.ap, this.cx, this.cy - var2, 2, mFont.tahoma_7_grey);
               }
            } else {
               if (getMyChar().charFocus != null && getMyChar().charFocus.equals(this)) {
                  var3 = true;
                  var2 += 5;
                  this.a(var1, this.cx - 13, this.cy - var2);
                  var2 += mFont.tahoma_7.c();
                  if (!this.isHuman) {
                     mFont.tahoma_7_blue1.writeText(var1, this.charName, this.cx, this.cy - var2, 2, mFont.tahoma_7_grey);
                  } else {
                     mFont.tahoma_7_white.writeText(var1, this.charName, this.cx, this.cy - var2, 2, mFont.tahoma_7_grey);
                  }

                  ++var2;
                  break label125;
               }

               if (!this.gv) {
                  break label125;
               }

               var3 = true;
               var2 += mFont.tahoma_7.c();
               if (!this.isHuman) {
                  mFont.tahoma_7_blue1.writeText(var1, this.charName, this.cx, this.cy - var2, 2, mFont.tahoma_7_grey);
               } else {
                  mFont.tahoma_7_white.writeText(var1, this.charName, this.cx, this.cy - var2, 2, mFont.tahoma_7_grey);
               }
            }

            ++var2;
         }

         if (this.charID == -getMyChar().charID) {
            var2 += mFont.tahoma_7.c();
            mFont.tahoma_7_yellow.writeText(var1, mResources.aq + " " + getMyChar().charName + " " + mResources.dd, this.cx, this.cy - var2, 2, mFont.tahoma_7_grey);
            ++var2;
         }

         if (!this.cClanName.equals("") && var3) {
            var2 += mFont.tahoma_7.c() - 1;
            byte var4 = 0;
            if (this.ctypeClan > 0) {
               var4 = 5;
            }

            mFont.tahoma_7_white.writeText(var1, this.cClanName, this.cx + var4, this.cy - var2, 2, mFont.tahoma_7_blue);
            if (this.ctypeClan == 3) {
               SmallImage.paintImage(var1, 1215, this.cx - (mFont.tahoma_7_white.a(this.cClanName) / 2 + (7 - var4)), this.cy - var2 + 1, 0, 17);
            } else if (this.ctypeClan == 4) {
               SmallImage.paintImage(var1, 1216, this.cx - (mFont.tahoma_7_white.a(this.cClanName) / 2 + (7 - var4)), this.cy - var2 + 1, 0, 17);
            } else if (this.ctypeClan == 2) {
               SmallImage.paintImage(var1, 1217, this.cx - (mFont.tahoma_7_white.a(this.cClanName) / 2 + (7 - var4)), this.cy - var2 + 1, 0, 17);
            }

            ++var2;
         }

         if (this.db > 0 && this.db < 30) {
            var2 += SmallImage.smallImg[1117][4];
            SmallImage.paintImage(var1, 1117, this.cx, this.cy - var2, 0, 17);
            return;
         }

         if (this.db > 30 && this.db < 60) {
            var2 += SmallImage.smallImg[1117][4];
            SmallImage.paintImage(var1, 1126, this.cx, this.cy - var2, 0, 17);
            return;
         }

         if (this.db > 60 && this.db < 90) {
            var2 += SmallImage.smallImg[1117][4];
            SmallImage.paintImage(var1, 1118, this.cx, this.cy - var2, 0, 17);
            return;
         }

         if (this.charID >= 0) {
            if (this.da >= 0) {
               var2 += SmallImage.smallImg[1122][4];
               SmallImage.paintImage(var1, 1122, this.cx, this.cy - var2, 0, 17);
               return;
            }

            if (this.cm == 3) {
               var2 += SmallImage.smallImg[1121][4];
               SmallImage.paintImage(var1, 1121, this.cx, this.cy - var2, 0, 17);
               return;
            }

            if (this.cm == 2) {
               var2 += SmallImage.smallImg[1124][4];
               SmallImage.paintImage(var1, 1124, this.cx, this.cy - var2, 0, 17);
               return;
            }

            if (this.cm == 1) {
               var2 += SmallImage.smallImg[1123][4];
               SmallImage.paintImage(var1, 1123, this.cx, this.cy - var2, 0, 17);
               return;
            }

            if (this.cm == 4) {
               var2 += SmallImage.smallImg[1240][4];
               SmallImage.paintImage(var1, 1240, this.cx, this.cy - var2, 0, 17);
               return;
            }

            if (this.cm == 5) {
               var2 += SmallImage.smallImg[1241][4];
               SmallImage.paintImage(var1, 1241, this.cx, this.cy - var2, 0, 17);
               return;
            }

            if (this.cz > 0) {
               var2 += SmallImage.smallImg[1116][4];
               SmallImage.paintImage(var1, 1116, this.cx, this.cy - var2, 0, 17);
            }
         }
      }

   }

   private void d(mGraphics var1) {
      try {
         Part var2 = GameScr.parts[this.head];
         Part var3 = GameScr.parts[this.leg];
         Part var4 = GameScr.parts[this.body];
         Part var5 = GameScr.parts[this.weapon];
         if (this.arrItemBody != null && this.arrItemBody[11] != null) {
            var2 = GameScr.parts[this.arrItemBody[11].template.part];
            this.head = this.arrItemBody[11].template.part;
         }

         int var6;
         if (var2.a != null && var2.a.length >= 8) {
            for(var6 = 0; var6 < var2.a.length; ++var6) {
               if (var2.a[var6] == null || !SmallImage.a(var2.a[var6].a)) {
                  var2 = b(this.cgender);
                  break;
               }
            }
         } else {
            var2 = b(this.cgender);
         }

         int[] var7 = var2.a[fe[this.bn][0][0]].a <= 4 ? null : (var2.a[fe[this.bn][0][0]].a <= 4 ? null : this.v());
         if (((this.r == 1 || this.r == 6) && GameCanvas.gameTick % 10 == 0 || (this.r == 2 || this.r == 10) && GameCanvas.gameTick % 2 == 0 || GameCanvas.gameTick % 3 == 0 && (this.r == 4 || this.r == 3)) && var7 != null) {
            ++this.de;
            if (this.de >= var7.length) {
               this.de = 0;
            }
         }

         if (this.r == 14) {
            if (this.isBike()) {
               if (this.arrItemMounts[4].template.id == 485) {
                  if (this.arrItemMounts[4].sys < 2) {
                     SmallImage.paintImage(var1, 1800, this.gk, this.gl, 2, 33);
                  } else {
                     SmallImage.paintImage(var1, 2063, this.gk, this.gl, 2, 33);
                  }
               } else if (this.arrItemMounts[4].template.id == 524) {
                  if (this.arrItemMounts[4].sys < 2) {
                     SmallImage.paintImage(var1, 2064, this.gk, this.gl, 2, 33);
                  } else {
                     SmallImage.paintImage(var1, 2068, this.gk, this.gl, 2, 33);
                  }
               }
            }

            SmallImage.paintImage(var1, 1040, this.cx, this.cy, 0, 33);
         } else if (this.df) {
            if (this.bl) {
               if (GameCanvas.gameTick % 50 != 48 && GameCanvas.gameTick % 50 != 90) {
                  SmallImage.paintImage(var1, 1195, this.cx, this.cy - 18, 0, 3);
               } else {
                  SmallImage.paintImage(var1, 1196, this.cx, this.cy - 18, 0, 3);
               }
            }
         } else {
            var6 = 0;
            int var8 = 0;
            int var9 = 0;
            byte var10 = 0;
            int[] var11;
            if ((var11 = this.ap()) != null) {
               ++this.gw;
               if (this.gw >= var11.length) {
                  this.gw = 0;
               }
            }

            if (this.bo) {
               if (this.arrItemMounts[4].template.id == 485) {
                  if (this.arrItemMounts[4].sys < 2) {
                     if (this.r != 1 && this.r != 6) {
                        if (this.r == 2 || this.r == 10) {
                           var6 = GameCanvas.gameTick % 6 > 3 ? 1 : 0;
                        }
                     } else {
                        var6 = GameCanvas.gameTick % 20 > 12 ? 1 : 0;
                     }

                     if (this.r == 3) {
                        var9 = -5 * this.s;
                     }

                     if (this.s == 1) {
                        if (this.r == 3) {
                           SmallImage.paintImage(var1, 1711, this.cx, this.cy + 2, 0, 33);
                        } else {
                           SmallImage.paintImage(var1, var6 == 0 ? 1709 : 1710, this.cx, this.cy, 0, 33);
                        }

                        SmallImage.paintImage(var1, this.au(), this.cx + var9 + this.ifa * this.s, this.cy - fe[0][0][2] + var2.a[fe[0][0][0]].c - 12 + var6 + this.ig, 0, 17);
                        SmallImage.paintImage(var1, this.at(), this.cx + this.ih * this.s, this.cy - SmallImage.b(this.as()) - 8 + var6 + this.ii, 0, 33);
                     } else {
                        if (this.r == 3) {
                           SmallImage.paintImage(var1, 1711, this.cx, this.cy + 2, 2, 33);
                        } else {
                           SmallImage.paintImage(var1, var6 == 0 ? 1709 : 1710, this.cx, this.cy, 2, 33);
                        }

                        SmallImage.paintImage(var1, this.au(), this.cx + var9 + this.ifa * this.s, this.cy - fe[0][0][2] + var2.a[fe[0][0][0]].c - 12 + var6 + this.ig, 2, 17);
                        SmallImage.paintImage(var1, this.at(), this.cx + this.ih * this.s, this.cy - SmallImage.b(this.as()) - 8 + var6 + this.ii, 2, 33);
                     }
                  } else {
                     if (this.r != 1 && this.r != 6) {
                        if (this.r == 2 || this.r == 10) {
                           var6 = GameCanvas.gameTick % 6 > 3 ? 1 : 0;
                        }
                     } else {
                        var6 = GameCanvas.gameTick % 20 > 12 ? 1 : 0;
                     }

                     if (this.r == 3) {
                        var9 = -5 * this.s;
                     }

                     if (this.s == 1) {
                        if (this.r == 3) {
                           SmallImage.paintImage(var1, 2057, this.cx, this.cy + 2, 0, 33);
                        } else if (!this.gt) {
                           SmallImage.paintImage(var1, var6 == 0 ? 2056 : 2055, this.cx, this.cy, 0, 33);
                        } else {
                           SmallImage.paintImage(var1, 2057, this.cx, this.cy, 0, 33);
                        }

                        if (this.r == 2 && var11 != null) {
                           SmallImage.paintImage(var1, var11[this.gw], this.cx - 25, this.cy - 2, 0, 33);
                        }

                        if (!this.gt) {
                           SmallImage.paintImage(var1, this.au(), this.cx + var9 + this.ifa * this.s, this.cy - fe[0][0][2] + var2.a[fe[0][0][0]].c - 12 + var6 + this.ig, 0, 17);
                           SmallImage.paintImage(var1, this.at(), this.cx + this.ih * this.s, this.cy - SmallImage.b(this.as()) - 8 + var6 + this.ii, 0, 33);
                        } else {
                           SmallImage.paintImage(var1, this.au(), this.cx + var9 + this.ifa * this.s - 3, this.cy - 1 - fe[0][0][2] + var2.a[fe[0][0][0]].c - 12 + var6 + this.ig, 0, 17);
                           SmallImage.paintImage(var1, this.at(), this.cx - 3 + this.ih * this.s, this.cy - 1 - SmallImage.b(this.as()) - 8 + var6 + this.ii, 0, 33);
                        }
                     } else {
                        if (this.r == 3) {
                           SmallImage.paintImage(var1, 2057, this.cx, this.cy + 2, 2, 33);
                        } else if (!this.gt) {
                           SmallImage.paintImage(var1, var6 == 0 ? 2056 : 2055, this.cx, this.cy, 2, 33);
                        } else {
                           SmallImage.paintImage(var1, 2057, this.cx, this.cy, 2, 33);
                        }

                        if (this.r == 2 && var11 != null) {
                           SmallImage.paintImage(var1, var11[this.gw], this.cx + 25, this.cy - 2, 2, 33);
                        }

                        SmallImage.paintImage(var1, this.au(), this.cx + var9 + this.ifa * this.s, this.cy - fe[0][0][2] + var2.a[fe[0][0][0]].c - 12 + var6 + this.ig, 2, 17);
                        SmallImage.paintImage(var1, this.at(), this.cx + this.ih * this.s, this.cy - SmallImage.b(this.as()) - 8 + var6 + this.ii, 2, 33);
                     }
                  }
               } else if (this.arrItemMounts[4].template.id == 524) {
                  if (this.arrItemMounts[4].sys < 2) {
                     if (this.r != 1 && this.r != 6) {
                        if (this.r == 2 || this.r == 10) {
                           var6 = GameCanvas.gameTick % 6 > 3 ? 1 : 0;
                        }
                     } else {
                        var6 = GameCanvas.gameTick % 20 > 12 ? 1 : 0;
                     }

                     if (this.r == 3) {
                        var9 = -5 * this.s;
                     }

                     if (this.s == 1) {
                        if (this.r == 3) {
                           SmallImage.paintImage(var1, 2066, this.cx, this.cy + 2, 0, 33);
                        } else {
                           SmallImage.paintImage(var1, var6 == 0 ? 2064 : 2065, this.cx, this.cy, 0, 33);
                        }

                        SmallImage.paintImage(var1, this.au(), this.cx + var9 + this.ifa * this.s, this.cy - fe[0][0][2] + var2.a[fe[0][0][0]].c - 12 + var6 + this.ig, 0, 17);
                        SmallImage.paintImage(var1, this.at(), this.cx + this.ih * this.s, this.cy - SmallImage.b(this.as()) - 8 + var6 + this.ii, 0, 33);
                     } else {
                        if (this.r == 3) {
                           SmallImage.paintImage(var1, 2066, this.cx, this.cy + 2, 2, 33);
                        } else {
                           SmallImage.paintImage(var1, var6 == 0 ? 2064 : 2065, this.cx, this.cy, 2, 33);
                        }

                        SmallImage.paintImage(var1, this.au(), this.cx + var9 + this.ifa * this.s, this.cy - fe[0][0][2] + var2.a[fe[0][0][0]].c - 12 + var6 + this.ig, 2, 17);
                        SmallImage.paintImage(var1, this.at(), this.cx + this.ih * this.s, this.cy - SmallImage.b(this.as()) - 8 + var6 + this.ii, 2, 33);
                     }
                  } else if (this.arrItemMounts[4].sys >= 2 && this.arrItemMounts[4].sys < 4) {
                     if ((var7 = this.aq()) != null) {
                        ++this.gw;
                        if (this.gw >= var7.length) {
                           this.gw = 0;
                        }
                     }

                     if (this.r != 1 && this.r != 6) {
                        if (this.r == 2 || this.r == 10) {
                           var6 = GameCanvas.gameTick % 6 > 3 ? 1 : 0;
                        }
                     } else {
                        var6 = GameCanvas.gameTick % 20 > 12 ? 1 : 0;
                     }

                     if (this.r == 3) {
                        var9 = -5 * this.s;
                     }

                     if (this.s == 1) {
                        if (this.r == 3) {
                           SmallImage.paintImage(var1, 2070, this.cx, this.cy + 2, 0, 33);
                        } else if (this.r == 4) {
                           SmallImage.paintImage(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 0, 33);
                        } else if (this.r != 2 && this.r != 10) {
                           if (this.r == 1 || this.r == 6) {
                              SmallImage.paintImage(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 0, 33);
                           }
                        } else {
                           SmallImage.paintImage(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 0, 33);
                        }

                        SmallImage.paintImage(var1, this.au(), this.cx + var9 + this.ifa * this.s, this.cy - fe[0][0][2] + var2.a[fe[0][0][0]].c - 12 + var6 + this.ig, 0, 17);
                        SmallImage.paintImage(var1, this.at(), this.cx + this.ih * this.s, this.cy - SmallImage.b(this.as()) - 8 + var6 + this.ii, 0, 33);
                     } else {
                        if (this.r == 3) {
                           SmallImage.paintImage(var1, 2070, this.cx, this.cy + 2, 2, 33);
                        }

                        if (this.r == 4) {
                           SmallImage.paintImage(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 2, 33);
                        } else if (this.r != 2 && this.r != 10) {
                           if (this.r == 1 || this.r == 6) {
                              SmallImage.paintImage(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 2, 33);
                           }
                        } else {
                           SmallImage.paintImage(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 2, 33);
                        }

                        SmallImage.paintImage(var1, this.au(), this.cx + var9 + this.ifa * this.s, this.cy - fe[0][0][2] + var2.a[fe[0][0][0]].c - 12 + var6 + this.ig, 2, 17);
                        SmallImage.paintImage(var1, this.at(), this.cx + this.ih * this.s, this.cy - SmallImage.b(this.as()) - 8 + var6 + this.ii, 2, 33);
                     }
                  } else {
                     if ((var7 = this.aq()) != null) {
                        ++this.gw;
                        if (this.gw >= var7.length) {
                           this.gw = 0;
                        }
                     }

                     if (this.r != 1 && this.r != 6) {
                        if (this.r == 2 || this.r == 10) {
                           var6 = GameCanvas.gameTick % 6 > 3 ? 1 : 0;
                        }
                     } else {
                        var6 = GameCanvas.gameTick % 20 > 12 ? 1 : 0;
                     }

                     if (this.r == 3) {
                        var9 = -5 * this.s;
                     }

                     if (this.s == 1) {
                        if (this.r == 3) {
                           SmallImage.paintImage(var1, 2070, this.cx, this.cy + 2, 0, 33);
                           SmallImage.paintImage(var1, var7[this.gw], this.cx + 13, this.cy - 17, 0, 33);
                           SmallImage.paintImage(var1, var7[this.gw], this.cx - 24, this.cy + 2, 0, 33);
                        } else if (this.r == 4) {
                           SmallImage.paintImage(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 0, 33);
                           SmallImage.paintImage(var1, var7[this.gw], this.cx + 15, this.cy, 0, 33);
                           SmallImage.paintImage(var1, var7[this.gw], this.cx - 27, this.cy, 0, 33);
                        } else if (this.r != 2 && this.r != 10) {
                           if (this.r == 1 || this.r == 6) {
                              SmallImage.paintImage(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 0, 33);
                              SmallImage.paintImage(var1, var7[this.gw], this.cx + 15, this.cy, 0, 33);
                              SmallImage.paintImage(var1, var7[this.gw], this.cx - 27, this.cy, 0, 33);
                           }
                        } else {
                           SmallImage.paintImage(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 0, 33);
                           SmallImage.paintImage(var1, var7[this.gw], this.cx + 15, this.cy, 0, 33);
                           SmallImage.paintImage(var1, var7[this.gw], this.cx - 27, this.cy, 0, 33);
                        }

                        SmallImage.paintImage(var1, this.au(), this.cx + var9 + this.ifa * this.s, this.cy - fe[0][0][2] + var2.a[fe[0][0][0]].c - 12 + var6 + this.ig, 0, 17);
                        SmallImage.paintImage(var1, this.at(), this.cx + this.ih * this.s, this.cy - SmallImage.b(this.as()) - 8 + var6 + this.ii, 0, 33);
                     } else {
                        if (this.r == 3) {
                           SmallImage.paintImage(var1, 2070, this.cx, this.cy + 2, 2, 33);
                           SmallImage.paintImage(var1, var7[this.gw], this.cx - 12, this.cy - 17, 2, 33);
                           SmallImage.paintImage(var1, var7[this.gw], this.cx + 25, this.cy + 3, 2, 33);
                        }

                        if (this.r == 4) {
                           SmallImage.paintImage(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 2, 33);
                           SmallImage.paintImage(var1, var7[this.gw], this.cx - 15, this.cy, 2, 33);
                           SmallImage.paintImage(var1, var7[this.gw], this.cx + 27, this.cy, 2, 33);
                        } else if (this.r != 2 && this.r != 10) {
                           if (this.r == 1 || this.r == 6) {
                              SmallImage.paintImage(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 2, 33);
                              SmallImage.paintImage(var1, var7[this.gw], this.cx - 15, this.cy, 2, 33);
                              SmallImage.paintImage(var1, var7[this.gw], this.cx + 27, this.cy, 2, 33);
                           }
                        } else {
                           SmallImage.paintImage(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 2, 33);
                           SmallImage.paintImage(var1, var7[this.gw], this.cx - 15, this.cy, 2, 33);
                           SmallImage.paintImage(var1, var7[this.gw], this.cx + 27, this.cy, 2, 33);
                        }

                        SmallImage.paintImage(var1, this.au(), this.cx + var9 + this.ifa * this.s, this.cy - fe[0][0][2] + var2.a[fe[0][0][0]].c - 12 + var6 + this.ig, 2, 17);
                        SmallImage.paintImage(var1, this.at(), this.cx + this.ih * this.s, this.cy - SmallImage.b(this.as()) - 8 + var6 + this.ii, 2, 33);
                     }
                  }
               }
            } else if (this.bp) {
               if ((var7 = this.ar()) != null) {
                  ++this.gx;
                  if (this.gx >= var7.length) {
                     this.gx = 0;
                  }
               }

               if (this.r != 1 && this.r != 6) {
                  if (this.r == 2 || this.r == 10) {
                     if (GameCanvas.gameTick % 12 <= 3) {
                        this.ij = 0;
                     } else if (GameCanvas.gameTick % 12 <= 6) {
                        this.ij = 1;
                        var8 = 2;
                     } else if (GameCanvas.gameTick % 12 <= 9) {
                        this.ij = 2;
                        var8 = 4;
                     } else {
                        this.ij = 3;
                        var8 = 2;
                     }
                  }
               } else {
                  this.ij = GameCanvas.gameTick % 20 > 12 ? 1 : 0;
                  var8 = -this.ij;
               }

               var7 = new int[]{2050, 2053, 2049, 2052};
               int[] var13 = new int[]{2075, 2078, 2074, 2079};
               int[] var14 = new int[]{this.cy - 22, this.cy - 23, this.cy - 22, this.cy - 23};
               int[] var15 = new int[]{this.cy - 22, this.cy - 23, this.cy - 22, this.cy - 22};
               if (this.r == 3) {
                  var9 = -5 * this.s;
                  var10 = 5;
               } else {
                  var9 = -3 * this.s;
               }

               mGraphics var10000;
               int var10001;
               if (this.arrItemMounts[4].template.id == 523) {
                  if (this.s == 1) {
                     label711: {
                        SmallImage.paintImage(var1, var5.a[fe[this.bn][3][0]].a, this.cx + fe[this.bn][3][1] + var5.a[fe[this.bn][3][0]].b, this.cy - fe[this.bn][3][2] + var5.a[fe[this.bn][3][0]].c - 10, 0, 0);
                        if (this.r == 3) {
                           var10000 = var1;
                           var10001 = 2051;
                        } else if (this.r == 4) {
                           var10000 = var1;
                           var10001 = 2052;
                        } else {
                           if (this.r != 1 && this.r != 6) {
                              if (this.r == 2 || this.r == 10) {
                                 SmallImage.paintImage(var1, var7[this.ij], this.cx, this.cy - var8, 0, 33);
                              }
                              break label711;
                           }

                           var10000 = var1;
                           var10001 = this.ij == 0 ? 2047 : 2048;
                        }

                        SmallImage.paintImage(var10000, var10001, this.cx, this.cy, 0, 33);
                     }

                     SmallImage.paintImage(var1, this.au(), this.cx + var9 + this.ifa * this.s, this.cy - fe[0][0][2] + var2.a[fe[0][0][0]].c - 12 - var10 - var8 + this.ig, 0, 17);
                     SmallImage.paintImage(var1, this.at(), this.cx + var9 + this.ih * this.s, this.cy - SmallImage.b(this.as()) - 9 - var10 - var8 + this.ii, 0, 33);
                  } else {
                     label724: {
                        SmallImage.paintImage(var1, var5.a[fe[this.bn][3][0]].a, this.cx - fe[this.bn][3][1] - var5.a[fe[this.bn][3][0]].b, this.cy - fe[this.bn][3][2] + var5.a[fe[this.bn][3][0]].c - 10, 2, 24);
                        if (this.r == 3) {
                           var10000 = var1;
                           var10001 = 2051;
                        } else if (this.r == 4) {
                           var10000 = var1;
                           var10001 = 2052;
                        } else {
                           if (this.r != 1 && this.r != 6) {
                              if (this.r == 2 || this.r == 10) {
                                 SmallImage.paintImage(var1, var7[this.ij], this.cx, this.cy - var8, 2, 33);
                              }
                              break label724;
                           }

                           var10000 = var1;
                           var10001 = this.ij == 0 ? 2047 : 2048;
                        }

                        SmallImage.paintImage(var10000, var10001, this.cx, this.cy, 2, 33);
                     }

                     SmallImage.paintImage(var1, this.au(), this.cx + var9 + this.ifa * this.s, this.cy - fe[0][0][2] + var2.a[fe[0][0][0]].c - 12 - var10 - var8 + this.ig, 2, 17);
                     SmallImage.paintImage(var1, this.at(), this.cx + var9 + this.ih * this.s, this.cy - SmallImage.b(this.as()) - 9 - var10 - var8 + this.ii, 2, 33);
                  }
               } else if (this.arrItemMounts[4].template.id == 443) {
                  if (this.arrItemMounts[4].sys >= 3) {
                     if (this.s == 1) {
                        SmallImage.paintImage(var1, var5.a[fe[this.bn][3][0]].a, this.cx + fe[this.bn][3][1] + var5.a[fe[this.bn][3][0]].b, this.cy - fe[this.bn][3][2] + var5.a[fe[this.bn][3][0]].c - 10, 0, 0);
                        if (this.r == 3) {
                           SmallImage.paintImage(var1, 2077, this.cx, this.cy, 0, 33);
                           var1.drawRegion(GameScr.du, 0, this.b * 3, 3, 3, 0, this.cx + 21, this.cy - 30, 0);
                        } else {
                           label736: {
                              if (this.r == 4) {
                                 var10000 = var1;
                                 var10001 = 2076;
                              } else {
                                 if (this.r != 1 && this.r != 6) {
                                    if (this.r == 2 || this.r == 10) {
                                       SmallImage.paintImage(var1, var13[this.ij], this.cx, this.cy - var8, 0, 33);
                                       var1.drawRegion(GameScr.du, 0, this.b * 3, 3, 3, 0, this.cx + 21, var14[this.ij], 0);
                                    }
                                    break label736;
                                 }

                                 var10000 = var1;
                                 var10001 = this.ij == 0 ? 2073 : 2072;
                              }

                              SmallImage.paintImage(var10000, var10001, this.cx, this.cy, 0, 33);
                              var1.drawRegion(GameScr.du, 0, this.b * 3, 3, 3, 0, this.cx + 21, this.cy - 19, 0);
                           }
                        }

                        SmallImage.paintImage(var1, this.au(), this.cx + var9 + this.ifa * this.s, this.cy - fe[0][0][2] + var2.a[fe[0][0][0]].c - 12 - var10 - var8 + this.ig, 0, 17);
                        SmallImage.paintImage(var1, this.at(), this.cx + var9 + this.ih * this.s, this.cy - SmallImage.b(this.as()) - 9 - var10 - var8 + this.ii, 0, 33);
                     } else {
                        SmallImage.paintImage(var1, var5.a[fe[this.bn][3][0]].a, this.cx - fe[this.bn][3][1] - var5.a[fe[this.bn][3][0]].b, this.cy - fe[this.bn][3][2] + var5.a[fe[this.bn][3][0]].c - 10, 2, 24);
                        if (this.r == 3) {
                           SmallImage.paintImage(var1, 2077, this.cx, this.cy, 2, 33);
                           var1.drawRegion(GameScr.du, 0, this.b * 3, 3, 3, 0, this.cx - 23, this.cy - 30, 0);
                        } else {
                           label749: {
                              if (this.r == 4) {
                                 var10000 = var1;
                                 var10001 = 2076;
                              } else {
                                 if (this.r != 1 && this.r != 6) {
                                    if (this.r == 2 || this.r == 10) {
                                       SmallImage.paintImage(var1, var13[this.ij], this.cx, this.cy - var8, 2, 33);
                                       var1.drawRegion(GameScr.du, 0, this.b * 3, 3, 3, 0, this.cx - 24, var15[this.ij], 0);
                                    }
                                    break label749;
                                 }

                                 var10000 = var1;
                                 var10001 = this.ij == 0 ? 2073 : 2072;
                              }

                              SmallImage.paintImage(var10000, var10001, this.cx, this.cy, 2, 33);
                              var1.drawRegion(GameScr.du, 0, this.b * 3, 3, 3, 0, this.cx - 24, this.cy - 20, 0);
                           }
                        }

                        SmallImage.paintImage(var1, this.au(), this.cx + var9 + this.ifa * this.s, this.cy - fe[0][0][2] + var2.a[fe[0][0][0]].c - 12 - var10 - var8 + this.ig, 2, 17);
                        SmallImage.paintImage(var1, this.at(), this.cx + var9 + this.ih * this.s, this.cy - SmallImage.b(this.as()) - 9 - var10 - var8 + this.ii, 2, 33);
                     }
                  } else if (this.s == 1) {
                     label765: {
                        SmallImage.paintImage(var1, var5.a[fe[this.bn][3][0]].a, this.cx + fe[this.bn][3][1] + var5.a[fe[this.bn][3][0]].b, this.cy - fe[this.bn][3][2] + var5.a[fe[this.bn][3][0]].c - 10, 0, 0);
                        if (this.r == 3) {
                           var10000 = var1;
                           var10001 = 1716;
                        } else if (this.r == 4) {
                           var10000 = var1;
                           var10001 = 1717;
                        } else {
                           if (this.r != 1 && this.r != 6) {
                              if (this.r == 2 || this.r == 10) {
                                 SmallImage.paintImage(var1, this.ik[this.ij], this.cx, this.cy - var8, 0, 33);
                              }
                              break label765;
                           }

                           var10000 = var1;
                           var10001 = this.ij == 0 ? 1712 : 1713;
                        }

                        SmallImage.paintImage(var10000, var10001, this.cx, this.cy, 0, 33);
                     }

                     SmallImage.paintImage(var1, this.au(), this.cx + var9 + this.ifa * this.s, this.cy - fe[0][0][2] + var2.a[fe[0][0][0]].c - 12 - var10 - var8 + this.ig, 0, 17);
                     SmallImage.paintImage(var1, this.at(), this.cx + var9 + this.ih * this.s, this.cy - SmallImage.b(this.as()) - 9 - var10 - var8 + this.ii, 0, 33);
                  } else {
                     label779: {
                        SmallImage.paintImage(var1, var5.a[fe[this.bn][3][0]].a, this.cx - fe[this.bn][3][1] - var5.a[fe[this.bn][3][0]].b, this.cy - fe[this.bn][3][2] + var5.a[fe[this.bn][3][0]].c - 10, 2, 24);
                        if (this.r == 3) {
                           var10000 = var1;
                           var10001 = 1716;
                        } else if (this.r == 4) {
                           var10000 = var1;
                           var10001 = 1717;
                        } else {
                           if (this.r != 1 && this.r != 6) {
                              if (this.r == 2 || this.r == 10) {
                                 SmallImage.paintImage(var1, this.ik[this.ij], this.cx, this.cy - var8, 2, 33);
                              }
                              break label779;
                           }

                           var10000 = var1;
                           var10001 = this.ij == 0 ? 1712 : 1713;
                        }

                        SmallImage.paintImage(var10000, var10001, this.cx, this.cy, 2, 33);
                     }

                     SmallImage.paintImage(var1, this.au(), this.cx + var9 + this.ifa * this.s, this.cy - fe[0][0][2] + var2.a[fe[0][0][0]].c - 12 - var10 - var8 + this.ig, 2, 17);
                     SmallImage.paintImage(var1, this.at(), this.cx + var9 + this.ih * this.s, this.cy - SmallImage.b(this.as()) - 9 - var10 - var8 + this.ii, 2, 33);
                  }
               }
            } else if (this.s == 1) {
               if (this.bq && !this.bo && !this.bp) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     if (this.arrItemMounts[4].sys <= 1) {
                        SmallImage.paintImage(var1, 1800, this.gk, this.gl, 2, 33);
                     } else {
                        SmallImage.paintImage(var1, 2063, this.gk, this.gl, 2, 33);
                     }
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     if (this.arrItemMounts[4].sys <= 1) {
                        SmallImage.paintImage(var1, 2067, this.gk, this.gl, 2, 33);
                     } else {
                        SmallImage.paintImage(var1, 2071, this.gk, this.gl, 2, 33);
                     }
                  }
               }

               if (var7 != null) {
                  if (this.de == 0) {
                     SmallImage.paintImage(var1, var7[this.de], this.cx - 14, this.cy - 18, 0, 20);
                  } else if (this.de != 1 && this.de == 2) {
                     SmallImage.paintImage(var1, var7[this.de], this.cx - 25, this.cy - 18, 0, 20);
                  } else {
                     SmallImage.paintImage(var1, var7[this.de], this.cx - 22, this.cy - 18, 0, 20);
                  }
               }

               SmallImage.paintImage(var1, var5.a[fe[this.bn][3][0]].a, this.cx + fe[this.bn][3][1] + var5.a[fe[this.bn][3][0]].b, this.cy - fe[this.bn][3][2] + var5.a[fe[this.bn][3][0]].c, 0, 0);
               SmallImage.paintImage(var1, var3.a[fe[this.bn][1][0]].a, this.cx + fe[this.bn][1][1] + var3.a[fe[this.bn][1][0]].b, this.cy - fe[this.bn][1][2] + var3.a[fe[this.bn][1][0]].c, 0, 0);
               if (this.r != 2) {
                  this.b(var1, this.cx + 7, this.cy - 2);
               }

               SmallImage.paintImage(var1, var2.a[fe[this.bn][0][0]].a, this.cx + fe[this.bn][0][1] + var2.a[fe[this.bn][0][0]].b, this.cy - fe[this.bn][0][2] + var2.a[fe[this.bn][0][0]].c, 0, 0);
               SmallImage.paintImage(var1, var4.a[fe[this.bn][2][0]].a, this.cx + fe[this.bn][2][1] + var4.a[fe[this.bn][2][0]].b, this.cy - fe[this.bn][2][2] + var4.a[fe[this.bn][2][0]].c, 0, 0);
               if (this.r == 2) {
                  this.d(var1, this.cx - 14, this.cy - 2);
                  this.c(var1, this.cx + 7, this.cy - 1);
               } else {
                  this.b(var1, this.cx - 7, this.cy - 2);
                  this.c(var1, this.cx + 11, this.cy - 2);
               }
            } else {
               if (this.bq && !this.bo && !this.bp) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     if (this.arrItemMounts[4].sys <= 0) {
                        SmallImage.paintImage(var1, 1800, this.gk, this.gl, 2, 33);
                     } else {
                        SmallImage.paintImage(var1, 2063, this.gk, this.gl, 2, 33);
                     }
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     if (this.arrItemMounts[4].sys <= 0) {
                        SmallImage.paintImage(var1, 2067, this.gk, this.gl, 2, 33);
                     } else {
                        SmallImage.paintImage(var1, 2071, this.gk, this.gl, 2, 33);
                     }
                  }
               }

               if (var7 != null) {
                  SmallImage.paintImage(var1, var7[this.de], this.cx - 7, this.cy - 18, 2, 20);
               }

               SmallImage.paintImage(var1, var5.a[fe[this.bn][3][0]].a, this.cx - fe[this.bn][3][1] - var5.a[fe[this.bn][3][0]].b, this.cy - fe[this.bn][3][2] + var5.a[fe[this.bn][3][0]].c, 2, 24);
               SmallImage.paintImage(var1, var3.a[fe[this.bn][1][0]].a, this.cx - fe[this.bn][1][1] - var3.a[fe[this.bn][1][0]].b, this.cy - fe[this.bn][1][2] + var3.a[fe[this.bn][1][0]].c, 2, 24);
               if (this.r != 2) {
                  this.b(var1, this.cx - 7, this.cy - 2);
               }

               SmallImage.paintImage(var1, var2.a[fe[this.bn][0][0]].a, this.cx - fe[this.bn][0][1] - var2.a[fe[this.bn][0][0]].b, this.cy - fe[this.bn][0][2] + var2.a[fe[this.bn][0][0]].c, 2, 24);
               SmallImage.paintImage(var1, var4.a[fe[this.bn][2][0]].a, this.cx - fe[this.bn][2][1] - var4.a[fe[this.bn][2][0]].b, this.cy - fe[this.bn][2][2] + var4.a[fe[this.bn][2][0]].c, 2, 24);
               if (this.r == 2) {
                  this.d(var1, this.cx + 14, this.cy - 2);
                  this.c(var1, this.cx - 3, this.cy - 2);
               } else {
                  this.b(var1, this.cx + 5, this.cy - 2);
                  this.c(var1, this.cx - 7, this.cy - 2);
               }
            }
         }

         if (this.fn) {
            SmallImage.paintImage(var1, 290, this.cx, this.cy, 0, 33);
            return;
         }
      } catch (Exception var12) {
      }

   }

   private int as() {
      switch (this.leg) {
         case 0:
            return 26;
         case 4:
            return 58;
         case 6:
            return 86;
         case 8:
            return 114;
         case 9:
            return 123;
         case 17:
            return 353;
         case 19:
            return 379;
         case 21:
            return 405;
         case 30:
            return 484;
         case 33:
            return 518;
         case 35:
            return 544;
         case 37:
            return 571;
         case 39:
            return 810;
         case 43:
            return 982;
         case 95:
            return 1156;
         case 142:
            return 1360;
         case 155:
            return 1494;
         case 157:
            return 1519;
         default:
            return 26;
      }
   }

   private int at() {
      this.ih = 0;
      this.ii = 0;
      if (this.r == 3) {
         switch (this.body) {
            case 1:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 3;
                  this.ii = -3;
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 3;
                  this.ii = -3;
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -6;
               }

               return 13;
            case 3:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -6;
               }

               return 45;
            case 5:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -9;
                  this.ii = -7;
               }

               return 73;
            case 7:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -9;
                  this.ii = -7;
               }

               return 101;
            case 10:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -9;
                  this.ii = -7;
               }

               return 137;
            case 18:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -9;
                  this.ii = -7;
               }

               return 365;
            case 20:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -9;
                  this.ii = -7;
               }

               return 391;
            case 22:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -9;
                  this.ii = -7;
               }

               return 417;
            case 29:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 1;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 1;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -11;
                  this.ii = -6;
               }

               return 472;
            case 32:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 1;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 1;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -11;
                  this.ii = -6;
               }

               return 506;
            case 34:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -7;
               }

               return 531;
            case 36:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -7;
               }

               return 559;
            case 38:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -7;
               }

               return 798;
            case 42:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -7;
               }

               return 970;
            case 94:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -12;
                  this.ii = -7;
               }

               return 1142;
            case 141:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 3;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 3;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -9;
                  this.ii = -7;
               }

               return 1348;
            case 154:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = -3;
                  this.ii = 0;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = -3;
                  this.ii = 0;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -8;
                  this.ii = 0;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -15;
                  this.ii = -3;
               }

               return 1487;
            case 156:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 1;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 1;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -10;
                  this.ii = -7;
               }

               return 1507;
            case 157:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -7;
               }

               return 1812;
            case 173:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -7;
               }

               return 1838;
            case 180:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -7;
               }

               return 1959;
            case 183:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -7;
               }

               return 1987;
            case 186:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = -3;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = -3;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -6;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -14;
                  this.ii = -5;
               }

               return 2117;
            case 189:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = -3;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = -3;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -6;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -14;
                  this.ii = -5;
               }

               return 2144;
            case 197:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -5;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -10;
                  this.ii = -6;
               }

               return 2342;
            case 199:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -5;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -10;
                  this.ii = -6;
               }

               return 2373;
            case 206:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -5;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -10;
                  this.ii = -6;
               }

               return 2459;
            default:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = 0;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -7;
                  this.ii = -6;
               }

               return 13;
         }
      } else if (!this.gt) {
         switch (this.body) {
            case 1:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 2;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 2;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = 0;
                  this.ii = 0;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -5;
                  this.ii = -2;
               }

               return 9;
            case 3:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = 0;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -5;
                  this.ii = -3;
               }

               return 41;
            case 5:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -6;
                  this.ii = -2;
               }

               return 70;
            case 7:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -6;
                  this.ii = -2;
               }

               return 97;
            case 10:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -6;
                  this.ii = -2;
               }

               return 133;
            case 18:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -6;
                  this.ii = -2;
               }

               return 369;
            case 20:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -6;
                  this.ii = -2;
               }

               return 395;
            case 22:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -6;
                  this.ii = -2;
               }

               return 421;
            case 29:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = 0;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -6;
                  this.ii = -2;
               }

               return 468;
            case 32:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = 0;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -6;
                  this.ii = -2;
               }

               return 502;
            case 34:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = 0;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -5;
                  this.ii = -2;
               }

               return 540;
            case 36:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = 0;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -5;
                  this.ii = -2;
               }

               return 555;
            case 38:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = 0;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -5;
                  this.ii = -2;
               }

               return 794;
            case 42:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = 0;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -5;
                  this.ii = -2;
               }

               return 966;
            case 94:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = 0;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -5;
                  this.ii = -2;
               }

               return 1139;
            case 141:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = -2;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = -2;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -3;
                  this.ii = 0;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -7;
                  this.ii = -1;
               }

               return 1343;
            case 154:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = 0;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = 0;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = 0;
                  this.ii = 1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -3;
                  this.ii = -1;
               }

               return 1479;
            case 156:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 3;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 3;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = 0;
                  this.ii = 2;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -3;
                  this.ii = 0;
               }

               return 1502;
            case 157:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -6;
                  this.ii = -2;
               }

               return 1808;
            case 173:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -6;
                  this.ii = -2;
               }

               return 1834;
            case 180:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -6;
                  this.ii = -2;
               }

               return 1955;
            case 183:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -6;
                  this.ii = -2;
               }

               return 1983;
            case 186:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -2;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -2;
               }

               return 2135;
            case 189:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -2;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -2;
               }

               return 2135;
            case 197:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = -3;
                  this.ii = 0;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = -3;
                  this.ii = 0;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -4;
                  this.ii = 0;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -5;
                  this.ii = -1;
               }

               return 2337;
            case 199:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = -3;
                  this.ii = 0;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = -3;
                  this.ii = 0;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -4;
                  this.ii = 0;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -5;
                  this.ii = -1;
               }

               return 2363;
            case 206:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = -3;
                  this.ii = 0;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = -3;
                  this.ii = 0;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -4;
                  this.ii = 0;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -9;
                  this.ii = -1;
               }

               return 2456;
            default:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 2;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 2;
                  this.ii = -1;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = 0;
                  this.ii = 0;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -5;
                  this.ii = -2;
               }

               return 9;
         }
      } else {
         switch (this.body) {
            case 1:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 3;
                  this.ii = -3;
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 3;
                  this.ii = -3;
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -6;
               }

               return 13;
            case 3:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -6;
               }

               return 45;
            case 5:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -9;
                  this.ii = -7;
               }

               return 73;
            case 7:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -9;
                  this.ii = -7;
               }

               return 101;
            case 10:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -9;
                  this.ii = -7;
               }

               return 137;
            case 18:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -9;
                  this.ii = -7;
               }

               return 365;
            case 20:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -9;
                  this.ii = -7;
               }

               return 391;
            case 22:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -9;
                  this.ii = -7;
               }

               return 417;
            case 29:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 1;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 1;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -11;
                  this.ii = -6;
               }

               return 472;
            case 32:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 1;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 1;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -11;
                  this.ii = -6;
               }

               return 506;
            case 34:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -7;
               }

               return 531;
            case 36:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -7;
               }

               return 559;
            case 38:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -7;
               }

               return 798;
            case 42:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -7;
               }

               return 970;
            case 94:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 0;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 0;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -12;
                  this.ii = -7;
               }

               return 1142;
            case 141:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 3;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 3;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -9;
                  this.ii = -7;
               }

               return 1348;
            case 154:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = -3;
                  this.ii = 0;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = -3;
                  this.ii = 0;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -8;
                  this.ii = 0;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -15;
                  this.ii = -3;
               }

               return 1487;
            case 156:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 1;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 1;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -4;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -10;
                  this.ii = -7;
               }

               return 1507;
            case 157:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -7;
               }

               return 1812;
            case 173:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -7;
               }

               return 1838;
            case 180:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -7;
               }

               return 1959;
            case 183:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 4;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -8;
                  this.ii = -7;
               }

               return 1987;
            case 186:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = -3;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = -3;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -6;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -14;
                  this.ii = -5;
               }

               return 2117;
            case 189:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = -3;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = -3;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -6;
                  this.ii = -2;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -14;
                  this.ii = -5;
               }

               return 2144;
            case 197:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -5;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -10;
                  this.ii = -6;
               }

               return 2342;
            case 199:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -5;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -10;
                  this.ii = -6;
               }

               return 2373;
            case 206:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = -1;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = -5;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -10;
                  this.ii = -6;
               }

               return 2459;
            default:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.ih = 3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.ih = 3;
                  this.ii = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.ih = 0;
                  this.ii = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.ih = -7;
                  this.ii = -6;
               }

               return 13;
         }
      }
   }

   private int au() {
      this.ifa = this.ig = 0;
      if (this.r == 3) {
         switch (this.head) {
            case 2:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 33;
            case 11:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 147;
            case 23:
               this.ifa = 1;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 427;
            case 24:
               this.ifa = 1;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 430;
            case 25:
               this.ifa = 3;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 433;
            case 26:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 436;
            case 27:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 439;
            case 28:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 442;
            case 112:
               this.ifa = 1;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 148;
            case 113:
               this.ifa = -1;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 443;
            case 124:
               this.ifa = 1;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1235;
            case 125:
               this.ifa = -1;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1237;
            case 126:
               this.ifa = -1;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1255;
            case 127:
               this.ifa = -1;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1257;
            case 137:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1309;
            case 138:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1311;
            case 139:
               this.ifa = 2;
               this.ig = -5;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1315;
            case 140:
               this.ifa = 3;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1313;
            case 146:
               this.ifa = 1;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1416;
            case 147:
               this.ifa = -2;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1418;
            case 148:
               this.ifa = 0;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1422;
            case 149:
               this.ifa = -2;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1424;
            case 150:
               this.ifa = 0;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1441;
            case 151:
               this.ifa = -2;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1439;
            case 152:
               this.ifa = 1;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1447;
            case 153:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1445;
            case 158:
               this.ifa = -2;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1585;
            case 159:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1589;
            case 160:
               this.ifa = 2;
               this.ig = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1587;
            case 161:
               this.ifa = 3;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1595;
            case 162:
               this.ifa = -5;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1597;
            case 163:
               this.ifa = -3;
               this.ig = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1604;
            case 179:
               this.ifa = 3;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1978;
            case 182:
               this.ifa = 3;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 2006;
            case 185:
               this.ifa = -4;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 2129;
            case 188:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 2156;
            case 205:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 2451;
            case 210:
               this.ifa = 0;
               this.ig = -5;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 2519;
            case 211:
               this.ifa = -1;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 2521;
            case 212:
               this.ifa = -2;
               this.ig = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 2523;
            case 213:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 2525;
            case 214:
               this.ifa = 1;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 2526;
            default:
               this.ifa = 2;
               this.ig = -5;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 33;
         }
      } else if (!this.gt) {
         switch (this.head) {
            case 2:
               this.ifa = -1;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 33;
            case 11:
               this.ifa = -2;
               this.ig = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 147;
            case 23:
               this.ifa = -1;
               this.ig = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 427;
            case 24:
               this.ifa = -1;
               this.ig = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 430;
            case 25:
               this.ifa = 1;
               this.ig = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 433;
            case 26:
               this.ifa = -2;
               this.ig = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 436;
            case 27:
               this.ifa = -2;
               this.ig = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 439;
            case 28:
               this.ifa = -2;
               this.ig = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 442;
            case 112:
               this.ifa = -1;
               this.ig = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 148;
            case 113:
               this.ifa = -3;
               this.ig = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 443;
            case 124:
               this.ifa = -1;
               this.ig = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1235;
            case 125:
               this.ifa = -1;
               this.ig = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1237;
            case 126:
               this.ifa = -1;
               this.ig = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1255;
            case 127:
               this.ifa = -3;
               this.ig = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1257;
            case 137:
               this.ifa = -2;
               this.ig = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1309;
            case 138:
               this.ifa = -2;
               this.ig = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1311;
            case 139:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1315;
            case 140:
               this.ifa = 1;
               this.ig = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1313;
            case 146:
               this.ifa = -1;
               this.ig = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1416;
            case 147:
               this.ifa = -4;
               this.ig = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1418;
            case 148:
               this.ifa = -2;
               this.ig = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1422;
            case 149:
               this.ifa = -4;
               this.ig = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1424;
            case 150:
               this.ifa = -2;
               this.ig = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1441;
            case 151:
               this.ifa = -4;
               this.ig = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1439;
            case 152:
               this.ifa = -1;
               this.ig = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1447;
            case 153:
               this.ifa = -2;
               this.ig = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1445;
            case 158:
               this.ifa = -4;
               this.ig = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1585;
            case 159:
               this.ifa = -2;
               this.ig = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1589;
            case 160:
               this.ifa = 0;
               this.ig = 0;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1587;
            case 161:
               this.ifa = 1;
               this.ig = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1595;
            case 162:
               this.ifa = -7;
               this.ig = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1597;
            case 163:
               this.ifa = -5;
               this.ig = 0;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1604;
            case 179:
               this.ifa = 1;
               this.ig = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 1978;
            case 182:
               this.ifa = 1;
               this.ig = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 2006;
            case 185:
               this.ifa = -6;
               this.ig = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 2129;
            case 188:
               this.ifa = -2;
               this.ig = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 2156;
            case 205:
               this.ifa = -2;
               this.ig = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 2451;
            case 210:
               this.ifa = -2;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 2519;
            case 211:
               this.ifa = -3;
               this.ig = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 2521;
            case 212:
               this.ifa = -4;
               this.ig = 0;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 2523;
            case 213:
               this.ifa = 0;
               this.ig = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 2525;
            case 214:
               this.ifa = -1;
               this.ig = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 2526;
            default:
               this.ifa = -1;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 5;
                     --this.ig;
                  }
               }

               return 33;
         }
      } else {
         switch (this.head) {
            case 2:
               this.ifa = 2;
               this.ig = -5;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 33;
            case 11:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 147;
            case 23:
               this.ifa = 1;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 427;
            case 24:
               this.ifa = 1;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 430;
            case 25:
               this.ifa = 3;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 433;
            case 26:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 436;
            case 27:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 439;
            case 28:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 442;
            case 112:
               this.ifa = 1;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 148;
            case 113:
               this.ifa = -1;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 443;
            case 124:
               this.ifa = 1;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1235;
            case 125:
               this.ifa = -1;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1237;
            case 126:
               this.ifa = -1;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1255;
            case 127:
               this.ifa = -1;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1257;
            case 137:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1309;
            case 138:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1311;
            case 139:
               this.ifa = 2;
               this.ig = -5;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1315;
            case 140:
               this.ifa = 3;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1313;
            case 146:
               this.ifa = 1;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1416;
            case 147:
               this.ifa = -2;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1418;
            case 148:
               this.ifa = 0;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1422;
            case 149:
               this.ifa = -2;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1424;
            case 150:
               this.ifa = 0;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1441;
            case 151:
               this.ifa = -2;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1439;
            case 152:
               this.ifa = 1;
               this.ig = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1447;
            case 153:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1445;
            case 158:
               this.ifa = -2;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1585;
            case 159:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1589;
            case 160:
               this.ifa = 2;
               this.ig = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1587;
            case 161:
               this.ifa = 3;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1595;
            case 162:
               this.ifa = -5;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1597;
            case 163:
               this.ifa = -3;
               this.ig = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1604;
            case 179:
               this.ifa = 3;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 1978;
            case 182:
               this.ifa = 3;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 2006;
            case 185:
               this.ifa = -4;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 2129;
            case 188:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 2156;
            case 205:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 2451;
            case 210:
               this.ifa = 0;
               this.ig = -5;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 2519;
            case 211:
               this.ifa = -1;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 2521;
            case 212:
               this.ifa = -2;
               this.ig = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 2523;
            case 213:
               this.ifa = 0;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 2525;
            case 214:
               this.ifa = 1;
               this.ig = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 2526;
            default:
               this.ifa = 2;
               this.ig = -5;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.ifa -= 2;
                     ++this.ig;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.ifa -= 7;
                     --this.ig;
                  }
               }

               return 33;
         }
      }
   }

   private int[] av() {
      if (this.r != 6 && this.r != 1 && this.r != 2 && this.r != 10 && this.r != 11) {
         return null;
      } else {
         int[] var1 = null;
         if (this.bl) {
            if (this.arrItemBody[13] != null) {
               if (this.arrItemBody[13].template.id == 425) {
                  var1 = new int[]{1687, 1688, 1689, 1690, 1691};
               } else if (this.arrItemBody[13].template.id == 426) {
                  var1 = new int[]{1682, 1683, 1684, 1685, 1686};
               } else if (this.arrItemBody[13].template.id == 427) {
                  var1 = new int[]{1677, 1678, 1679, 1680, 1681};
               }
            }
         } else {
            if (this.fy == -1) {
               return null;
            }

            if (this.fy == 425) {
               var1 = new int[]{1687, 1688, 1689, 1690, 1691};
            } else if (this.fy == 426) {
               var1 = new int[]{1682, 1683, 1684, 1685, 1686};
            } else if (this.fy == 427) {
               var1 = new int[]{1677, 1678, 1679, 1680, 1681};
            }
         }

         return var1;
      }
   }

   public final void b(mGraphics var1, int var2, int var3) {
      int[] var4;
      if ((var4 = this.av()) != null) {
         int var5;
         if ((var5 = GameCanvas.gameTick % 13) > 9) {
            SmallImage.paintImage(var1, var4[0], var2, var3, 0, 33);
            return;
         }

         if (var5 > 6) {
            SmallImage.paintImage(var1, var4[1], var2, var3 + 2, 0, 33);
            return;
         }

         if (var5 > 3) {
            SmallImage.paintImage(var1, var4[2], var2 - 2, var3 + 1, 0, 33);
            return;
         }

         SmallImage.paintImage(var1, var4[3], var2 - 2, var3, 0, 33);
      }

   }

   private void d(mGraphics var1, int var2, int var3) {
      int[] var4;
      if ((var4 = this.av()) != null) {
         int var5 = this.s == 1 ? 6 : 5;
         int var6 = this.s == -1 ? 40 : 36;
         int var7;
         if ((var7 = GameCanvas.gameTick % 13) > 9) {
            SmallImage.paintImage(var1, var4[0], var2, var3, var5, var6);
            return;
         }

         if (var7 > 6) {
            SmallImage.paintImage(var1, var4[1], var2, var3, var5, var6);
            return;
         }

         if (var7 > 3) {
            SmallImage.paintImage(var1, var4[2], var2, var3, var5, var6);
            return;
         }

         SmallImage.paintImage(var1, var4[3], var2, var3, var5, var6);
      }

   }

   public final void c(mGraphics var1, int var2, int var3) {
      int[] var4;
      if ((var4 = this.av()) != null) {
         SmallImage.paintImage(var1, var4[4], var2 - 2, var3, 0, 33);
      }

   }

   private void n(int var1) {
      this.ho = 0;
      this.hp = GameScr.efs[var1];
   }

   public final void c(int var1) {
      this.fz = 0;
      this.ga = GameScr.efs[var1];
   }

   public static int d(int var0) {
      for(int var1 = 0; var1 < GameScr.vCharInMap.size(); ++var1) {
         if (((Char)GameScr.vCharInMap.elementAt(var1)).charID == var0) {
            return var1;
         }
      }

      return -1;
   }

   public final void a(int var1, int var2) {
      byte var3 = 0;
      var1 -= this.cx;
      var2 -= this.cy;
      if (var1 == 0 && var2 == 0) {
         var3 = 1;
      } else if (var2 == 0) {
         var3 = 2;
         if (this.fj.size() > 0) {
            Class_cy var4 = null;

            try {
               var4 = (Class_cy)this.fj.lastElement();
            } catch (Exception var5) {
            }

            if (var4 != null && TileMap.a(var4.a, var4.b, 64) && var4.b % TileMap.size > 8) {
               var3 = 10;
            }
         }

         if (var1 < 0) {
         }
      } else if (var2 != 0) {
         if (var2 < 0) {
            var3 = 3;
         }

         if (var2 > 0) {
            var3 = 4;
         }
      }

      int var6 = this.cx + var1;
      var1 = this.cy + var2;
      this.fj.addElement(new Class_cy(var6, var1, var3));
      this.r = 6;
   }

   private void aw() {
      if (this.charFocus != null && this.charFocus.isNhanban) {
         this.charFocus = null;
      }

      if (ge && this.charFocus != null && (this.charFocus.r == 15 || this.charFocus.df)) {
         this.charFocus = null;
      }

      if (GameCanvas.gameTick % 2 != 0 && !b(this.charFocus)) {
         int var1 = 0;
         if (this.nClass.classId == 0 || this.nClass.classId == 1 || this.nClass.classId == 3 || this.nClass.classId == 5 || this.nClass.classId == 7) {
            if (GameScr.es != 1) {
               var1 = 40;
            } else {
               var1 = 0;
            }
         }

         int[] var2 = new int[]{-1, -1, -1, -1};
         int var3 = GameScr.i - 10;
         int var4 = GameScr.i + GameCanvas.width + 10;
         int var5 = GameScr.j;
         int var6 = GameScr.j + GameCanvas.height - GameScr.g + 10;
         if (ge) {
            if (this.mobFocus != null && this.mobFocus.h != 1 && this.mobFocus.h != 8 && this.mobFocus.h != 0 && var3 <= this.mobFocus.e && this.mobFocus.e <= var4 && var5 <= this.mobFocus.f && this.mobFocus.f <= var6 || this.npcFocus != null && var3 <= this.npcFocus.cx && this.npcFocus.cx <= var4 && var5 <= this.npcFocus.cy && this.npcFocus.cy <= var6 || this.charFocus != null && var3 <= this.charFocus.cx && this.charFocus.cx <= var4 && var5 <= this.charFocus.cy && this.charFocus.cy <= var6 || this.itemFocus != null && var3 <= this.itemFocus.a && this.itemFocus.a <= var4 && var5 <= this.itemFocus.b && this.itemFocus.b <= var6) {
               return;
            }

            ge = false;
         }

         int var7;
         ItemMap var8;
         int var9;
         int var10;
         int var11;
         if (this.itemFocus == null) {
            for(var7 = 0; var7 < GameScr.af.size(); ++var7) {
               var8 = (ItemMap)GameScr.af.elementAt(var7);
               var9 = Math.abs(getMyChar().cx - var8.a);
               var10 = Math.abs(getMyChar().cy - var8.b);
               var11 = var9 > var10 ? var9 : var10;
               if (var9 <= 48 && var10 <= 48 && (this.itemFocus == null || var11 < var2[3])) {
                  if (GameScr.es != 0 && GameScr.g()) {
                     if (var8.h.type == 19) {
                        if (GameScr.eo) {
                           this.itemFocus = null;
                        } else {
                           this.itemFocus = var8;
                        }

                        var2[3] = var11;
                     }
                  } else if (!dn && !doa && !dp && !tickNhatTrangBi && !tickNhatVPNhiemVu && !tickKhongNhat) {
                     if (GameScr.eo) {
                        this.itemFocus = null;
                     } else {
                        this.itemFocus = var8;
                     }

                     var2[3] = var11;
                  } else if (dn && var8.h.type == 19 || doa && (var8.h.type == 16 || var8.h.type == 17) || dp && var8.h.type == 26 || tickNhatTrangBi && var8.h.isTypeBody() || tickNhatVPNhiemVu && var8.h.isTypeTask()) {
                     if (GameScr.eo) {
                        this.itemFocus = null;
                     } else {
                        this.itemFocus = var8;
                     }

                     var2[3] = var11;
                  }
               }
            }
         } else {
            if (var3 <= this.itemFocus.a && this.itemFocus.a <= var4 && var5 <= this.itemFocus.b && this.itemFocus.b <= var6) {
               this.o(3);
               return;
            }

            this.itemFocus = null;

            for(var7 = 0; var7 < GameScr.af.size(); ++var7) {
               var8 = (ItemMap)GameScr.af.elementAt(var7);
               var9 = Math.abs(getMyChar().cx - var8.a);
               var10 = Math.abs(getMyChar().cy - var8.b);
               var11 = var9 > var10 ? var9 : var10;
               if (var3 <= var8.a && var8.a <= var4 && var5 <= var8.b && var8.b <= var6 && (this.itemFocus == null || var11 < var2[3])) {
                  GameScr.getInstance();
                  if (GameScr.es != 0) {
                     GameScr.getInstance();
                     if (GameScr.g()) {
                        if (var8.h.type == 19) {
                           if (GameScr.eo) {
                              this.itemFocus = null;
                           } else {
                              this.itemFocus = var8;
                           }

                           var2[3] = var11;
                        }
                        continue;
                     }
                  }

                  if (!dn && !doa && !dp && !tickNhatTrangBi && !tickNhatVPNhiemVu && !tickKhongNhat) {
                     if (GameScr.eo) {
                        this.itemFocus = null;
                     } else {
                        this.itemFocus = var8;
                     }

                     var2[3] = var11;
                  } else if (dn && var8.h.type == 19 || doa && (var8.h.type == 16 || var8.h.type == 17) || dp && var8.h.type == 26 || tickNhatTrangBi && var8.h.isTypeBody() || tickNhatVPNhiemVu && var8.h.isTypeTask()) {
                     if (GameScr.eo) {
                        this.itemFocus = null;
                     } else {
                        this.itemFocus = var8;
                     }

                     var2[3] = var11;
                  }
               }
            }
         }

         Mob var12;
         Npc var13;
         Char var14;
         if (TileMap.typeMap != 3 && TileMap.mapID != 111) {
            var3 = getMyChar().cx - getMyChar().d() - 10;
            var4 = getMyChar().cx + getMyChar().d() + 10;
            var5 = getMyChar().cy - getMyChar().e() - var1;
            if ((var6 = getMyChar().cy + getMyChar().e()) > getMyChar().cy + 30) {
               var6 = getMyChar().cy + 30;
            }

            if (this.mobFocus == null) {
               for(var7 = 0; var7 < GameScr.vMobAttack.size(); ++var7) {
                  var12 = (Mob)GameScr.vMobAttack.elementAt(var7);
                  var9 = Math.abs(getMyChar().cx - var12.e);
                  var10 = Math.abs(getMyChar().cy - var12.f);
                  var11 = var9 > var10 ? var9 : var10;
                  if ((var12.s != 97 || getMyChar().cm != 4) && (var12.s != 96 || getMyChar().cm != 5) && (var12.s != 98 || getMyChar().cm != 4) && (var12.s != 167 || getMyChar().cm != 4) && (var12.s != 99 || getMyChar().cm != 5) && (var12.s != 166 || getMyChar().cm != 5) && (var12.s != 202 || var12.h != 8 || var12.c()) && (!GameScr.eo || var12.w != 3) && var12.s != 202 && var3 <= var12.e && var12.e <= var4 && var5 <= var12.f && var12.f <= var6 && var12.h != 0 && var12.h != 1 && (this.mobFocus == null || var11 < var2[0])) {
                     this.mobFocus = var12;
                     var2[0] = var11;
                  }
               }
            } else {
               if (this.mobFocus.h != 1 && this.mobFocus.h != 0 && var3 <= this.mobFocus.e && this.mobFocus.e <= var4 && var5 <= this.mobFocus.f && this.mobFocus.f <= var6) {
                  this.o(0);
                  return;
               }

               this.mobFocus = null;

               for(var7 = 0; var7 < GameScr.vMobAttack.size(); ++var7) {
                  var12 = (Mob)GameScr.vMobAttack.elementAt(var7);
                  var9 = Math.abs(getMyChar().cx - var12.e);
                  var10 = Math.abs(getMyChar().cy - var12.f);
                  var11 = var9 > var10 ? var9 : var10;
                  if ((var12.s != 97 || getMyChar().cm != 4) && (var12.s != 96 || getMyChar().cm != 5) && (var12.s != 98 || getMyChar().cm != 4) && (var12.s != 167 || getMyChar().cm != 4) && (var12.s != 99 || getMyChar().cm != 5) && (var12.s != 166 || getMyChar().cm != 5) && (var12.s != 202 || var12.h != 8 || var12.c()) && (!GameScr.eo || var12.w != 3) && var12.s != 202 && var3 <= var12.e && var12.e <= var4 && var5 <= var12.f && var12.f <= var6 && var12.h != 0 && var12.h != 1 && (this.mobFocus == null || var11 < var2[0])) {
                     this.mobFocus = var12;
                     var2[0] = var11;
                  }
               }
            }

            var3 = getMyChar().cx - 80;
            var4 = getMyChar().cx + 80;
            var5 = getMyChar().cy - 30;
            var6 = getMyChar().cy + 30;
            if (this.npcFocus != null && this.npcFocus.template.npcTemplateId == 13) {
               var3 = getMyChar().cx - 20;
               var4 = getMyChar().cx + 20;
               var5 = getMyChar().cy - 10;
               var6 = getMyChar().cy + 10;
            }

            if (this.npcFocus == null) {
               for(var7 = 0; var7 < GameScr.ah.size(); ++var7) {
                  if ((var13 = (Npc)GameScr.ah.elementAt(var7)).r != 15 && TileMap.typeMap != 1) {
                     var9 = Math.abs(getMyChar().cx - var13.cx);
                     var10 = Math.abs(getMyChar().cy - var13.cy);
                     var11 = var9 > var10 ? var9 : var10;
                     var3 = getMyChar().cx - 80;
                     var4 = getMyChar().cx + 80;
                     var5 = getMyChar().cy - 30;
                     var6 = getMyChar().cy + 30;
                     if (var13.template.npcTemplateId == 13) {
                        var3 = getMyChar().cx - 20;
                        var4 = getMyChar().cx + 20;
                        var5 = getMyChar().cy - 10;
                        var6 = getMyChar().cy + 10;
                     }

                     if (var3 <= var13.cx && var13.cx <= var4 && var5 <= var13.cy && var13.cy <= var6 && (this.npcFocus == null || var11 < var2[1])) {
                        if (GameScr.eo && GameScr.es == 1) {
                           break;
                        }

                        this.npcFocus = var13;
                        var2[1] = var11;
                     }
                  }
               }
            } else {
               if (var3 <= this.npcFocus.cx && this.npcFocus.cx <= var4 && var5 <= this.npcFocus.cy && this.npcFocus.cy <= var6) {
                  this.o(1);
                  return;
               }

               this.y();

               for(var7 = 0; var7 < GameScr.ah.size(); ++var7) {
                  if ((var13 = (Npc)GameScr.ah.elementAt(var7)).r != 15 && TileMap.typeMap != 1) {
                     var9 = Math.abs(getMyChar().cx - var13.cx);
                     var10 = Math.abs(getMyChar().cy - var13.cy);
                     var11 = var9 > var10 ? var9 : var10;
                     var3 = getMyChar().cx - 80;
                     var4 = getMyChar().cx + 80;
                     var5 = getMyChar().cy - 30;
                     var6 = getMyChar().cy + 30;
                     if (var13.template.npcTemplateId == 13) {
                        var3 = getMyChar().cx - 20;
                        var4 = getMyChar().cx + 20;
                        var5 = getMyChar().cy - 10;
                        var6 = getMyChar().cy + 10;
                     }

                     if (var3 <= var13.cx && var13.cx <= var4 && var5 <= var13.cy && var13.cy <= var6 && (this.npcFocus == null || var11 < var2[1])) {
                        if (GameScr.eo && GameScr.es == 1) {
                           break;
                        }

                        this.npcFocus = var13;
                        var2[1] = var11;
                     }
                  }
               }
            }

            if (this.charFocus == null) {
               for(var7 = 0; var7 < GameScr.vCharInMap.size(); ++var7) {
                  if (!(var14 = (Char)GameScr.vCharInMap.elementAt(var7)).isNhanban && var14.r != 15 && !var14.df && var14.charID < -1 && this.gf == 0 && this.gg == 0 && var14.r != 14 && var14.r != 5) {
                     var9 = Math.abs(getMyChar().cx - var14.cx);
                     var10 = Math.abs(getMyChar().cy - var14.cy);
                     var11 = var9 > var10 ? var9 : var10;
                     if (var3 <= var14.cx && var14.cx <= var4 && var5 <= var14.cy && var14.cy <= var6 && (this.charFocus == null || var11 < var2[2])) {
                        this.charFocus = var14;
                        var2[2] = var11;
                     }
                  }
               }
            } else {
               if (var3 <= this.charFocus.cx && this.charFocus.cx <= var4 && var5 <= this.charFocus.cy && this.charFocus.cy <= var6 && this.charFocus.r != 15 && !this.charFocus.df) {
                  this.o(2);
                  return;
               }

               this.charFocus = null;

               for(var7 = 0; var7 < GameScr.vCharInMap.size(); ++var7) {
                  if (!(var14 = (Char)GameScr.vCharInMap.elementAt(var7)).isNhanban && var14.r != 15 && !var14.df && var14.charID < 0 && this.gf == 0 && this.gg == 0 && var14.r != 14 && var14.r != 5) {
                     var9 = Math.abs(getMyChar().cx - var14.cx);
                     var10 = Math.abs(getMyChar().cy - var14.cy);
                     var11 = var9 > var10 ? var9 : var10;
                     if (var3 <= var14.cx && var14.cx <= var4 && var5 <= var14.cy && var14.cy <= var6 && (this.charFocus == null || var11 < var2[2])) {
                        this.charFocus = var14;
                        var2[2] = var11;
                     }
                  }
               }
            }

            var7 = -1;

            for(var1 = 0; var1 < 4; ++var1) {
               if (var7 == -1) {
                  if (var2[var1] != -1) {
                     var7 = var1;
                  }
               } else if (var2[var1] < var2[var7] && var2[var1] != -1) {
                  var7 = var1;
               }
            }

            if (GameScr.eo && GameScr.es == 1 && !GameScr.getInstance().et) {
               GameScr.al();
            }
         } else {
            var3 = getMyChar().cx - getMyChar().d();
            var4 = getMyChar().cx + getMyChar().d();
            var5 = getMyChar().cy - getMyChar().e() - var1;
            if ((var6 = getMyChar().cy + getMyChar().e()) > getMyChar().cy + 30) {
               var6 = getMyChar().cy + 30;
            }

            if (this.mobFocus == null) {
               for(var7 = 0; var7 < GameScr.vMobAttack.size(); ++var7) {
                  var12 = (Mob)GameScr.vMobAttack.elementAt(var7);
                  var9 = Math.abs(getMyChar().cx - var12.e);
                  var10 = Math.abs(getMyChar().cy - var12.f);
                  var11 = var9 > var10 ? var9 : var10;
                  if ((var12.s != 97 || getMyChar().cm != 4) && (var12.s != 96 || getMyChar().cm != 5) && (var12.s != 98 || getMyChar().cm != 4) && (var12.s != 167 || getMyChar().cm != 4) && (var12.s != 99 || getMyChar().cm != 5) && (var12.s != 166 || getMyChar().cm != 5) && var3 <= var12.e && var12.e <= var4 && var5 <= var12.f && var12.f <= var6 && var12.h != 0 && var12.h != 1 && (this.mobFocus == null || var11 < var2[0])) {
                     this.mobFocus = var12;
                     var2[0] = var11;
                  }
               }
            } else {
               if (this.mobFocus.h != 1 && this.mobFocus.h != 0 && var3 <= this.mobFocus.e && this.mobFocus.e <= var4 && var5 <= this.mobFocus.f && this.mobFocus.f <= var6) {
                  this.o(0);
                  return;
               }

               this.mobFocus = null;

               for(var7 = 0; var7 < GameScr.vMobAttack.size(); ++var7) {
                  var12 = (Mob)GameScr.vMobAttack.elementAt(var7);
                  var9 = Math.abs(getMyChar().cx - var12.e);
                  var10 = Math.abs(getMyChar().cy - var12.f);
                  var11 = var9 > var10 ? var9 : var10;
                  if ((var12.s != 97 || getMyChar().cm != 4) && (var12.s != 96 || getMyChar().cm != 5) && (var12.s != 98 || getMyChar().cm != 4) && (var12.s != 167 || getMyChar().cm != 4) && (var12.s != 99 || getMyChar().cm != 5) && (var12.s != 166 || getMyChar().cm != 5) && var3 <= var12.e && var12.e <= var4 && var5 <= var12.f && var12.f <= var6 && var12.h != 0 && var12.h != 1 && (this.mobFocus == null || var11 < var2[0])) {
                     this.mobFocus = var12;
                     var2[0] = var11;
                  }
               }
            }

            var3 = getMyChar().cx - 80;
            var4 = getMyChar().cx + 80;
            var5 = getMyChar().cy - 30;
            var6 = getMyChar().cy + 30;
            if (this.npcFocus != null && this.npcFocus.template.npcTemplateId == 13) {
               var3 = getMyChar().cx - 20;
               var4 = getMyChar().cx + 20;
               var5 = getMyChar().cy - 10;
               var6 = getMyChar().cy + 10;
            }

            if (this.npcFocus == null) {
               for(var7 = 0; var7 < GameScr.ah.size(); ++var7) {
                  if ((var13 = (Npc)GameScr.ah.elementAt(var7)).r != 15) {
                     var9 = Math.abs(getMyChar().cx - var13.cx);
                     var10 = Math.abs(getMyChar().cy - var13.cy);
                     var11 = var9 > var10 ? var9 : var10;
                     var3 = getMyChar().cx - 80;
                     var4 = getMyChar().cx + 80;
                     var5 = getMyChar().cy - 30;
                     var6 = getMyChar().cy + 30;
                     if (var13.template.npcTemplateId == 13) {
                        var3 = getMyChar().cx - 20;
                        var4 = getMyChar().cx + 20;
                        var5 = getMyChar().cy - 10;
                        var6 = getMyChar().cy + 10;
                     }

                     if (var3 <= var13.cx && var13.cx <= var4 && var5 <= var13.cy && var13.cy <= var6 && (this.npcFocus == null || var11 < var2[1])) {
                        if (GameScr.eo && GameScr.es == 1) {
                           break;
                        }

                        this.npcFocus = var13;
                        var2[1] = var11;
                     }
                  }
               }
            } else {
               if (var3 <= this.npcFocus.cx && this.npcFocus.cx <= var4 && var5 <= this.npcFocus.cy && this.npcFocus.cy <= var6) {
                  this.o(1);
                  return;
               }

               this.y();

               for(var7 = 0; var7 < GameScr.ah.size(); ++var7) {
                  if ((var13 = (Npc)GameScr.ah.elementAt(var7)).r != 15) {
                     var9 = Math.abs(getMyChar().cx - var13.cx);
                     var10 = Math.abs(getMyChar().cy - var13.cy);
                     var11 = var9 > var10 ? var9 : var10;
                     var3 = getMyChar().cx - 80;
                     var4 = getMyChar().cx + 80;
                     var5 = getMyChar().cy - 30;
                     var6 = getMyChar().cy + 30;
                     if (var13.template.npcTemplateId == 13) {
                        var3 = getMyChar().cx - 20;
                        var4 = getMyChar().cx + 20;
                        var5 = getMyChar().cy - 10;
                        var6 = getMyChar().cy + 10;
                     }

                     if (var3 <= var13.cx && var13.cx <= var4 && var5 <= var13.cy && var13.cy <= var6 && (this.npcFocus == null || var11 < var2[1])) {
                        if (GameScr.eo && GameScr.es == 1) {
                           break;
                        }

                        this.npcFocus = var13;
                        var2[1] = var11;
                     }
                  }
               }
            }

            var3 = getMyChar().cx - 40;
            var4 = getMyChar().cx + 40;
            var5 = getMyChar().cy - 30;
            var6 = getMyChar().cy + 30;
            if (this.charFocus == null) {
               for(var7 = 0; var7 < GameScr.vCharInMap.size(); ++var7) {
                  if (!(var14 = (Char)GameScr.vCharInMap.elementAt(var7)).isNhanban) {
                     if (TileMap.mapID != 111) {
                        if (var14.r == 15 || var14.df || var14.cm == ha.cm || this.gf != 0 || this.gg != 0 || var14.r == 14 || var14.r == 5) {
                           continue;
                        }
                     } else {
                        if (var14.r == 15 || var14.df || this.gf != 0 || this.gg != 0) {
                           continue;
                        }

                        if (ha.nClass.classId == 6) {
                           if (ha.cm == var14.cm) {
                              if (var14.r != 14 || var14.r != 5) {
                                 continue;
                              }
                           } else if (var14.r == 14 || var14.r == 5) {
                              continue;
                           }
                        } else if (ha.cm == var14.cm || var14.r == 14 || var14.r == 5) {
                           continue;
                        }
                     }

                     var9 = Math.abs(getMyChar().cx - var14.cx);
                     var10 = Math.abs(getMyChar().cy - var14.cy);
                     var11 = var9 > var10 ? var9 : var10;
                     if (var3 <= var14.cx && var14.cx <= var4 && var5 <= var14.cy && var14.cy <= var6 && (this.charFocus == null || var11 < var2[2])) {
                        this.charFocus = var14;
                        var2[2] = var11;
                     }
                  }
               }
            } else {
               if (var3 <= this.charFocus.cx && this.charFocus.cx <= var4 && var5 <= this.charFocus.cy && this.charFocus.cy <= var6 && this.charFocus.r != 15 && !this.charFocus.df && this.charFocus.r != 14 && this.charFocus.r != 5) {
                  this.o(2);
                  return;
               }

               this.charFocus = null;

               for(var7 = 0; var7 < GameScr.vCharInMap.size(); ++var7) {
                  if (!(var14 = (Char)GameScr.vCharInMap.elementAt(var7)).isNhanban) {
                     if (TileMap.mapID != 111) {
                        if (var14.r == 15 || var14.df || var14.cm == ha.cm || this.gf != 0 || this.gg != 0 || var14.r == 14 || var14.r == 5) {
                           continue;
                        }
                     } else {
                        if (var14.r == 15 || var14.df || this.gf != 0 || this.gg != 0) {
                           continue;
                        }

                        if (ha.nClass.classId == 6) {
                           if (ha.cm == var14.cm) {
                              if (var14.r != 14 || var14.r != 5) {
                                 continue;
                              }
                           } else if (var14.r == 14 || var14.r == 5) {
                              continue;
                           }
                        } else if (ha.cm == var14.cm || var14.r == 14 || var14.r == 5) {
                           continue;
                        }
                     }

                     var9 = Math.abs(getMyChar().cx - var14.cx);
                     var10 = Math.abs(getMyChar().cy - var14.cy);
                     var11 = var9 > var10 ? var9 : var10;
                     if (var3 <= var14.cx && var14.cx <= var4 && var5 <= var14.cy && var14.cy <= var6 && (this.charFocus == null || var11 < var2[2])) {
                        this.charFocus = var14;
                        var2[2] = var11;
                     }
                  }
               }
            }

            var7 = -1;

            for(var1 = 0; var1 < 4; ++var1) {
               if (var7 == -1) {
                  if (var2[var1] != -1) {
                     var7 = var1;
                  }
               } else if (var2[var1] < var2[var7] && var2[var1] != -1) {
                  var7 = var1;
               }
            }
         }

         this.o(var7);
      }

   }

   private void o(int var1) {
      if (var1 == 0) {
         this.y();
         this.charFocus = null;
         this.itemFocus = null;
      } else if (var1 == 1) {
         this.mobFocus = null;
         this.charFocus = null;
         this.itemFocus = null;
      } else if (var1 == 2) {
         this.mobFocus = null;
         this.y();
         this.itemFocus = null;
      } else {
         if (var1 == 3) {
            this.mobFocus = null;
            this.y();
            this.charFocus = null;
         }

      }
   }

   public static boolean a(Char var0) {
      int var1 = GameScr.i;
      int var2 = GameScr.i + GameCanvas.width;
      int var3 = GameScr.j + 10;
      int var4 = GameScr.j + GameScr.c;
      return var0.r != 15 && !var0.df && var1 <= var0.cx && var0.cx <= var2 && var3 <= var0.cy && var0.cy <= var4;
   }

   public final void x() {
      if (this.charFocus != null && this.charFocus.isNhanban) {
         this.charFocus = null;
      }

      if (getMyChar().gc == null && getMyChar().gb == null) {
         this.focus.removeAllElements();
         int var1 = 0;
         int var2 = GameScr.i + 10;
         int var3 = GameScr.i + GameCanvas.width - 10;
         int var4 = GameScr.j + 10;
         int var5 = GameScr.j + GameScr.c;
         int var6;
         Char var7;
         ItemMap var8;
         Mob var9;
         Npc var10;
         if (TileMap.typeMap != 3 && TileMap.mapID != 111) {
            for(var6 = 0; var6 < GameScr.af.size(); ++var6) {
               var8 = (ItemMap)GameScr.af.elementAt(var6);
               if (var2 <= var8.a && var8.a <= var3 && var4 <= var8.b && var8.b <= var5) {
                  this.focus.addElement(var8);
                  if (this.itemFocus != null && var8.equals(this.itemFocus)) {
                     var1 = this.focus.size();
                  }
               }
            }

            for(var6 = 0; var6 < GameScr.vMobAttack.size(); ++var6) {
               if (((var9 = (Mob)GameScr.vMobAttack.elementAt(var6)).s != 97 || getMyChar().cm != 4) && (var9.s != 96 || getMyChar().cm != 5) && (var9.s != 98 || getMyChar().cm != 4) && (var9.s != 167 || getMyChar().cm != 4) && (var9.s != 99 || getMyChar().cm != 5) && (var9.s != 166 || getMyChar().cm != 5) && (var9.s != 202 || var9.h != 8 || var9.c()) && var9.h != 1 && var9.h != 0 && var2 <= var9.e && var9.e <= var3 && var4 <= var9.f && var9.f <= var5) {
                  this.focus.addElement(var9);
                  if (this.mobFocus != null && var9.equals(this.mobFocus)) {
                     var1 = this.focus.size();
                  }
               }
            }

            for(var6 = 0; var6 < GameScr.ah.size(); ++var6) {
               if ((var10 = (Npc)GameScr.ah.elementAt(var6)).r != 15 && var2 <= var10.cx && var10.cx <= var3 && var4 <= var10.cy && var10.cy <= var5) {
                  this.focus.addElement(var10);
                  if (this.npcFocus != null && var10.equals(this.npcFocus)) {
                     var1 = this.focus.size();
                  }
               }
            }

            for(var6 = 0; var6 < GameScr.vCharInMap.size(); ++var6) {
               if (!(var7 = (Char)GameScr.vCharInMap.elementAt(var6)).isNhanban && var7.r != 15 && !var7.df && var2 <= var7.cx && var7.cx <= var3 && var4 <= var7.cy && var7.cy <= var5) {
                  this.focus.addElement(var7);
                  if (this.charFocus != null && var7.equals(this.charFocus)) {
                     var1 = this.focus.size();
                  }
               }
            }

            if (this.focus.size() <= 0) {
               this.mobFocus = null;
               this.y();
               this.charFocus = null;
               this.itemFocus = null;
               ge = false;
               return;
            }

            if (var1 >= this.focus.size()) {
               var1 = 0;
            }

            if (this.focus.elementAt(var1) instanceof Mob) {
               this.mobFocus = (Mob)this.focus.elementAt(var1);
               this.y();
               this.charFocus = null;
               this.itemFocus = null;
               ge = true;
               return;
            }

            if (this.focus.elementAt(var1) instanceof Npc) {
               this.mobFocus = null;
               this.y();
               this.npcFocus = (Npc)this.focus.elementAt(var1);
               this.charFocus = null;
               this.itemFocus = null;
               ge = true;
               return;
            }

            if (this.focus.elementAt(var1) instanceof Char) {
               this.mobFocus = null;
               this.y();
               this.charFocus = (Char)this.focus.elementAt(var1);
               this.itemFocus = null;
               ge = true;
               return;
            }

            if (this.focus.elementAt(var1) instanceof ItemMap) {
               this.mobFocus = null;
               this.y();
               this.charFocus = null;
               this.itemFocus = (ItemMap)this.focus.elementAt(var1);
               ge = true;
               return;
            }
         } else {
            if (TileMap.mapID != 98 && TileMap.mapID != 104) {
               for(var6 = 0; var6 < GameScr.vCharInMap.size(); ++var6) {
                  if (!(var7 = (Char)GameScr.vCharInMap.elementAt(var6)).isNhanban && var7.r != 15 && !var7.df && var2 <= var7.cx && var7.cx <= var3 && var4 <= var7.cy && var7.cy <= var5) {
                     if (TileMap.mapID != 111) {
                        if (var7.cm != getMyChar().cm && var7.r != 14 && var7.r != 5) {
                           this.focus.addElement(var7);
                           if (this.charFocus != null && var7.equals(this.charFocus)) {
                              var1 = this.focus.size();
                           }
                        }
                     } else if (ha.cm == 0) {
                        this.focus.addElement(var7);
                        if (this.charFocus != null && var7.equals(this.charFocus)) {
                           var1 = this.focus.size();
                        }
                     } else if (ha.nClass.classId == 6) {
                        if (ha.cm == var7.cm) {
                           if (var7.r == 14 || var7.r == 5) {
                              this.focus.addElement(var7);
                              if (this.charFocus != null && var7.equals(this.charFocus)) {
                                 var1 = this.focus.size();
                              }
                           }
                        } else if ((ha.cm != 4 || var7.cm == 5) && (ha.cm != 5 || var7.cm == 4) && var7.r != 14 && var7.r != 5) {
                           this.focus.addElement(var7);
                           if (this.charFocus != null && var7.equals(this.charFocus)) {
                              var1 = this.focus.size();
                           }
                        }
                     } else if ((ha.cm != 4 || var7.cm == 5) && (ha.cm != 5 || var7.cm == 4) && var7.r != 14 && var7.r != 5) {
                        this.focus.addElement(var7);
                        if (this.charFocus != null && var7.equals(this.charFocus)) {
                           var1 = this.focus.size();
                        }
                     }
                  }
               }
            } else {
               for(var6 = 0; var6 < GameScr.vCharInMap.size(); ++var6) {
                  if (!(var7 = (Char)GameScr.vCharInMap.elementAt(var6)).isNhanban && var7.r != 15 && !var7.df && var2 <= var7.cx && var7.cx <= var3 && var4 <= var7.cy && var7.cy <= var5) {
                     this.focus.addElement(var7);
                     if (this.charFocus != null && var7.equals(this.charFocus)) {
                        var1 = this.focus.size();
                     }
                  }
               }
            }

            for(var6 = 0; var6 < GameScr.af.size(); ++var6) {
               var8 = (ItemMap)GameScr.af.elementAt(var6);
               if (var2 <= var8.a && var8.a <= var3 && var4 <= var8.b && var8.b <= var5) {
                  this.focus.addElement(var8);
                  if (this.itemFocus != null && var8.equals(this.itemFocus)) {
                     var1 = this.focus.size();
                  }
               }
            }

            for(var6 = 0; var6 < GameScr.vMobAttack.size(); ++var6) {
               if (((var9 = (Mob)GameScr.vMobAttack.elementAt(var6)).s != 97 || getMyChar().cm != 4) && (var9.s != 96 || getMyChar().cm != 5) && (var9.s != 98 || getMyChar().cm != 4) && (var9.s != 167 || getMyChar().cm != 4) && (var9.s != 99 || getMyChar().cm != 5) && (var9.s != 166 || getMyChar().cm != 5) && var9.h != 1 && var9.h != 0 && var2 <= var9.e && var9.e <= var3 && var4 <= var9.f && var9.f <= var5) {
                  this.focus.addElement(var9);
                  if (this.mobFocus != null && var9.equals(this.mobFocus)) {
                     var1 = this.focus.size();
                  }
               }
            }

            for(var6 = 0; var6 < GameScr.ah.size(); ++var6) {
               if ((var10 = (Npc)GameScr.ah.elementAt(var6)).r != 15 && var2 <= var10.cx && var10.cx <= var3 && var4 <= var10.cy && var10.cy <= var5) {
                  this.focus.addElement(var10);
                  if (this.npcFocus != null && var10.equals(this.npcFocus)) {
                     var1 = this.focus.size();
                  }
               }
            }

            if (this.focus.size() <= 0) {
               this.mobFocus = null;
               this.y();
               this.charFocus = null;
               this.itemFocus = null;
               ge = false;
               return;
            }

            if (var1 >= this.focus.size()) {
               var1 = 0;
            }

            if (this.focus.elementAt(var1) instanceof Char) {
               this.mobFocus = null;
               this.y();
               this.charFocus = (Char)this.focus.elementAt(var1);
               this.itemFocus = null;
               ge = true;
               return;
            }

            if (this.focus.elementAt(var1) instanceof Npc) {
               this.mobFocus = null;
               this.y();
               this.npcFocus = (Npc)this.focus.elementAt(var1);
               this.charFocus = null;
               this.itemFocus = null;
               ge = true;
               return;
            }

            if (this.focus.elementAt(var1) instanceof Mob) {
               this.mobFocus = (Mob)this.focus.elementAt(var1);
               this.y();
               this.charFocus = null;
               this.itemFocus = null;
               ge = true;
               return;
            }

            if (this.focus.elementAt(var1) instanceof ItemMap) {
               this.mobFocus = null;
               this.y();
               this.charFocus = null;
               this.itemFocus = (ItemMap)this.focus.elementAt(var1);
               ge = true;
               return;
            }
         }
      }

   }

   public final void y() {
      if (this.bl && this.npcFocus != null) {
         this.npcFocus.chatPopup = null;
         this.npcFocus = null;
      }

   }

   private void ax() {
      if (!GameCanvas.lowGraphic) {
         if (TileMap.a(this.cx, this.cy + 1, 1024)) {
            TileMap.b(this.cx, this.cy + 1);
            TileMap.b(this.cx, this.cy - 2);
         }

         if (TileMap.a(this.cx - TileMap.size, this.cy + 1, 512)) {
            TileMap.c(this.cx - TileMap.size, this.cy + 1);
            TileMap.c(this.cx - TileMap.size, this.cy - 2);
         }

         if (TileMap.a(this.cx + TileMap.size, this.cy + 1, 512)) {
            TileMap.c(this.cx + TileMap.size, this.cy + 1);
            TileMap.c(this.cx + TileMap.size, this.cy - 2);
         }
      }

   }

   public final void b(Message var1) {
      try {
         this.a(var1);
         getMyChar().eff5BuffHp = var1.reader().readShort();
         getMyChar().eff5BuffMp = var1.reader().readShort();
         int var2 = var1.reader().readUnsignedByte();
         Item var3;
         (var3 = this.arrItemMounts[var2]).typeUI = 3;
         this.arrItemMounts[var2] = null;
         var3.indexUI = var1.reader().readUnsignedByte();
         this.arrItemBag[var3.indexUI] = var3;
         if (var2 == 4) {
            this.bp = this.bo = this.bq = false;
         }

         GameScr.cg = false;
         GameScr.getInstance().showButtonIndexMenu();
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public final void c(Message var1) {
      try {
         this.a(var1);
         getMyChar().eff5BuffHp = var1.reader().readShort();
         getMyChar().eff5BuffMp = var1.reader().readShort();
         Item var2;
         (var2 = this.arrItemBody[var1.reader().readUnsignedByte()]).typeUI = 3;
         if (var2.indexUI == 1) {
            this.weapon = 15;
         } else if (var2.indexUI == 2) {
            this.p();
         } else if (var2.indexUI == 6) {
            this.q();
         }

         this.arrItemBody[var2.indexUI] = null;
         var2.indexUI = var1.reader().readUnsignedByte();
         getMyChar().head = var1.reader().readShort();
         this.arrItemBag[var2.indexUI] = var2;
         GameScr.getInstance().left = GameScr.getInstance().center = null;
         GameScr.getInstance().showButtonIndexMenu();
      } catch (Exception var3) {
         var3.printStackTrace();
         System.out.println("Char.itemBodyToBag()");
      }
   }

   public final void d(Message var1) {
      try {
         int var2 = var1.reader().readUnsignedByte();
         int var5 = var1.reader().readUnsignedByte();
         Item var3;
         if ((var3 = this.arrItemBag[var2]) != null) {
            if (var3.template.type == 16) {
               GameScr.r -= var3.quantity;
            }

            if (var3.template.type == 17) {
               GameScr.q -= var3.quantity;
            }

            this.arrItemBag[var2] = null;
            if (this.arrItemBox[var5] == null) {
               var3.indexUI = var5;
               var3.typeUI = 4;
               this.arrItemBox[var5] = var3;
            } else {
               Item var10000 = this.arrItemBox[var5];
               var10000.quantity += var3.quantity;
            }
         }

         GameScr.getInstance().left = GameScr.getInstance().center = null;
         GameScr.getInstance().aa();
      } catch (Exception var4) {
         var4.printStackTrace();
         System.out.println("Char.itemBagToBox()");
      }
   }

   public final void e(Message var1) {
      try {
         int var2 = var1.reader().readUnsignedByte();
         int var5 = var1.reader().readUnsignedByte();
         Item var3;
         if ((var3 = this.arrItemBox[var2]) != null) {
            if (var3.template.type == 16) {
               GameScr.r += var3.quantity;
            }

            if (var3.template.type == 17) {
               GameScr.q += var3.quantity;
            }

            this.arrItemBox[var2] = null;
            if (this.arrItemBag[var5] == null) {
               var3.indexUI = var5;
               var3.typeUI = 3;
               this.arrItemBag[var5] = var3;
            } else {
               Item var10000 = this.arrItemBag[var5];
               var10000.quantity += var3.quantity;
            }
         }

         GameScr.getInstance().left = GameScr.getInstance().center = null;
         GameScr.getInstance().aa();
      } catch (Exception var4) {
         var4.printStackTrace();
         System.out.println("Char.itemBoxToBag()");
      }
   }

   public static void a(Message var0, boolean var1) {
      try {
         for(int var2 = 0; var2 < GameScr.arrItemUpPeal.length; ++var2) {
            GameScr.arrItemUpPeal[var2] = null;
         }

         byte var6 = var0.reader().readByte();
         Item var3;
         (var3 = new Item()).typeUI = 3;
         var3.indexUI = var0.reader().readByte();
         var3.template = ItemTemplateManager.get(var0.reader().readShort());
         var3.isLock = var0.reader().readBoolean();
         var3.isExpires = var0.reader().readBoolean();
         var3.quantity = 1;
         if (var1) {
            getMyChar().xu = var0.reader().readInt();
         } else {
            getMyChar().yen = var0.reader().readInt();

            try {
               getMyChar().xu = var0.reader().readInt();
            } catch (Exception var4) {
            }
         }

         GameScr.arrItemUpPeal[0] = var3;
         GameScr.ez = GameScr.efs[53];
         GameScr.ey = 0;
         GameScr.getInstance().left = GameScr.getInstance().center = null;
         GameScr.getInstance().ab();
         GameCanvas.setMaxTextLenght();
         if (var6 == 1) {
            getMyChar().arrItemBag[var3.indexUI] = var3;
            InfoMe.a(mResources.ew + " " + var3.template.name);
         } else {
            InfoMe.a(mResources.ev + " " + ItemTemplateManager.get((short)(var3.template.id + 1)).name + " " + mResources.ey + " " + var3.template.name, 25, mFont.tahoma_7_red);
            GameScr.arrItemUpPeal[0] = var3;
         }

         LockGame.b();
      } catch (Exception var5) {
         var5.printStackTrace();
         System.out.println("Char.itemBagToBox()");
      }
   }

   private static void a(Item var0, int var1) {
      int var2 = 0;
      if (var0 != null && var0.options != null) {
         for(int var3 = 0; var3 < var0.options.size(); ++var3) {
            ItemOption var4;
            (var4 = (ItemOption)var0.options.elementAt(var3)).active = 0;
            if (var4.optionTemplate.type == 2) {
               if (var2 < var1) {
                  var4.active = 1;
                  ++var2;
               }
            } else if (var4.optionTemplate.type == 3 && var0.upgrade >= 4) {
               var4.active = 1;
            } else if (var4.optionTemplate.type == 4 && var0.upgrade >= 8) {
               var4.active = 1;
            } else if (var4.optionTemplate.type == 5 && var0.upgrade >= 12) {
               var4.active = 1;
            } else if (var4.optionTemplate.type == 6 && var0.upgrade >= 14) {
               var4.active = 1;
            } else if (var4.optionTemplate.type == 7 && var0.upgrade >= 16) {
               var4.active = 1;
            }
         }
      }

   }

   public final void z() {
      int var1 = 2;
      int var2 = 2;
      int var3 = 2;
      if (this.arrItemBody[0] == null) {
         --var1;
      }

      if (this.arrItemBody[6] == null) {
         --var1;
      }

      if (this.arrItemBody[5] == null) {
         --var1;
      }

      a(this.arrItemBody[0], var1);
      a(this.arrItemBody[6], var1);
      a(this.arrItemBody[5], var1);
      if (this.arrItemBody[2] == null) {
         --var2;
      }

      if (this.arrItemBody[8] == null) {
         --var2;
      }

      if (this.arrItemBody[7] == null) {
         --var2;
      }

      a(this.arrItemBody[2], var2);
      a(this.arrItemBody[8], var2);
      a(this.arrItemBody[7], var2);
      if (this.arrItemBody[4] == null) {
         --var3;
      }

      if (this.arrItemBody[3] == null) {
         --var3;
      }

      if (this.arrItemBody[9] == null) {
         --var3;
      }

      if (this.arrItemBody[1] != null) {
         ItemOption var4;
         if (this.arrItemBody[1].sys == this.getSys()) {
            if (this.arrItemBody[1].options != null) {
               for(var1 = 0; var1 < this.arrItemBody[1].options.size(); ++var1) {
                  if ((var4 = (ItemOption)this.arrItemBody[1].options.elementAt(var1)).optionTemplate.type == 2) {
                     var4.active = 1;
                  }
               }
            }
         } else if (this.arrItemBody[1].options != null) {
            for(var1 = 0; var1 < this.arrItemBody[1].options.size(); ++var1) {
               if ((var4 = (ItemOption)this.arrItemBody[1].options.elementAt(var1)).optionTemplate.type == 2) {
                  var4.active = 0;
               }
            }
         }
      }

      a(this.arrItemBody[4], var3);
      a(this.arrItemBody[3], var3);
      a(this.arrItemBody[9], var3);
   }

   public final void a(int var1, int var2, boolean var3, int var4) {
      this.cHP -= var1;
      this.cMP -= var2;
      if (!this.bl) {
         this.cHP = this.ad;
      }

      if (this.cHP < 0) {
         this.cHP = 0;
      }

      if (this.cMP < 0) {
         this.cMP = 0;
      }

      if (this.cHP <= 0 && this.r != 14 && this.r != 5) {
         this.cHP = 1;
      }

      if (var1 <= 0) {
         if (this.bl) {
            GameScr.a("", this.cx, this.cy - this.bj, 7);
         } else {
            GameScr.a("", this.cx, this.cy - this.bj, 4);
         }
      } else {
         GameScr.a("-" + var1, this.cx, this.cy - this.bj, 0);
      }

      if (var1 > 0) {
         this.ie = 4;
      }

      if (var3) {
         if (var4 == 114) {
            Class_bj.a(32, this.cx, this.cy - this.gq, 1);
            return;
         }

         if (var4 == 115) {
            Class_bj.a(85, this.cx, this.cy, 1);
            return;
         }

         if (var4 == 139) {
            GameScr.eq = 1;
            GameScr.er = 0;
            Class_bj.a(91, this, 2);
            return;
         }

         if (var4 == 144) {
            Class_bj.a(91, this, 1);
            return;
         }
      } else {
         this.n(49);
      }

   }

   private void b(short var1, short var2) {
      if (this.bl) {
         fl = true;

         for(int var3 = 0; var3 < GameScr.vCharInMap.size(); ++var3) {
            ((Char)GameScr.vCharInMap.elementAt(var3)).da = -9999;
         }
      }

      this.r = 5;
      this.gm = var1;
      this.gn = var2;
      this.q = 0;
      this.cHP = 0;
      this.cz = -9999;
      this.da = -9999;
   }

   public final void a(short var1, short var2) {
      this.gf = var1;
      this.gg = var2;
   }

   private void ay() {
      this.c = 0;
      this.r = 1;
      this.fd = System.currentTimeMillis();
   }

   public final void aa() {
      this.cHP = this.cMaxHP;
      this.cMP = this.cMaxMP;
      this.ay();
      this.q = this.gm = this.gn = 0;
      Class_bj.a(20, this, 2);
      GameScr.getInstance().center = null;
   }

   public final boolean e(int var1) {
      if (this.arrItemBag == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < this.arrItemBag.length; ++var2) {
            if (this.arrItemBag[var2] != null && this.arrItemBag[var2].template.type == var1 && this.arrItemBag[var2].template.level <= ha.cLevel) {
               Service.getInstance().useItem(var2);
               return true;
            }
         }

         return false;
      }
   }

   private static boolean az() {
      return TileMap.mapID == 1 || TileMap.mapID == 27 || TileMap.mapID == 72 || TileMap.mapID == 10 || TileMap.mapID == 17 || TileMap.mapID == 22 || TileMap.mapID == 32 || TileMap.mapID == 38 || TileMap.mapID == 43 || TileMap.mapID == 48;
   }

   public static boolean b(Char var0) {
      if (var0 != null && var0.isNhanban) {
         return false;
      } else if (var0 != null && getMyChar().bz != null && getMyChar().bz.template.type != 2 && getMyChar().bz.template.type != 3 && (getMyChar().bz.template.type != 4 || var0.r == 14 || var0.r == 5)) {
         if ((getMyChar().cm == 4 && var0.cm == 5 || getMyChar().cm == 5 && var0.cm == 4) && !c(var0) && !az() || var0.cm == 3 && !c(var0) && !az() || getMyChar().cm == 3 && !c(var0) && !az() || getMyChar().cm == 1 && var0.cm == 1 && !c(var0) && !az() || getMyChar().cz >= 0 && getMyChar().cz == var0.charID || getMyChar().da >= 0 && getMyChar().da == var0.charID && !az() || var0.da >= 0 && var0.da == getMyChar().charID && !az()) {
            return var0.r != 14 && var0.r != 5;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static boolean c(Char var0) {
      for(int var1 = 0; var1 < GameScr.vParty.size(); ++var1) {
         Party var2 = (Party)GameScr.vParty.elementAt(var1);
         if (var0.charID == var2.a) {
            return true;
         }
      }

      return false;
   }

   public static void ab() {
      getMyChar().c(21);
      getMyChar().taskMaint = null;

      for(int var0 = 0; var0 < getMyChar().arrItemBag.length; ++var0) {
         if (getMyChar().arrItemBag[var0] != null && (getMyChar().arrItemBag[var0].template.type == 25 || getMyChar().arrItemBag[var0].template.type == 23 || getMyChar().arrItemBag[var0].template.type == 24)) {
            getMyChar().arrItemBag[var0] = null;
         }
      }

      Npc.a();
   }

   public static int ac() {
      if (fc >= 4000) {
         return 4;
      } else if (fc >= 1500) {
         return 3;
      } else if (fc >= 600) {
         return 2;
      } else {
         return fc >= 200 ? 1 : 0;
      }
   }

   public final boolean ad() {
      return this.isHuman;
   }

   public final boolean ae() {
      return this.isNhanban;
   }

   public static int af() {
      Item[] var0 = getMyChar().arrItemBag;
      int var1 = 0;

      for(int var2 = 0; var2 < var0.length; ++var2) {
         Item var3;
         if ((var3 = var0[var2]) != null && var3.template.type == 26 && var3.template.id <= 3) {
            var1 += GameScr.upClothe[var3.template.id];
         }
      }

      return var1;
   }

   public static Item b(int var0, int var1) {
      Item[] var2 = getMyChar().arrItemBag;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Item var4;
         if ((var4 = var2[var3]) != null && var4.template.id == var0 && var4.quantity == var1) {
            return var4;
         }
      }

      return null;
   }

   public static Item f(int var0) {
      Item[] var1 = getMyChar().arrItemBag;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         Item var3;
         if ((var3 = var1[var2]) != null && var3.template.id == var0 && !var3.isLock) {
            return var3;
         }
      }

      return null;
   }

   public static Item g(int var0) {
      Item[] var1 = getMyChar().arrItemBag;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         Item var3;
         if ((var3 = var1[var2]) != null && var3.template.id == var0) {
            return var3;
         }
      }

      return null;
   }

   public static MyVector getListItemByID(int var0) {
      Item[] var1 = getMyChar().arrItemBag;
      MyVector var2 = new MyVector();

      for(int var3 = 0; var3 < var1.length; ++var3) {
         Item var4;
         if ((var4 = var1[var3]) != null && var4.template.id == var0) {
            var2.addElement(var4);
         }
      }

      return var2;
   }

   public static int getIndexItemById(int var0) {
      Item[] var1 = getMyChar().arrItemBag;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].template.id == var0) {
            return var2;
         }
      }

      return -1;
   }

   public static boolean hasItem(int var0) {
      Item[] var1 = getMyChar().arrItemBag;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].template.id == var0) {
            return true;
         }
      }

      return false;
   }

   public static int k(int var0) {
      Item[] var1 = getMyChar().arrItemBag;
      int var2 = 0;

      for(int var3 = 0; var3 < var1.length; ++var3) {
         if (var1[var3] != null && var1[var3].template.id == var0) {
            if (var1[var3].template.isUpToUp) {
               var2 += var1[var3].quantity;
            } else {
               ++var2;
            }
         }
      }

      return var2;
   }

   public static int countNullSlot() {
      Item[] var0 = getMyChar().arrItemBag;
      int var1 = 0;

      for(int var2 = 0; var2 < var0.length; ++var2) {
         if (var0[var2] == null) {
            ++var1;
         }
      }

      return var1;
   }

   public static int countNullSlotBox() {
      Item[] var0 = getMyChar().arrItemBox;
      int var1 = 0;
      if (var0 != null) {
         for(int var2 = 0; var2 < var0.length; ++var2) {
            if (var0[var2] == null) {
               ++var1;
            }
         }
      }

      return var1;
   }
   
   public static Item ala(int var0) {
      if (getMyChar().arrItemBox == null) {
         Service.getInstance().requestItem(4);
         LockGame.s();
      }

      Item[] var1 = getMyChar().arrItemBox;

      for(int i = 0; i < var1.length; ++i) {
         Item it;
         if ((it = var1[i]) != null && it.template.id == var0) {
            return it;
         }
      }

      return null;
   }

   public static TaskOrder l(int var0) {
      for(int var1 = 0; var1 < getMyChar().taskOrders.size(); ++var1) {
         TaskOrder var2;
         if ((var2 = (TaskOrder)getMyChar().taskOrders.elementAt(var1)) != null && var2.taskId == var0) {
            return var2;
         }
      }

      return null;
   }

   public static boolean c(int var0, int var1) {
      Char var2 = getMyChar();
      if (var0 == -1) {
         var0 = var2.cx;
      }

      if (var1 == -1) {
         var1 = var2.cy;
      }

      if (var0 == var2.cx && var1 == var2.cy) {
         return false;
      } else {
         int var3 = 0;
         int var4 = var2.cx;
         int var5 = TileMap.a(var0, var1 - 12, 64) ? TileMap.b(var1) - 24 : var1;
         if (var0 > var4) {
            while(true) {
               var4 += 50;
               if (var4 >= var0) {
                  break;
               }

               Service.getInstance().charMove(var4, TileMap.e(var4, var5));
               ++var3;
               if (var3 > 50) {
                  try {
                     Thread.sleep(200L);
                  } catch (InterruptedException var8) {
                     var8.printStackTrace();
                  }
               }
            }
         } else {
            while(true) {
               var4 -= 50;
               if (var4 <= var0) {
                  break;
               }

               Service.getInstance().charMove(var4, TileMap.e(var4, var5));
               ++var3;
               if (var3 > 50) {
                  try {
                     Thread.sleep(200L);
                  } catch (InterruptedException var7) {
                     var7.printStackTrace();
                  }
               }
            }
         }

         Service.getInstance().charMove(var0, var1);
         var2.he = System.currentTimeMillis();
         var2.cx = var2.ff = var0;
         var2.cy = var2.fg = var1;
         return true;
      }
   }

   public static boolean d(int var0, int var1) {
      if (var0 == -1) {
         var0 = ha.cx;
      }

      if (var1 == -1) {
         var1 = ha.cy;
      }

      int[] var2 = new int[2];
      return !TileMap.a(var0, var1, var2) ? false : c(var2[0], var2[1]);
   }

   public static void e(int var0, int var1) {
      int var4 = ha.cx;
      int var2 = Class_fa.e(var0 - var4) / 50;
      var4 = ha.cy;
      int var3 = Class_fa.e(var1 - var4) / 10;
      var4 = ha.cx;
      int var5 = ha.cy;
      if (var3 < 3) {
         Service.getInstance().charMove(ha.cx, var5 = var1 - 60);
         var3 = 3;
      }

      int var6;
      for(var6 = 0; var6 < var2; ++var6) {
         if (var0 > ha.cx) {
            var4 += 50;
         } else {
            var4 -= 50;
         }

         Service.getInstance().charMove(var4, var5);
      }

      Service.getInstance().charMove(var0, var5);

      for(var6 = 0; var6 < var3; ++var6) {
         if (var1 > ha.cy) {
            var5 += 10;
         } else {
            var5 -= 10;
         }

         Service.getInstance().charMove(var0, var5);
      }

      Service.getInstance().charMove(var0, var1);
      ha.he = System.currentTimeMillis();
      ha.cx = ha.ff = var0;
      ha.cy = ha.fg = var1;
   }
}
