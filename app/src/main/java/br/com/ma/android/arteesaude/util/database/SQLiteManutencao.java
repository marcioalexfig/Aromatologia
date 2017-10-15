package br.com.ma.android.arteesaude.util.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import br.com.ma.android.arteesaude.modelo.Base;
import br.com.ma.android.arteesaude.modelo.Embalagem;
import br.com.ma.android.arteesaude.modelo.Oleo;

/**
 * Created by alex on 12/10/17.
 */

public class SQLiteManutencao {

    private SQLiteDatabase banco = null;

    public SQLiteManutencao(SQLiteDatabase banco){
        this.banco = banco;
    }

    public void criarBanco(){
        //SQLiteDatabase banco = SQLiteDatabase.openOrCreateDatabase(NOME_BANCO, MODE, null);
    }

    public void criarTabelas(){
        //SQLiteDatabase banco = SQLiteDatabase.openOrCreateDatabase(NOME_BANCO, MODE, null);

        banco.execSQL("CREATE TABLE IF NOT EXISTS oleos (id INTEGER PRIMARY KEY autoincrement, desc TEXT, volume INTEGER, valor REAL)");
        banco.execSQL("CREATE TABLE IF NOT EXISTS embalagens (id INTEGER PRIMARY KEY autoincrement, desc TEXT, volume INTEGER, valor REAL)");
        banco.execSQL("CREATE TABLE IF NOT EXISTS bases (id INTEGER PRIMARY KEY autoincrement, desc TEXT, volume INTEGER, valor REAL)");
    }

    public void deletarTabelas(){
        //SQLiteDatabase banco = SQLiteDatabase.openOrCreateDatabase(NOME_BANCO, MODE, null);

        banco.execSQL("DROP TABLE IF EXISTS oleos");
        banco.execSQL("DROP TABLE IF EXISTS embalagens");
        banco.execSQL("DROP TABLE IF EXISTS bases");
    }

    public void carregarTabelas(){
        //SQLiteDatabase banco = SQLiteDatabase.openOrCreateDatabase(NOME_BANCO, MODE, null);

        //INICIO - OLEOS
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PETITGRAIN LIMÃO RUGOSO GT PERU')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL YLANG YLANG I GT CHINA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO RESINA COPAÍBA BRANCA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO RESINA DE COPAÍBA VERMELHA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE ROSA DE DAMASCO GT RUSSIA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE ACÁCIA DOCE')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE ACÁCIA MIMOSA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE AMENDOIM TORRADO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE ANGÉLICA (RAÍZES)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE ARNICA MONTANA 10%')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE AÇAFRÃO 10% GT FRANÇA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE AÇAFRÃO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE BAUNILHA 10%')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE BENJOIM DO SIÃO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE BÁLSAMO DO PERU')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE BÁLSAMO DO TOLU')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE CARDAMOMO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE CASSIS [GROSELHA NEGRA] 10%')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE CERA DE ABELHA 10%')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE CUMARU')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE FRANGIPANI [FLORES] 10%')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE FUNGHI PORCINI [COGUMELO]')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE JASMIM REAL 10%')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE JASMIM REAL GT INDIA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE JASMIM SAMBAC 10%')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE JASMIM SAMBAC')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE LAVANDA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE LÁDANO [CISTO]')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE LÓTUS BRANCO 10%')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE LÓTUS ROSA 10%')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE MATE')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE MIRRA INDIANA [GUGULLU]')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE MUSGO DE CARVALHO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE OSMANTHUS [FLORES] 10%')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE ROSA BULGÁRIA 10%')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE ROSA DE MAIO 10%')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE ROSA VERMELHA DA GÁLIA 10%')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE SEMPRE-VIVA IMMORTELLE 10% VAR ITALICA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE SEMPRE-VIVA IMMORTELLE VAR. ITALICA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE TABACO (PREMIUM)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE TURMÉRICO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE UVA BORDÔ [CASCAS COM SEMENTES]')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE VIOLETA 10%')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ABSOLUTO DE ÂMBAR [ESTORAQUE]')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL CIDRA [CASCA] GT BRASIL')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ABETO BALSÂMICO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ABETO DOUGLAS')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ABETO PRATA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ABETO SIBERIANO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ABSINTO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE AIPO [SEMENTES]')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE AJOWAN')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ALCARÁVIA [SEMENTES]')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ALECRIM (QT CINEOL)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ALECRIM (QT CINEOL)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ALECRIM (QT CÂNFORA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ALECRIM (QT VERBENONA) PREMIUM')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ALECRIM 25% DITERP. (CO2-TO) ORGÂNICO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ALECRIM DO CERRADO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ALECRIM PIMENTA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ALECRIM SELVAGEM')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ALHO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE AMÊNDOAS AMARGAS')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ANGÉLICA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ANIS ESTRELADO [SEMENTES]')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ARAÇÁ ROSA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ARBUSTO MENTA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ARRUDA 10% (DILUÍDA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ARTEMÍSIA BRANCA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ARTEMÍSIA DO NEPAL')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE AZALÉIA GIGANTE')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE BAY RUM')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE BERGAMOTA [PRENSADA] C. MARFIM')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE BERGAMOTA [PRENSADA] ITÁLIA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE BERGAMOTA (LFC)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE BREU BRANCO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE BREU PRETO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE BUDDHA WOOD [BUDDAHAWOOD]')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE BÉTULA BRANCA GT RÚSSIA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE BÉTULA DOCE')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CABREUVA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CAFÉ TORRADO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CAJEPUT (QT CINEOL)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CALÊNDULA (CO2-TO)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CAMARÁ LANTANA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CAMOMILA ALEMÃ (CO2-SE)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CAMOMILA AZUL [ALEMÃ] 10% (DILUÍDA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CAMOMILA AZUL PREMIUM 10% DE CAMAZULENO GT ING. PURA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CAMOMILA ROMANA 10% (DILUÍDA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CANELA DA CHINA [CASCAS]')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CANELA DO CEILÃO [FOLHAS] (QT EUGENOL)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CANELA DO CEILÃO CO2 TO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CANELA DO HIMALAIA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CANELA DO NEPAL')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CAPE MAY')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CAPIM CAMELO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CAPIM GENGIBRE')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CAPIM LIMÃO (VAR. CIDREIRA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CAPIM LIMÃO - GIGANTE')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CARDAMOMO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CARDAMOMO (HIDRODIFUSO)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CARQUEJA AMARGA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CATAIA QT EUGENOL')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CEBOLA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CEDRO CANJERANA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CEDRO DA VIRGÍNIA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CEDRO DO ATLAS')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CEDRO DO HIMALAIA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CEDRO DO TEXAS')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CEDRO VERMELHO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CENOURA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CIPRESTE AZUL')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CIPRESTE EUROPEU')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CIPRESTE LUSITÂNICA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CIPÓ MIL HOMENS')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CISTO (LÁDANO)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CITRONELA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE COENTRO (PLANTA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE COENTRO (SEMENTES)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE COLÔNIA DE JAVA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE COMINHO (SEMENTES)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE COMINHO NEGRO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CONHAQUE VERDE')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE COPAÍBA BRANCA (DESTILADA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CRAVO (BOTÕES)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CRAVO (FOLHAS)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CROTON')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CUBEBA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CURRY')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CÁLAMO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE CÂNFORA BRANCA [1ª FRAÇÃO]')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE DAVANA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ELEMI')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ENDRO (PLANTA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ENDRO (SEMENTES)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ERIGERON')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ERVA BALEEIRA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ERVA DOCE')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ESPRUCE BRANCO (TSUGA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ESPRUCE NEGRO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ESTRAGÃO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE EUCALIPTO CIDREIRA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE EUCALIPTO CITRIODORA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE EUCALIPTO GLOBULUS 80/85')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE EUCALIPTO GRANDIS')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE EUCALIPTO HORTELÃ QT PIPERITONA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE EUCALIPTO RADIATA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE EUCALIPTO ROBUSTA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE FAMONTY')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE FENO GREGO (CO2-SE)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE FLOR DAS ALMAS (FLOR DOS FINADOS)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE FRAGÔNIA (AGONIS)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE FUNCHO DOCE')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE GATÁRIA (CATNIP)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE GENGIBRE')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE GENGIBRE (CO2-TO)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE GENGIBRE (HIDRODIFUSO)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE GERÂNIO BOURBON')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE GERÂNIO GT CHINA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE GERÂNIO GT ÁFRICA DO SUL')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE GERÂNIO ROSA (SELVAGEM)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE GERÂNIO ZDRAVETZ')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE GRAPEFRUIT ROSA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE GURJAN QT COPAENO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE GÁLBANO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE GÁLBANO (CO2-SE)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE HINOKI OURO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE HINOKI PRATA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE HIPÉRICO 10% (DILUÍDO)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE HISSOPO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE HO WOOD')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE HORTELÃ DÁGUA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE HORTELÃ DO CAMPO (MENTA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE HORTELÃ LIMÃO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE HORTELÃ PIMENTA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE HORTELÃ VERDE')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE IMBUIA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE JASMIM DOS POETAS 10% (CO2)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE JUNÍPERO (BAGAS)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE JUNÍPERO (CO2-SE)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE JUNÍPERO (FOLHAS)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE KATRAFAY - [KATAFRAY]')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE KHELLA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE KHUNU MUÑA (ORÉGANO-DOS-ANDES) GT PERU')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE KUNZEA BRANCA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LANYANA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LARANJA AMARGA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LARANJA DOCE (PERA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LARANJA DOCE (VALÊNCIA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LARANJA DOCE LFC (PERA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LARANJA SANGUÍNEA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LAVANDA 40/42')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LAVANDA ALGODÃO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LAVANDA BUENA VISTA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LAVANDA DENTATA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LAVANDA FINA (BULGÁRIA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LAVANDA FINA (FRANÇA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LAVANDA INGLESA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LAVANDA SPIKE')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LAVANDIM ABRIALIS')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LAVANDIM DA PATAGÔNIA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LAVANDIM GROSSO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LELESHWA GT KÊNIA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LEVÍSTICO (FOLHAS)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LIMA DA PÉRSIA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LIMA MEXICANA (DESTILADA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LIMA TAHITI')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LIMÃO SICILIANO (LFC)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LIMÃO SICILIANO (MADURO)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LIMÃO SICILIANO (VERDE)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LITSEA CUBEBA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LOURO (FOLHAS)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LÍRIO DO BREJO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE LÍRIO DO BREJO (CO2)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MACE')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MACELA DO CAMPO 10%')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MADEIRA DO SIÃO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MAGNÓLIA (FLORES)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MANDARINA (VERDE)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MANDARINA AMARELA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MANDARINA VERMELHA (LFC)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MANDARINA VERMELHA (MADURA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MANIGUETTE FINA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MANJERICÃO ANIS GT BRASIL')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MANJERICÃO EXÓTICO QT MENTIL CAVICOL')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MANJERICÃO LIMÃO (QT CITRAL)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MANJERICÃO SANTO (TULASI)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MANJERICÃO VERDE PREMIUM QT LINALOL')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MANJERICÃO VERDE QT LINALOL')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MANJERONA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MANJERONA SILVESTRE')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MANUKA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MASTIC LENTISCO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MATICO (FALSO JABORANDI) GT PERU')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MENTRASTO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MILEFÓLIO AZUL')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MIRRA DARK')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MIRRA LIGHT (KÊNIA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MONARDA ROSA (QT GERANIAL)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MONARDA VERMELHA (QT TIMOL)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MURTA (QT CINEOL)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MURTA DOS ANDES (ARRAYÁN) GT PERU')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MUSK AMBRETO (CO2-SE)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE MUÑA (POEJO DOS ANDES) GT PERU')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE NARDO VERDE')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE NARDO VERMELHO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE NIAOULI (QT CINEOL)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE NOOTKA TREE')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE NOZ MOSCADA - INDONÉSIA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE NÉROLI (FLOR DE LARANJEIRA) GT TUNISIA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE NÉROLI 10% GT TUNÍSIA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE OLÍBANO DA ÍNDIA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE OLÍBANO DO DESERTO (CARTERI)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE OLÍBANO SAGRADO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE OLÍBANO SELVAGEM VAR. FREREANA (CO2-SE)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE OPOPONAX (MIRRA DOCE)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ORÉGANO QT CARVACROL')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PALMAROSA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PALO PICHE')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PARAMELA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PARAMELA 10% (DILUÍDA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PARIPAROBA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PATCHOULI (CO2)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PATCHOULI (DARK)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PATCHOULI (LIGHT)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PATCHOULI (OLD)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PAU SANTO DOS INCAS')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PAU SANTO GUAIACO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PETITGRAIN - LIMA DA PÉRSIA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PETITGRAIN - LIMÃO CAPETA (CRAVO)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PETITGRAIN DE LARANJA AMARGA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PETITGRAIN DE LIMA KAFFIR')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PETITGRAIN POMELO GT PERU')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PIMENTA DA JAMAICA (FRUTOS)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PIMENTA MALAGUETA (CO2-TO)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PIMENTA NEGRA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PIMENTA NEGRA (CO2)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PIMENTA ROSA (AROEIRA FRUTOS)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PINDAÍBA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PINHEIRO AMARELO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PINHEIRO SILVESTRE')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PLAI (GENGIBRE CASSUMUNAR)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE POEJO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PRIPRIOCA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE PÊSSEGO (FOLHAS)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE RAVENSARA (AROMÁTICA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE RAVENSARA ANISATA [MADEIRA]')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE RAVINTSARA QT CINEOL')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ROSA DE DAMASCO 10% (DILUÍDA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ROSA DE DAMASCO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SALSA (SEMENTES)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SALSA PLANTA (QT BAIXO APIOL)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SALSAPARRILHA 20% (CO2)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SANGUE DE DRAGÃO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SARO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SEGURELHA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SEMPRE-VIVA FÊMEA (RAMBIAZANA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SEMPRE-VIVA IMMORTELE')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SEMPRE-VIVA IMMORTELE 10%')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SEMPRE-VIVA MACHO (BRACTEIFERUM)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SUCUPIRA BRANCA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SÁLVIA DALMACIANA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SÁLVIA ESCLARÉIA 3/4 (ALTO TEOR DE ESCLAREOL)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SÁLVIA ESCLARÉIA GT RÚSSIA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SÁLVIA ESPANHOLA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SÂNDALO AFRICANO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SÂNDALO AMYRIS')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SÂNDALO MYSORE (CO2-SE)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SÂNDALO MYSORE (MADEIRA)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SÂNDALO MYSORE (MADEIRA) 10%')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SÂNDALO MYSORE 10% (CO2-SE)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE SÂNDALO PAPUA GT NOVA GUINÉ')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE TANA (ISSA) FOLHAS GT MADAGASCAR')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE TANACETO AZUL')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE TANGERINA (PONKAN)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE TEA TREE (QT TERPINEN-4-OL) GT AUSTRÁLIA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE TEA TREE (QT TERPINEN-4-OL) GT BRASIL.')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE TEA TREE LAVANDA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE TEA TREE LIMÃO')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE TOMILHO (QT LINALOL)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE TOMILHO (QT TUIANOL)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE TOMILHO BRANCO (QT TIMOL)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE TOMILHO SERPOLET')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE TUIA MAÇÃ')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE TURMÉRICO (RIZOMAS)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE VERBENA BRANCA (QT LINALOL)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE VERBENA LIMÃO (CEDRÓN) GT PERU')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE VETIVER GT HAITI')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE VETIVER INDONÉSIA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE VITEX (PIMENTA DO MONGE)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE WINTERGREEN')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE XANTOXILUM [PIMENTA SICHUAN]')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE YLANG YLANG COMPLETO - INDONÉSIA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE YLANG YLANG COMPLETO - MADAGASCAR')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE YLANG YLANG EXTRA- INDONÉSIA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE YLANG YLANG III (3ª FRAÇÃO)')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE YUZU')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL DE ZINZIBA GT ÁFRICA DO SUL')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO ESSENCIAL HORTELÃ BRANCA')");
        banco.execSQL("INSERT INTO oleos (desc) VALUES ('ÓLEO VEGETAL DE CAFÉ VERDE')");
        //FIM - OLEOS

        //INICIO - EMBALAGENS
        banco.execSQL("INSERT INTO embalagens (desc, volume, valor) VALUES ('Vidro Conta Gotas', 5, 1)");
        banco.execSQL("INSERT INTO embalagens (desc, volume, valor) VALUES ('Plástico Conta Gotas', 10, 2)");
        banco.execSQL("INSERT INTO embalagens (desc, volume, valor) VALUES ('Vidro roll-on', 10, 2)");
        banco.execSQL("INSERT INTO embalagens (desc, volume, valor) VALUES ('Pástico roll-on', 5, 1)");
        //FIM - EMBALAGENS

        //INICIO - BASES
        banco.execSQL("INSERT INTO bases (desc) VALUES ('ÓLEO VEGETAL DE AMÊNDOAS DOCES')");
        banco.execSQL("INSERT INTO bases (desc) VALUES ('ÓLEO VEGETAL DE ANDIROBA')");
        banco.execSQL("INSERT INTO bases (desc) VALUES ('ÓLEO VEGETAL DE ARGAN')");
        banco.execSQL("INSERT INTO bases (desc) VALUES ('ÓLEO VEGETAL DE AVELÃ')");
        banco.execSQL("INSERT INTO bases (desc) VALUES ('ÓLEO VEGETAL DE BURITI')");
        banco.execSQL("INSERT INTO bases (desc) VALUES ('ÓLEO VEGETAL DE COCO (PALMISTE)')");
        banco.execSQL("INSERT INTO bases (desc) VALUES ('ÓLEO VEGETAL DE GERGELIM')");
        banco.execSQL("INSERT INTO bases (desc) VALUES ('ÓLEO VEGETAL DE GIRASSOL')");
        banco.execSQL("INSERT INTO bases (desc) VALUES ('ÓLEO VEGETAL DE GROSELHA NEGRA')");
        banco.execSQL("INSERT INTO bases (desc) VALUES ('ÓLEO VEGETAL DE LINHAÇA')");
        banco.execSQL("INSERT INTO bases (desc) VALUES ('ÓLEO VEGETAL DE MACADÂMIA')");
        banco.execSQL("INSERT INTO bases (desc) VALUES ('ÓLEO VEGETAL DE MARACUJÁ')");
        banco.execSQL("INSERT INTO bases (desc) VALUES ('ÓLEO VEGETAL DE NEEM')");
        banco.execSQL("INSERT INTO bases (desc) VALUES ('ÓLEO VEGETAL DE PRACAXI')");
        banco.execSQL("INSERT INTO bases (desc) VALUES ('ÓLEO VEGETAL DE ROSA MOSQUETA')");
        banco.execSQL("INSERT INTO bases (desc) VALUES ('ÓLEO VEGETAL DE RÍCINO (MAMONA)')");
        banco.execSQL("INSERT INTO bases (desc) VALUES ('ÓLEO VEGETAL DE SEMENTE DE UVA')");
        banco.execSQL("INSERT INTO bases (desc) VALUES ('ÓLEO VEGETAL DE URUCUM')");
        banco.execSQL("INSERT INTO bases (desc) VALUES ('ÓLEO VEGETAL MASOL')");
        banco.execSQL("INSERT INTO bases (desc) VALUES ('ÓLEO VEGETAL SEMENTE DE ABÓBORA')");
        //FIM - BASES

    }

    /**
     * Deleta o conteudos de bases
     */
    public void limparTabelas(){
        //SQLiteDatabase banco = SQLiteDatabase.openOrCreateDatabase(NOME_BANCO, MODE, null);
        banco.execSQL("DELETE FROM oleos");
        banco.execSQL("DELETE FROM embalagens");
        banco.execSQL("DELETE FROM bases");
    }

    /**
     * Método que faz a leitura e impressão de todos os dados das tabelas do banco
     */
    public void imprimeDados(){
        //SQLiteDatabase banco = SQLiteDatabase.openOrCreateDatabase(NOME_BANCO, MODE, null);

        Cursor cursor = null;

        // OLEOS ------------------------
        cursor = banco.rawQuery("SELECT id, desc, volume, valor FROM oleos", null);
        int indiceColunaIdOL = cursor.getColumnIndex("id");
        int indiceColunaDescOL = cursor.getColumnIndex("desc");
        int indiceColunaVolumeOL = cursor.getColumnIndex("volume");
        int indiceColunaValorOL = cursor.getColumnIndex("valor");


        List<Oleo> oleos = new ArrayList<>();
        if (cursor!=null) {
            if (cursor.moveToFirst()){
                do {
                    Oleo oleo = new Oleo(
                            cursor.getInt(indiceColunaIdOL),
                            cursor.getString(indiceColunaDescOL),
                            cursor.getInt(indiceColunaVolumeOL),
                            cursor.getFloat(indiceColunaValorOL)
                    );
                    oleos.add(oleo);
                } while (cursor.moveToNext());
            }
        }
        Log.i("OLEOS ########################",oleos.toString());


        //EMBALAGENS -------------------
        cursor = banco.rawQuery("SELECT id, desc, volume, valor FROM embalagens", null);
        int indiceColunaIdEM = cursor.getColumnIndex("id");
        int indiceColunaDescEM = cursor.getColumnIndex("desc");
        int indiceColunaVolumeEM = cursor.getColumnIndex("volume");
        int indiceColunaValorEM = cursor.getColumnIndex("valor");


        List<Embalagem> embalagens = new ArrayList<>();
        if (cursor!=null) {
            if (cursor.moveToFirst()){
                do {
                    Embalagem embalagem = new Embalagem(
                            cursor.getInt(indiceColunaIdEM),
                            cursor.getString(indiceColunaDescEM),
                            cursor.getInt(indiceColunaVolumeEM),
                            cursor.getFloat(indiceColunaValorEM)
                    );
                    embalagens.add(embalagem);
                } while (cursor.moveToNext());
            }
        }

        Log.i("EMBALAGENS ########################",embalagens.toString());

        //BASES ------------------
        cursor = banco.rawQuery("SELECT id, desc, volume, valor FROM bases", null);
        int indiceColunaIdBA = cursor.getColumnIndex("id");
        int indiceColunaDescBA = cursor.getColumnIndex("desc");
        int indiceColunaVolumeBA = cursor.getColumnIndex("volume");
        int indiceColunaValorBA = cursor.getColumnIndex("valor");

        List<Base> bases = new ArrayList<>();
        if (cursor!=null) {
            if (cursor.moveToFirst()){
                do {
                    Base base = new Base(
                            cursor.getInt(indiceColunaIdBA),
                            cursor.getString(indiceColunaDescBA),
                            cursor.getInt(indiceColunaVolumeBA),
                            cursor.getFloat(indiceColunaValorBA)
                    );
                    bases.add(base);
                } while (cursor.moveToNext());
            }
        }

        Log.i("BASES ########################",bases.toString());

    }


    public void executar() {
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        try {
                            deletarTabelas();
                            criarTabelas();
                            //sql.limparTabelas();
                            carregarTabelas();
                            imprimeDados();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                }

        ).run();
    }

    public List<Oleo> retornaOleos(){
        Cursor cursor = null;

        // OLEOS ------------------------
        cursor = banco.rawQuery("SELECT id, desc, volume, valor FROM oleos", null);
        int indiceColunaIdOL = cursor.getColumnIndex("id");
        int indiceColunaDescOL = cursor.getColumnIndex("desc");
        int indiceColunaVolumeOL = cursor.getColumnIndex("volume");
        int indiceColunaValorOL = cursor.getColumnIndex("valor");


        List<Oleo> oleos = new ArrayList<>();
        if (cursor!=null) {
            if (cursor.moveToFirst()){
                do {
                    Oleo oleo = new Oleo(
                            cursor.getInt(indiceColunaIdOL),
                            cursor.getString(indiceColunaDescOL),
                            cursor.getInt(indiceColunaVolumeOL),
                            cursor.getFloat(indiceColunaValorOL)
                    );
                    oleos.add(oleo);
                } while (cursor.moveToNext());
            }
        }
        return oleos;
    }

    public List<String> retornaDescricaoOleos(){
        Cursor cursor = null;

        // OLEOS ------------------------
        cursor = banco.rawQuery("SELECT desc FROM oleos", null);
        int indiceColunaDescOL = cursor.getColumnIndex("desc");
        List<String> descOleos = new ArrayList<>();
        if (cursor!=null) {
            if (cursor.moveToFirst()){
                do {
                    descOleos.add(cursor.getString(indiceColunaDescOL));
                } while (cursor.moveToNext());
            }
        }
        return descOleos;
    }

}
