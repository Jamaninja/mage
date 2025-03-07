package mage.sets;

import mage.cards.Card;
import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;
import mage.util.RandomUtil;
import mage.cards.repository.CardCriteria;
import mage.cards.repository.CardRepository;
import mage.collation.BoosterCollator;
import mage.collation.BoosterStructure;
import mage.collation.CardRun;
import mage.collation.RarityConfiguration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TheElk801
 */
public final class MarchOfTheMachine extends ExpansionSet {

    private static final MarchOfTheMachine instance = new MarchOfTheMachine();

    public static MarchOfTheMachine getInstance() {
        return instance;
    }

    private MarchOfTheMachine() {
        super("March of the Machine", "MOM", ExpansionSet.buildDate(2023, 4, 21), SetType.EXPANSION);
        this.blockName = "March of the Machine";
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.numBoosterSpecial = 1; // Multiverse Legends
        this.ratioBoosterMythic = 7;
        this.numBoosterDoubleFaced = -1;
        this.maxCardNumberInBooster = 291;

        cards.add(new SetCardInfo("Aerial Boost", 2, Rarity.COMMON, mage.cards.a.AerialBoost.class));
        cards.add(new SetCardInfo("Aetherblade Agent", 88, Rarity.COMMON, mage.cards.a.AetherbladeAgent.class));
        cards.add(new SetCardInfo("Aetherwing, Golden-Scale Flagship", 234, Rarity.UNCOMMON, mage.cards.a.AetherwingGoldenScaleFlagship.class));
        cards.add(new SetCardInfo("Akki Scrapchomper", 130, Rarity.COMMON, mage.cards.a.AkkiScrapchomper.class));
        cards.add(new SetCardInfo("Alabaster Host Intercessor", 3, Rarity.COMMON, mage.cards.a.AlabasterHostIntercessor.class));
        cards.add(new SetCardInfo("Alabaster Host Sanctifier", 4, Rarity.COMMON, mage.cards.a.AlabasterHostSanctifier.class));
        cards.add(new SetCardInfo("Ancient Imperiosaur", 174, Rarity.RARE, mage.cards.a.AncientImperiosaur.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ancient Imperiosaur", 368, Rarity.RARE, mage.cards.a.AncientImperiosaur.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Angelic Intervention", 5, Rarity.COMMON, mage.cards.a.AngelicIntervention.class));
        cards.add(new SetCardInfo("Arachnoid Adaptation", 175, Rarity.COMMON, mage.cards.a.ArachnoidAdaptation.class));
        cards.add(new SetCardInfo("Archangel Elspeth", 320, Rarity.MYTHIC, mage.cards.a.ArchangelElspeth.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Archangel Elspeth", 6, Rarity.MYTHIC, mage.cards.a.ArchangelElspeth.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Archpriest of Shadows", 356, Rarity.RARE, mage.cards.a.ArchpriestOfShadows.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Archpriest of Shadows", 89, Rarity.RARE, mage.cards.a.ArchpriestOfShadows.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Artistic Refusal", 46, Rarity.UNCOMMON, mage.cards.a.ArtisticRefusal.class));
        cards.add(new SetCardInfo("Ashen Reaper", 232, Rarity.UNCOMMON, mage.cards.a.AshenReaper.class));
        cards.add(new SetCardInfo("Assimilate Essence", 47, Rarity.COMMON, mage.cards.a.AssimilateEssence.class));
        cards.add(new SetCardInfo("Astral Wingspan", 48, Rarity.UNCOMMON, mage.cards.a.AstralWingspan.class));
        cards.add(new SetCardInfo("Atraxa's Fall", 176, Rarity.COMMON, mage.cards.a.AtraxasFall.class));
        cards.add(new SetCardInfo("Attentive Skywarden", 7, Rarity.COMMON, mage.cards.a.AttentiveSkywarden.class));
        cards.add(new SetCardInfo("Awaken the Maelstrom", 230, Rarity.RARE, mage.cards.a.AwakenTheMaelstrom.class));
        cards.add(new SetCardInfo("Awakened Skyclave", 194, Rarity.UNCOMMON, mage.cards.a.AwakenedSkyclave.class));
        cards.add(new SetCardInfo("Axgard Artisan", 332, Rarity.UNCOMMON, mage.cards.a.AxgardArtisan.class));
        cards.add(new SetCardInfo("Ayara, Furnace Queen", 296, Rarity.RARE, mage.cards.a.AyaraFurnaceQueen.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ayara, Furnace Queen", 90, Rarity.RARE, mage.cards.a.AyaraFurnaceQueen.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ayara, Widow of the Realm", 296, Rarity.RARE, mage.cards.a.AyaraWidowOfTheRealm.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ayara, Widow of the Realm", 90, Rarity.RARE, mage.cards.a.AyaraWidowOfTheRealm.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Baral and Kari Zev", 218, Rarity.RARE, mage.cards.b.BaralAndKariZev.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Baral and Kari Zev", 302, Rarity.RARE, mage.cards.b.BaralAndKariZev.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Beamtown Beatstick", 131, Rarity.COMMON, mage.cards.b.BeamtownBeatstick.class));
        cards.add(new SetCardInfo("Belenon War Anthem", 20, Rarity.UNCOMMON, mage.cards.b.BelenonWarAnthem.class));
        cards.add(new SetCardInfo("Belligerent Regisaur", 191, Rarity.RARE, mage.cards.b.BelligerentRegisaur.class));
        cards.add(new SetCardInfo("Bladed Battle-Fan", 91, Rarity.COMMON, mage.cards.b.BladedBattleFan.class));
        cards.add(new SetCardInfo("Blighted Burgeoning", 177, Rarity.COMMON, mage.cards.b.BlightedBurgeoning.class));
        cards.add(new SetCardInfo("Blightreaper Thallid", 92, Rarity.UNCOMMON, mage.cards.b.BlightreaperThallid.class));
        cards.add(new SetCardInfo("Blightsower Thallid", 92, Rarity.UNCOMMON, mage.cards.b.BlightsowerThallid.class));
        cards.add(new SetCardInfo("Bloated Processor", 357, Rarity.RARE, mage.cards.b.BloatedProcessor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bloated Processor", 93, Rarity.RARE, mage.cards.b.BloatedProcessor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bloodfeather Phoenix", 132, Rarity.RARE, mage.cards.b.BloodfeatherPhoenix.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bloodfeather Phoenix", 362, Rarity.RARE, mage.cards.b.BloodfeatherPhoenix.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bloodfell Caves", 267, Rarity.COMMON, mage.cards.b.BloodfellCaves.class));
        cards.add(new SetCardInfo("Bloomwielder Dryads", 237, Rarity.UNCOMMON, mage.cards.b.BloomwielderDryads.class));
        cards.add(new SetCardInfo("Blossoming Sands", 268, Rarity.COMMON, mage.cards.b.BlossomingSands.class));
        cards.add(new SetCardInfo("Bola Slinger", 8, Rarity.COMMON, mage.cards.b.BolaSlinger.class));
        cards.add(new SetCardInfo("Bonded Herdbeast", 178, Rarity.COMMON, mage.cards.b.BondedHerdbeast.class));
        cards.add(new SetCardInfo("Boon-Bringer Valkyrie", 343, Rarity.RARE, mage.cards.b.BoonBringerValkyrie.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Boon-Bringer Valkyrie", 9, Rarity.RARE, mage.cards.b.BoonBringerValkyrie.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Borborygmos and Fblthp", 219, Rarity.MYTHIC, mage.cards.b.BorborygmosAndFblthp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Borborygmos and Fblthp", 303, Rarity.MYTHIC, mage.cards.b.BorborygmosAndFblthp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Botanical Brawler", 220, Rarity.UNCOMMON, mage.cards.b.BotanicalBrawler.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Botanical Brawler", 384, Rarity.UNCOMMON, mage.cards.b.BotanicalBrawler.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Breach the Multiverse", 358, Rarity.RARE, mage.cards.b.BreachTheMultiverse.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Breach the Multiverse", 94, Rarity.RARE, mage.cards.b.BreachTheMultiverse.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Burning Sun's Fury", 133, Rarity.COMMON, mage.cards.b.BurningSunsFury.class));
        cards.add(new SetCardInfo("Burnished Dunestomper", 43, Rarity.COMMON, mage.cards.b.BurnishedDunestomper.class));
        cards.add(new SetCardInfo("Caetus, Sea Tyrant of Segovia", 63, Rarity.RARE, mage.cards.c.CaetusSeaTyrantOfSegovia.class));
        cards.add(new SetCardInfo("Captive Weird", 49, Rarity.UNCOMMON, mage.cards.c.CaptiveWeird.class));
        cards.add(new SetCardInfo("Chandra, Hope's Beacon", 134, Rarity.MYTHIC, mage.cards.c.ChandraHopesBeacon.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Chandra, Hope's Beacon", 321, Rarity.MYTHIC, mage.cards.c.ChandraHopesBeacon.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Change the Equation", 50, Rarity.UNCOMMON, mage.cards.c.ChangeTheEquation.class));
        cards.add(new SetCardInfo("Chomping Kavu", 179, Rarity.COMMON, mage.cards.c.ChompingKavu.class));
        cards.add(new SetCardInfo("Chrome Host Hulk", 188, Rarity.UNCOMMON, mage.cards.c.ChromeHostHulk.class));
        cards.add(new SetCardInfo("Chrome Host Seedshark", 350, Rarity.RARE, mage.cards.c.ChromeHostSeedshark.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Chrome Host Seedshark", 51, Rarity.RARE, mage.cards.c.ChromeHostSeedshark.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("City on Fire", 135, Rarity.RARE, mage.cards.c.CityOnFire.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("City on Fire", 363, Rarity.RARE, mage.cards.c.CityOnFire.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Collective Nightmare", 95, Rarity.UNCOMMON, mage.cards.c.CollectiveNightmare.class));
        cards.add(new SetCardInfo("Coming In Hot", 136, Rarity.COMMON, mage.cards.c.ComingInHot.class));
        cards.add(new SetCardInfo("Compleated Conjurer", 49, Rarity.UNCOMMON, mage.cards.c.CompleatedConjurer.class));
        cards.add(new SetCardInfo("Compleated Huntmaster", 96, Rarity.UNCOMMON, mage.cards.c.CompleatedHuntmaster.class));
        cards.add(new SetCardInfo("Complete the Circuit", 351, Rarity.RARE, mage.cards.c.CompleteTheCircuit.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Complete the Circuit", 52, Rarity.RARE, mage.cards.c.CompleteTheCircuit.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Consuming Aetherborn", 97, Rarity.COMMON, mage.cards.c.ConsumingAetherborn.class));
        cards.add(new SetCardInfo("Converter Beast", 180, Rarity.COMMON, mage.cards.c.ConverterBeast.class));
        cards.add(new SetCardInfo("Copper Host Crusher", 181, Rarity.UNCOMMON, mage.cards.c.CopperHostCrusher.class));
        cards.add(new SetCardInfo("Corrupted Conviction", 98, Rarity.COMMON, mage.cards.c.CorruptedConviction.class));
        cards.add(new SetCardInfo("Corruption of Towashi", 53, Rarity.UNCOMMON, mage.cards.c.CorruptionOfTowashi.class));
        cards.add(new SetCardInfo("Cosmic Hunger", 182, Rarity.COMMON, mage.cards.c.CosmicHunger.class));
        cards.add(new SetCardInfo("Cragsmasher Yeti", 333, Rarity.COMMON, mage.cards.c.CragsmasherYeti.class));
        cards.add(new SetCardInfo("Crystal Carapace", 183, Rarity.COMMON, mage.cards.c.CrystalCarapace.class));
        cards.add(new SetCardInfo("Cut Short", 10, Rarity.COMMON, mage.cards.c.CutShort.class));
        cards.add(new SetCardInfo("Deadly Derision", 99, Rarity.COMMON, mage.cards.d.DeadlyDerision.class));
        cards.add(new SetCardInfo("Deeproot Wayfinder", 184, Rarity.RARE, mage.cards.d.DeeprootWayfinder.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Deeproot Wayfinder", 369, Rarity.RARE, mage.cards.d.DeeprootWayfinder.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Defiant Thundermaw", 149, Rarity.MYTHIC, mage.cards.d.DefiantThundermaw.class));
        cards.add(new SetCardInfo("Deluge of the Dead", 115, Rarity.MYTHIC, mage.cards.d.DelugeOfTheDead.class));
        cards.add(new SetCardInfo("Disciples of the Inferno", 148, Rarity.UNCOMMON, mage.cards.d.DisciplesOfTheInferno.class));
        cards.add(new SetCardInfo("Dismal Backwater", 269, Rarity.COMMON, mage.cards.d.DismalBackwater.class));
        cards.add(new SetCardInfo("Disturbing Conversion", 54, Rarity.COMMON, mage.cards.d.DisturbingConversion.class));
        cards.add(new SetCardInfo("Djeru and Hazoret", 221, Rarity.RARE, mage.cards.d.DjeruAndHazoret.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Djeru and Hazoret", 304, Rarity.RARE, mage.cards.d.DjeruAndHazoret.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Doomskar Warrior", 185, Rarity.RARE, mage.cards.d.DoomskarWarrior.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Doomskar Warrior", 370, Rarity.RARE, mage.cards.d.DoomskarWarrior.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Drana and Linvala", 222, Rarity.RARE, mage.cards.d.DranaAndLinvala.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Drana and Linvala", 305, Rarity.RARE, mage.cards.d.DranaAndLinvala.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Dreg Recycler", 100, Rarity.COMMON, mage.cards.d.DregRecycler.class));
        cards.add(new SetCardInfo("Dusk Legion Duelist", 11, Rarity.RARE, mage.cards.d.DuskLegionDuelist.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Dusk Legion Duelist", 344, Rarity.RARE, mage.cards.d.DuskLegionDuelist.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elesh Norn", 12, Rarity.MYTHIC, mage.cards.e.EleshNorn.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elesh Norn", 292, Rarity.MYTHIC, mage.cards.e.EleshNorn.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elesh Norn", 338, Rarity.MYTHIC, mage.cards.e.EleshNorn.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elspeth's Smite", 13, Rarity.UNCOMMON, mage.cards.e.ElspethsSmite.class));
        cards.add(new SetCardInfo("Elvish Vatkeeper", 223, Rarity.UNCOMMON, mage.cards.e.ElvishVatkeeper.class));
        cards.add(new SetCardInfo("Enduring Bondwarden", 14, Rarity.COMMON, mage.cards.e.EnduringBondwarden.class));
        cards.add(new SetCardInfo("Ephara's Dispersal", 55, Rarity.COMMON, mage.cards.e.EpharasDispersal.class));
        cards.add(new SetCardInfo("Ephara, Ever-Sheltering", 23, Rarity.RARE, mage.cards.e.EpharaEverSheltering.class));
        cards.add(new SetCardInfo("Errant and Giada", 224, Rarity.RARE, mage.cards.e.ErrantAndGiada.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Errant and Giada", 306, Rarity.RARE, mage.cards.e.ErrantAndGiada.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Essence of Orthodoxy", 323, Rarity.RARE, mage.cards.e.EssenceOfOrthodoxy.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Essence of Orthodoxy", 376, Rarity.RARE, mage.cards.e.EssenceOfOrthodoxy.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Etali, Primal Conqueror", 137, Rarity.RARE, mage.cards.e.EtaliPrimalConqueror.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Etali, Primal Conqueror", 298, Rarity.RARE, mage.cards.e.EtaliPrimalConqueror.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Etali, Primal Sickness", 137, Rarity.RARE, mage.cards.e.EtaliPrimalSickness.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Etali, Primal Sickness", 298, Rarity.RARE, mage.cards.e.EtaliPrimalSickness.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Etched Familiar", 101, Rarity.COMMON, mage.cards.e.EtchedFamiliar.class));
        cards.add(new SetCardInfo("Etched Host Doombringer", 102, Rarity.COMMON, mage.cards.e.EtchedHostDoombringer.class));
        cards.add(new SetCardInfo("Expedition Lookout", 56, Rarity.COMMON, mage.cards.e.ExpeditionLookout.class));
        cards.add(new SetCardInfo("Eyes of Gitaxias", 57, Rarity.COMMON, mage.cards.e.EyesOfGitaxias.class));
        cards.add(new SetCardInfo("Faerie Mastermind", 352, Rarity.RARE, mage.cards.f.FaerieMastermind.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Faerie Mastermind", 58, Rarity.RARE, mage.cards.f.FaerieMastermind.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Failed Conversion", 103, Rarity.COMMON, mage.cards.f.FailedConversion.class));
        cards.add(new SetCardInfo("Fairgrounds Trumpeter", 335, Rarity.COMMON, mage.cards.f.FairgroundsTrumpeter.class));
        cards.add(new SetCardInfo("Fearless Skald", 138, Rarity.UNCOMMON, mage.cards.f.FearlessSkald.class));
        cards.add(new SetCardInfo("Fertilid's Favor", 186, Rarity.COMMON, mage.cards.f.FertilidsFavor.class));
        cards.add(new SetCardInfo("Final Flourish", 104, Rarity.COMMON, mage.cards.f.FinalFlourish.class));
        cards.add(new SetCardInfo("Flitting Guerrilla", 105, Rarity.COMMON, mage.cards.f.FlittingGuerrilla.class));
        cards.add(new SetCardInfo("Flywheel Racer", 259, Rarity.COMMON, mage.cards.f.FlywheelRacer.class));
        cards.add(new SetCardInfo("Forest", 281, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 290, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Forest", 291, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Furnace Gremlin", 139, Rarity.UNCOMMON, mage.cards.f.FurnaceGremlin.class));
        cards.add(new SetCardInfo("Furnace Host Charger", 140, Rarity.COMMON, mage.cards.f.FurnaceHostCharger.class));
        cards.add(new SetCardInfo("Furnace Reins", 141, Rarity.UNCOMMON, mage.cards.f.FurnaceReins.class));
        cards.add(new SetCardInfo("Furnace-Blessed Conqueror", 38, Rarity.UNCOMMON, mage.cards.f.FurnaceBlessedConqueror.class));
        cards.add(new SetCardInfo("Furtive Analyst", 59, Rarity.COMMON, mage.cards.f.FurtiveAnalyst.class));
        cards.add(new SetCardInfo("Gargantuan Slabhorn", 240, Rarity.UNCOMMON, mage.cards.g.GargantuanSlabhorn.class));
        cards.add(new SetCardInfo("Ghalta and Mavren", 225, Rarity.RARE, mage.cards.g.GhaltaAndMavren.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ghalta and Mavren", 307, Rarity.RARE, mage.cards.g.GhaltaAndMavren.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ghalta and Mavren", 386, Rarity.RARE, mage.cards.g.GhaltaAndMavren.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Gift of Compleation", 106, Rarity.UNCOMMON, mage.cards.g.GiftOfCompleation.class));
        cards.add(new SetCardInfo("Gitaxian Mindstinger", 88, Rarity.COMMON, mage.cards.g.GitaxianMindstinger.class));
        cards.add(new SetCardInfo("Gitaxian Spellstalker", 151, Rarity.UNCOMMON, mage.cards.g.GitaxianSpellstalker.class));
        cards.add(new SetCardInfo("Glissa, Herald of Predation", 226, Rarity.RARE, mage.cards.g.GlissaHeraldOfPredation.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Glissa, Herald of Predation", 308, Rarity.RARE, mage.cards.g.GlissaHeraldOfPredation.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Glistening Dawn", 187, Rarity.RARE, mage.cards.g.GlisteningDawn.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Glistening Dawn", 371, Rarity.RARE, mage.cards.g.GlisteningDawn.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Glistening Deluge", 107, Rarity.UNCOMMON, mage.cards.g.GlisteningDeluge.class));
        cards.add(new SetCardInfo("Glistening Goremonger", 157, Rarity.COMMON, mage.cards.g.GlisteningGoremonger.class));
        cards.add(new SetCardInfo("Gloomfang Mauler", 108, Rarity.COMMON, mage.cards.g.GloomfangMauler.class));
        cards.add(new SetCardInfo("Gnottvold Hermit", 188, Rarity.UNCOMMON, mage.cards.g.GnottvoldHermit.class));
        cards.add(new SetCardInfo("Golden-Scale Aeronaut", 15, Rarity.COMMON, mage.cards.g.GoldenScaleAeronaut.class));
        cards.add(new SetCardInfo("Grafted Butcher", 109, Rarity.RARE, mage.cards.g.GraftedButcher.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Grafted Butcher", 359, Rarity.RARE, mage.cards.g.GraftedButcher.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Grandmother Ravi Sengir", 116, Rarity.UNCOMMON, mage.cards.g.GrandmotherRaviSengir.class));
        cards.add(new SetCardInfo("Guardian of Ghirapur", 16, Rarity.RARE, mage.cards.g.GuardianOfGhirapur.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Guardian of Ghirapur", 345, Rarity.RARE, mage.cards.g.GuardianOfGhirapur.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Guildpact Paragon", 1, Rarity.MYTHIC, mage.cards.g.GuildpactParagon.class));
        cards.add(new SetCardInfo("Halo Forager", 227, Rarity.UNCOMMON, mage.cards.h.HaloForager.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Halo Forager", 385, Rarity.UNCOMMON, mage.cards.h.HaloForager.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Halo Hopper", 260, Rarity.COMMON, mage.cards.h.HaloHopper.class));
        cards.add(new SetCardInfo("Halo-Charged Skaab", 60, Rarity.COMMON, mage.cards.h.HaloChargedSkaab.class));
        cards.add(new SetCardInfo("Hangar Scrounger", 142, Rarity.COMMON, mage.cards.h.HangarScrounger.class));
        cards.add(new SetCardInfo("Harried Artisan", 143, Rarity.UNCOMMON, mage.cards.h.HarriedArtisan.class));
        cards.add(new SetCardInfo("Heliod, the Radiant Dawn", 17, Rarity.RARE, mage.cards.h.HeliodTheRadiantDawn.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Heliod, the Radiant Dawn", 293, Rarity.RARE, mage.cards.h.HeliodTheRadiantDawn.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Heliod, the Warped Eclipse", 17, Rarity.RARE, mage.cards.h.HeliodTheWarpedEclipse.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Heliod, the Warped Eclipse", 293, Rarity.RARE, mage.cards.h.HeliodTheWarpedEclipse.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Herbology Instructor", 189, Rarity.UNCOMMON, mage.cards.h.HerbologyInstructor.class));
        cards.add(new SetCardInfo("Hideous Fleshwheeler", 119, Rarity.UNCOMMON, mage.cards.h.HideousFleshwheeler.class));
        cards.add(new SetCardInfo("Hidetsugu and Kairi", 228, Rarity.RARE, mage.cards.h.HidetsuguAndKairi.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Hidetsugu and Kairi", 309, Rarity.RARE, mage.cards.h.HidetsuguAndKairi.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Hoarding Broodlord", 110, Rarity.RARE, mage.cards.h.HoardingBroodlord.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Hoarding Broodlord", 360, Rarity.RARE, mage.cards.h.HoardingBroodlord.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Holy Frazzle-Cannon", 238, Rarity.UNCOMMON, mage.cards.h.HolyFrazzleCannon.class));
        cards.add(new SetCardInfo("Ichor Drinker", 111, Rarity.COMMON, mage.cards.i.IchorDrinker.class));
        cards.add(new SetCardInfo("Ichor Shade", 112, Rarity.COMMON, mage.cards.i.IchorShade.class));
        cards.add(new SetCardInfo("Infected Defector", 18, Rarity.COMMON, mage.cards.i.InfectedDefector.class));
        cards.add(new SetCardInfo("Inga and Esika", 229, Rarity.RARE, mage.cards.i.IngaAndEsika.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Inga and Esika", 310, Rarity.RARE, mage.cards.i.IngaAndEsika.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Injector Crocodile", 329, Rarity.COMMON, mage.cards.i.InjectorCrocodile.class));
        cards.add(new SetCardInfo("Inspired Charge", 19, Rarity.COMMON, mage.cards.i.InspiredCharge.class));
        cards.add(new SetCardInfo("Interdisciplinary Mascot", 326, Rarity.RARE, mage.cards.i.InterdisciplinaryMascot.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Interdisciplinary Mascot", 377, Rarity.RARE, mage.cards.i.InterdisciplinaryMascot.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Into the Fire", 144, Rarity.RARE, mage.cards.i.IntoTheFire.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Into the Fire", 364, Rarity.RARE, mage.cards.i.IntoTheFire.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Invasion of Alara", 230, Rarity.RARE, mage.cards.i.InvasionOfAlara.class));
        cards.add(new SetCardInfo("Invasion of Amonkhet", 231, Rarity.UNCOMMON, mage.cards.i.InvasionOfAmonkhet.class));
        cards.add(new SetCardInfo("Invasion of Arcavios", 61, Rarity.RARE, mage.cards.i.InvasionOfArcavios.class));
        cards.add(new SetCardInfo("Invasion of Azgol", 232, Rarity.UNCOMMON, mage.cards.i.InvasionOfAzgol.class));
        cards.add(new SetCardInfo("Invasion of Belenon", 20, Rarity.UNCOMMON, mage.cards.i.InvasionOfBelenon.class));
        cards.add(new SetCardInfo("Invasion of Dominaria", 21, Rarity.UNCOMMON, mage.cards.i.InvasionOfDominaria.class));
        cards.add(new SetCardInfo("Invasion of Eldraine", 113, Rarity.UNCOMMON, mage.cards.i.InvasionOfEldraine.class));
        cards.add(new SetCardInfo("Invasion of Ergamon", 233, Rarity.UNCOMMON, mage.cards.i.InvasionOfErgamon.class));
        cards.add(new SetCardInfo("Invasion of Fiora", 114, Rarity.RARE, mage.cards.i.InvasionOfFiora.class));
        cards.add(new SetCardInfo("Invasion of Gobakhan", 22, Rarity.RARE, mage.cards.i.InvasionOfGobakhan.class));
        cards.add(new SetCardInfo("Invasion of Ikoria", 190, Rarity.RARE, mage.cards.i.InvasionOfIkoria.class));
        cards.add(new SetCardInfo("Invasion of Innistrad", 115, Rarity.MYTHIC, mage.cards.i.InvasionOfInnistrad.class));
        cards.add(new SetCardInfo("Invasion of Ixalan", 191, Rarity.RARE, mage.cards.i.InvasionOfIxalan.class));
        cards.add(new SetCardInfo("Invasion of Kaladesh", 234, Rarity.UNCOMMON, mage.cards.i.InvasionOfKaladesh.class));
        cards.add(new SetCardInfo("Invasion of Kaldheim", 145, Rarity.RARE, mage.cards.i.InvasionOfKaldheim.class));
        cards.add(new SetCardInfo("Invasion of Kamigawa", 62, Rarity.UNCOMMON, mage.cards.i.InvasionOfKamigawa.class));
        cards.add(new SetCardInfo("Invasion of Karsus", 146, Rarity.RARE, mage.cards.i.InvasionOfKarsus.class));
        cards.add(new SetCardInfo("Invasion of Kylem", 235, Rarity.UNCOMMON, mage.cards.i.InvasionOfKylem.class));
        cards.add(new SetCardInfo("Invasion of Lorwyn", 236, Rarity.UNCOMMON, mage.cards.i.InvasionOfLorwyn.class));
        cards.add(new SetCardInfo("Invasion of Mercadia", 147, Rarity.UNCOMMON, mage.cards.i.InvasionOfMercadia.class));
        cards.add(new SetCardInfo("Invasion of Moag", 237, Rarity.UNCOMMON, mage.cards.i.InvasionOfMoag.class));
        cards.add(new SetCardInfo("Invasion of Muraganda", 192, Rarity.UNCOMMON, mage.cards.i.InvasionOfMuraganda.class));
        cards.add(new SetCardInfo("Invasion of New Capenna", 238, Rarity.UNCOMMON, mage.cards.i.InvasionOfNewCapenna.class));
        cards.add(new SetCardInfo("Invasion of New Phyrexia", 239, Rarity.MYTHIC, mage.cards.i.InvasionOfNewPhyrexia.class));
        cards.add(new SetCardInfo("Invasion of Pyrulea", 240, Rarity.UNCOMMON, mage.cards.i.InvasionOfPyrulea.class));
        cards.add(new SetCardInfo("Invasion of Ravnica", 1, Rarity.MYTHIC, mage.cards.i.InvasionOfRavnica.class));
        cards.add(new SetCardInfo("Invasion of Regatha", 148, Rarity.UNCOMMON, mage.cards.i.InvasionOfRegatha.class));
        cards.add(new SetCardInfo("Invasion of Segovia", 63, Rarity.RARE, mage.cards.i.InvasionOfSegovia.class));
        cards.add(new SetCardInfo("Invasion of Shandalar", 193, Rarity.MYTHIC, mage.cards.i.InvasionOfShandalar.class));
        cards.add(new SetCardInfo("Invasion of Tarkir", 149, Rarity.MYTHIC, mage.cards.i.InvasionOfTarkir.class));
        cards.add(new SetCardInfo("Invasion of Theros", 23, Rarity.RARE, mage.cards.i.InvasionOfTheros.class));
        cards.add(new SetCardInfo("Invasion of Tolvada", 241, Rarity.RARE, mage.cards.i.InvasionOfTolvada.class));
        cards.add(new SetCardInfo("Invasion of Ulgrotha", 116, Rarity.UNCOMMON, mage.cards.i.InvasionOfUlgrotha.class));
        cards.add(new SetCardInfo("Invasion of Vryn", 64, Rarity.UNCOMMON, mage.cards.i.InvasionOfVryn.class));
        cards.add(new SetCardInfo("Invasion of Xerex", 242, Rarity.UNCOMMON, mage.cards.i.InvasionOfXerex.class));
        cards.add(new SetCardInfo("Invasion of Zendikar", 194, Rarity.UNCOMMON, mage.cards.i.InvasionOfZendikar.class));
        cards.add(new SetCardInfo("Invocation of the Founders", 61, Rarity.RARE, mage.cards.i.InvocationOfTheFounders.class));
        cards.add(new SetCardInfo("Iridescent Blademaster", 195, Rarity.COMMON, mage.cards.i.IridescentBlademaster.class));
        cards.add(new SetCardInfo("Island", 278, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 284, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Island", 285, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Jin-Gitaxias", 294, Rarity.MYTHIC, mage.cards.j.JinGitaxias.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jin-Gitaxias", 339, Rarity.MYTHIC, mage.cards.j.JinGitaxias.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jin-Gitaxias", 65, Rarity.MYTHIC, mage.cards.j.JinGitaxias.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Joyful Stormsculptor", 243, Rarity.UNCOMMON, mage.cards.j.JoyfulStormsculptor.class));
        cards.add(new SetCardInfo("Jungle Hollow", 270, Rarity.COMMON, mage.cards.j.JungleHollow.class));
        cards.add(new SetCardInfo("Kami of Whispered Hopes", 196, Rarity.UNCOMMON, mage.cards.k.KamiOfWhisperedHopes.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kami of Whispered Hopes", 383, Rarity.UNCOMMON, mage.cards.k.KamiOfWhisperedHopes.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Karsus Depthguard", 150, Rarity.COMMON, mage.cards.k.KarsusDepthguard.class));
        cards.add(new SetCardInfo("Khenra Spellspear", 151, Rarity.UNCOMMON, mage.cards.k.KhenraSpellspear.class));
        cards.add(new SetCardInfo("Kitesail", 261, Rarity.COMMON, mage.cards.k.Kitesail.class));
        cards.add(new SetCardInfo("Kithkin Billyrider", 24, Rarity.COMMON, mage.cards.k.KithkinBillyrider.class));
        cards.add(new SetCardInfo("Knight of the New Coalition", 25, Rarity.COMMON, mage.cards.k.KnightOfTheNewCoalition.class));
        cards.add(new SetCardInfo("Knight-Errant of Eos", 26, Rarity.RARE, mage.cards.k.KnightErrantOfEos.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Knight-Errant of Eos", 346, Rarity.RARE, mage.cards.k.KnightErrantOfEos.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kogla and Yidaro", 244, Rarity.RARE, mage.cards.k.KoglaAndYidaro.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kogla and Yidaro", 311, Rarity.RARE, mage.cards.k.KoglaAndYidaro.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kor Halberd", 27, Rarity.COMMON, mage.cards.k.KorHalberd.class));
        cards.add(new SetCardInfo("Kroxa and Kunoros", 245, Rarity.MYTHIC, mage.cards.k.KroxaAndKunoros.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kroxa and Kunoros", 312, Rarity.MYTHIC, mage.cards.k.KroxaAndKunoros.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kyren Flamewright", 147, Rarity.UNCOMMON, mage.cards.k.KyrenFlamewright.class));
        cards.add(new SetCardInfo("Lazotep Convert", 231, Rarity.UNCOMMON, mage.cards.l.LazotepConvert.class));
        cards.add(new SetCardInfo("Leyline Surge", 193, Rarity.MYTHIC, mage.cards.l.LeylineSurge.class));
        cards.add(new SetCardInfo("Lightshield Array", 22, Rarity.RARE, mage.cards.l.LightshieldArray.class));
        cards.add(new SetCardInfo("Lithomantic Barrage", 152, Rarity.UNCOMMON, mage.cards.l.LithomanticBarrage.class));
        cards.add(new SetCardInfo("Malady Invoker", 189, Rarity.UNCOMMON, mage.cards.m.MaladyInvoker.class));
        cards.add(new SetCardInfo("Marauding Dreadship", 153, Rarity.COMMON, mage.cards.m.MaraudingDreadship.class));
        cards.add(new SetCardInfo("Marchesa, Resolute Monarch", 114, Rarity.RARE, mage.cards.m.MarchesaResoluteMonarch.class));
        cards.add(new SetCardInfo("Marshal of Zhalfir", 246, Rarity.UNCOMMON, mage.cards.m.MarshalOfZhalfir.class));
        cards.add(new SetCardInfo("Meeting of Minds", 66, Rarity.COMMON, mage.cards.m.MeetingOfMinds.class));
        cards.add(new SetCardInfo("Merciless Repurposing", 117, Rarity.UNCOMMON, mage.cards.m.MercilessRepurposing.class));
        cards.add(new SetCardInfo("Mirran Banesplitter", 154, Rarity.COMMON, mage.cards.m.MirranBanesplitter.class));
        cards.add(new SetCardInfo("Mirrodin Avenged", 118, Rarity.COMMON, mage.cards.m.MirrodinAvenged.class));
        cards.add(new SetCardInfo("Mirror-Shield Hoplite", 247, Rarity.UNCOMMON, mage.cards.m.MirrorShieldHoplite.class));
        cards.add(new SetCardInfo("Moment of Truth", 67, Rarity.COMMON, mage.cards.m.MomentOfTruth.class));
        cards.add(new SetCardInfo("Monastery Mentor", 28, Rarity.MYTHIC, mage.cards.m.MonasteryMentor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Monastery Mentor", 347, Rarity.MYTHIC, mage.cards.m.MonasteryMentor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 280, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 288, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 289, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Mutagen Connoisseur", 248, Rarity.UNCOMMON, mage.cards.m.MutagenConnoisseur.class));
        cards.add(new SetCardInfo("Nahiri's Warcrafting", 155, Rarity.RARE, mage.cards.n.NahirisWarcrafting.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nahiri's Warcrafting", 365, Rarity.RARE, mage.cards.n.NahirisWarcrafting.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Negate", 68, Rarity.COMMON, mage.cards.n.Negate.class));
        cards.add(new SetCardInfo("Nezumi Freewheeler", 119, Rarity.UNCOMMON, mage.cards.n.NezumiFreewheeler.class));
        cards.add(new SetCardInfo("Nezumi Informant", 120, Rarity.COMMON, mage.cards.n.NezumiInformant.class));
        cards.add(new SetCardInfo("Norn's Inquisitor", 29, Rarity.UNCOMMON, mage.cards.n.NornsInquisitor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Norn's Inquisitor", 381, Rarity.UNCOMMON, mage.cards.n.NornsInquisitor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Oculus Whelp", 69, Rarity.COMMON, mage.cards.o.OculusWhelp.class));
        cards.add(new SetCardInfo("Omen Hawker", 70, Rarity.UNCOMMON, mage.cards.o.OmenHawker.class));
        cards.add(new SetCardInfo("Omnath, Locus of All", 249, Rarity.RARE, mage.cards.o.OmnathLocusOfAll.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Omnath, Locus of All", 313, Rarity.RARE, mage.cards.o.OmnathLocusOfAll.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Omnath, Locus of All", 387, Rarity.RARE, mage.cards.o.OmnathLocusOfAll.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Onakke Javelineer", 156, Rarity.COMMON, mage.cards.o.OnakkeJavelineer.class));
        cards.add(new SetCardInfo("Oracle of Tragedy", 71, Rarity.UNCOMMON, mage.cards.o.OracleOfTragedy.class));
        cards.add(new SetCardInfo("Order of the Alabaster Host", 72, Rarity.COMMON, mage.cards.o.OrderOfTheAlabasterHost.class));
        cards.add(new SetCardInfo("Order of the Mirror", 72, Rarity.COMMON, mage.cards.o.OrderOfTheMirror.class));
        cards.add(new SetCardInfo("Orthion, Hero of Lavabrink", 334, Rarity.RARE, mage.cards.o.OrthionHeroOfLavabrink.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Orthion, Hero of Lavabrink", 379, Rarity.RARE, mage.cards.o.OrthionHeroOfLavabrink.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Overgrown Pest", 197, Rarity.COMMON, mage.cards.o.OvergrownPest.class));
        cards.add(new SetCardInfo("Overloaded Mage-Ring", 64, Rarity.UNCOMMON, mage.cards.o.OverloadedMageRing.class));
        cards.add(new SetCardInfo("Ozolith, the Shattered Spire", 198, Rarity.RARE, mage.cards.o.OzolithTheShatteredSpire.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ozolith, the Shattered Spire", 372, Rarity.RARE, mage.cards.o.OzolithTheShatteredSpire.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Phyrexian Archivist", 262, Rarity.COMMON, mage.cards.p.PhyrexianArchivist.class));
        cards.add(new SetCardInfo("Phyrexian Awakening", 30, Rarity.UNCOMMON, mage.cards.p.PhyrexianAwakening.class));
        cards.add(new SetCardInfo("Phyrexian Censor", 31, Rarity.UNCOMMON, mage.cards.p.PhyrexianCensor.class));
        cards.add(new SetCardInfo("Phyrexian Gargantua", 121, Rarity.UNCOMMON, mage.cards.p.PhyrexianGargantua.class));
        cards.add(new SetCardInfo("Phyrexian Pegasus", 324, Rarity.COMMON, mage.cards.p.PhyrexianPegasus.class));
        cards.add(new SetCardInfo("Phyrexian Skyflayer", 143, Rarity.UNCOMMON, mage.cards.p.PhyrexianSkyflayer.class));
        cards.add(new SetCardInfo("Pile On", 122, Rarity.RARE, mage.cards.p.PileOn.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Pile On", 361, Rarity.RARE, mage.cards.p.PileOn.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Placid Rottentail", 199, Rarity.COMMON, mage.cards.p.PlacidRottentail.class));
        cards.add(new SetCardInfo("Plains", 277, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 282, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Plains", 283, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Plated Kilnbeast", 178, Rarity.COMMON, mage.cards.p.PlatedKilnbeast.class));
        cards.add(new SetCardInfo("Polukranos Reborn", 200, Rarity.RARE, mage.cards.p.PolukranosReborn.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Polukranos Reborn", 300, Rarity.RARE, mage.cards.p.PolukranosReborn.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Polukranos, Engine of Ruin", 200, Rarity.RARE, mage.cards.p.PolukranosEngineOfRuin.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Polukranos, Engine of Ruin", 300, Rarity.RARE, mage.cards.p.PolukranosEngineOfRuin.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Portent Tracker", 201, Rarity.COMMON, mage.cards.p.PortentTracker.class));
        cards.add(new SetCardInfo("Preening Champion", 73, Rarity.COMMON, mage.cards.p.PreeningChampion.class));
        cards.add(new SetCardInfo("Prickle Faeries", 113, Rarity.UNCOMMON, mage.cards.p.PrickleFaeries.class));
        cards.add(new SetCardInfo("Primordial Plasm", 192, Rarity.UNCOMMON, mage.cards.p.PrimordialPlasm.class));
        cards.add(new SetCardInfo("Progenitor Exarch", 32, Rarity.RARE, mage.cards.p.ProgenitorExarch.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Progenitor Exarch", 348, Rarity.RARE, mage.cards.p.ProgenitorExarch.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Protocol Knight", 74, Rarity.COMMON, mage.cards.p.ProtocolKnight.class));
        cards.add(new SetCardInfo("Pyre of the World Tree", 145, Rarity.RARE, mage.cards.p.PyreOfTheWorldTree.class));
        cards.add(new SetCardInfo("Pyretic Prankster", 157, Rarity.COMMON, mage.cards.p.PyreticPrankster.class));
        cards.add(new SetCardInfo("Quintorius, Loremaster", 250, Rarity.RARE, mage.cards.q.QuintoriusLoremaster.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Quintorius, Loremaster", 314, Rarity.RARE, mage.cards.q.QuintoriusLoremaster.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ral's Reinforcements", 158, Rarity.COMMON, mage.cards.r.RalsReinforcements.class));
        cards.add(new SetCardInfo("Ramosian Greatsword", 159, Rarity.UNCOMMON, mage.cards.r.RamosianGreatsword.class));
        cards.add(new SetCardInfo("Rampaging Geoderm", 251, Rarity.UNCOMMON, mage.cards.r.RampagingGeoderm.class));
        cards.add(new SetCardInfo("Rampaging Raptor", 160, Rarity.RARE, mage.cards.r.RampagingRaptor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Rampaging Raptor", 366, Rarity.RARE, mage.cards.r.RampagingRaptor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Rankle and Torbran", 252, Rarity.RARE, mage.cards.r.RankleAndTorbran.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Rankle and Torbran", 315, Rarity.RARE, mage.cards.r.RankleAndTorbran.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ravenous Sailback", 202, Rarity.UNCOMMON, mage.cards.r.RavenousSailback.class));
        cards.add(new SetCardInfo("Realmbreaker's Grasp", 33, Rarity.COMMON, mage.cards.r.RealmbreakersGrasp.class));
        cards.add(new SetCardInfo("Realmbreaker, the Invasion Tree", 263, Rarity.RARE, mage.cards.r.RealmbreakerTheInvasionTree.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Realmbreaker, the Invasion Tree", 374, Rarity.RARE, mage.cards.r.RealmbreakerTheInvasionTree.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Redcap Heelslasher", 161, Rarity.COMMON, mage.cards.r.RedcapHeelslasher.class));
        cards.add(new SetCardInfo("Referee Squad", 327, Rarity.UNCOMMON, mage.cards.r.RefereeSquad.class));
        cards.add(new SetCardInfo("Refraction Elemental", 146, Rarity.RARE, mage.cards.r.RefractionElemental.class));
        cards.add(new SetCardInfo("Render Inert", 123, Rarity.UNCOMMON, mage.cards.r.RenderInert.class));
        cards.add(new SetCardInfo("Rona, Herald of Invasion", 295, Rarity.RARE, mage.cards.r.RonaHeraldOfInvasion.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Rona, Herald of Invasion", 75, Rarity.RARE, mage.cards.r.RonaHeraldOfInvasion.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Rona, Tolarian Obliterator", 295, Rarity.RARE, mage.cards.r.RonaTolarianObliterator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Rona, Tolarian Obliterator", 75, Rarity.RARE, mage.cards.r.RonaTolarianObliterator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Rooftop Saboteurs", 62, Rarity.UNCOMMON, mage.cards.r.RooftopSaboteurs.class));
        cards.add(new SetCardInfo("Rugged Highlands", 271, Rarity.COMMON, mage.cards.r.RuggedHighlands.class));
        cards.add(new SetCardInfo("Ruins Recluse", 336, Rarity.UNCOMMON, mage.cards.r.RuinsRecluse.class));
        cards.add(new SetCardInfo("Saiba Cryptomancer", 76, Rarity.COMMON, mage.cards.s.SaibaCryptomancer.class));
        cards.add(new SetCardInfo("Sandstalker Moloch", 203, Rarity.UNCOMMON, mage.cards.s.SandstalkerMoloch.class));
        cards.add(new SetCardInfo("Scorn-Blade Berserker", 124, Rarity.UNCOMMON, mage.cards.s.ScornBladeBerserker.class));
        cards.add(new SetCardInfo("Scoured Barrens", 272, Rarity.COMMON, mage.cards.s.ScouredBarrens.class));
        cards.add(new SetCardInfo("Scrappy Bruiser", 162, Rarity.UNCOMMON, mage.cards.s.ScrappyBruiser.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Scrappy Bruiser", 382, Rarity.UNCOMMON, mage.cards.s.ScrappyBruiser.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Scrollshift", 34, Rarity.COMMON, mage.cards.s.Scrollshift.class));
        cards.add(new SetCardInfo("Sculpted Perfection", 253, Rarity.UNCOMMON, mage.cards.s.SculptedPerfection.class));
        cards.add(new SetCardInfo("Seal from Existence", 35, Rarity.UNCOMMON, mage.cards.s.SealFromExistence.class));
        cards.add(new SetCardInfo("Searing Barb", 163, Rarity.COMMON, mage.cards.s.SearingBarb.class));
        cards.add(new SetCardInfo("See Double", 353, Rarity.RARE, mage.cards.s.SeeDouble.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("See Double", 77, Rarity.RARE, mage.cards.s.SeeDouble.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Seed of Hope", 204, Rarity.COMMON, mage.cards.s.SeedOfHope.class));
        cards.add(new SetCardInfo("Seedpod Caretaker", 325, Rarity.UNCOMMON, mage.cards.s.SeedpodCaretaker.class));
        cards.add(new SetCardInfo("Seer of Stolen Sight", 330, Rarity.UNCOMMON, mage.cards.s.SeerOfStolenSight.class));
        cards.add(new SetCardInfo("Seraph of New Capenna", 36, Rarity.UNCOMMON, mage.cards.s.SeraphOfNewCapenna.class));
        cards.add(new SetCardInfo("Seraph of New Phyrexia", 36, Rarity.UNCOMMON, mage.cards.s.SeraphOfNewPhyrexia.class));
        cards.add(new SetCardInfo("Serpent-Blade Assailant", 205, Rarity.COMMON, mage.cards.s.SerpentBladeAssailant.class));
        cards.add(new SetCardInfo("Serra Faithkeeper", 21, Rarity.UNCOMMON, mage.cards.s.SerraFaithkeeper.class));
        cards.add(new SetCardInfo("Shatter the Source", 164, Rarity.COMMON, mage.cards.s.ShatterTheSource.class));
        cards.add(new SetCardInfo("Sheoldred", 125, Rarity.MYTHIC, mage.cards.s.Sheoldred.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sheoldred", 297, Rarity.MYTHIC, mage.cards.s.Sheoldred.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sheoldred", 340, Rarity.MYTHIC, mage.cards.s.Sheoldred.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Shivan Branch-Burner", 165, Rarity.UNCOMMON, mage.cards.s.ShivanBranchBurner.class));
        cards.add(new SetCardInfo("Sigiled Sentinel", 37, Rarity.COMMON, mage.cards.s.SigiledSentinel.class));
        cards.add(new SetCardInfo("Skittering Surveyor", 264, Rarity.COMMON, mage.cards.s.SkitteringSurveyor.class));
        cards.add(new SetCardInfo("Skyclave Aerialist", 78, Rarity.UNCOMMON, mage.cards.s.SkyclaveAerialist.class));
        cards.add(new SetCardInfo("Skyclave Invader", 78, Rarity.UNCOMMON, mage.cards.s.SkyclaveInvader.class));
        cards.add(new SetCardInfo("Stasis Field", 79, Rarity.COMMON, mage.cards.s.StasisField.class));
        cards.add(new SetCardInfo("Stoke the Flames", 166, Rarity.UNCOMMON, mage.cards.s.StokeTheFlames.class));
        cards.add(new SetCardInfo("Storm the Seedcore", 206, Rarity.UNCOMMON, mage.cards.s.StormTheSeedcore.class));
        cards.add(new SetCardInfo("Stormclaw Rager", 254, Rarity.UNCOMMON, mage.cards.s.StormclawRager.class));
        cards.add(new SetCardInfo("Streetwise Negotiator", 207, Rarity.UNCOMMON, mage.cards.s.StreetwiseNegotiator.class));
        cards.add(new SetCardInfo("Sun-Blessed Guardian", 38, Rarity.UNCOMMON, mage.cards.s.SunBlessedGuardian.class));
        cards.add(new SetCardInfo("Sunder the Gateway", 39, Rarity.COMMON, mage.cards.s.SunderTheGateway.class));
        cards.add(new SetCardInfo("Sunfall", 349, Rarity.RARE, mage.cards.s.Sunfall.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sunfall", 40, Rarity.RARE, mage.cards.s.Sunfall.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Surge of Salvation", 41, Rarity.UNCOMMON, mage.cards.s.SurgeOfSalvation.class));
        cards.add(new SetCardInfo("Surrak and Goreclaw", 337, Rarity.RARE, mage.cards.s.SurrakAndGoreclaw.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Surrak and Goreclaw", 380, Rarity.RARE, mage.cards.s.SurrakAndGoreclaw.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 279, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 286, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 287, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Swiftwater Cliffs", 273, Rarity.COMMON, mage.cards.s.SwiftwaterCliffs.class));
        cards.add(new SetCardInfo("Sword of Once and Future", 265, Rarity.MYTHIC, mage.cards.s.SwordOfOnceAndFuture.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sword of Once and Future", 375, Rarity.MYTHIC, mage.cards.s.SwordOfOnceAndFuture.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swordsworn Cavalier", 42, Rarity.COMMON, mage.cards.s.SwordswornCavalier.class));
        cards.add(new SetCardInfo("Tandem Takedown", 208, Rarity.UNCOMMON, mage.cards.t.TandemTakedown.class));
        cards.add(new SetCardInfo("Tangled Skyline", 209, Rarity.UNCOMMON, mage.cards.t.TangledSkyline.class));
        cards.add(new SetCardInfo("Tarkir Duneshaper", 43, Rarity.COMMON, mage.cards.t.TarkirDuneshaper.class));
        cards.add(new SetCardInfo("Teferi Akosa of Zhalfir", 239, Rarity.MYTHIC, mage.cards.t.TeferiAkosaOfZhalfir.class));
        cards.add(new SetCardInfo("Temporal Cleansing", 80, Rarity.COMMON, mage.cards.t.TemporalCleansing.class));
        cards.add(new SetCardInfo("Tenured Oilcaster", 126, Rarity.COMMON, mage.cards.t.TenuredOilcaster.class));
        cards.add(new SetCardInfo("Terror of Towashi", 331, Rarity.RARE, mage.cards.t.TerrorOfTowashi.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Terror of Towashi", 378, Rarity.RARE, mage.cards.t.TerrorOfTowashi.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thalia and The Gitrog Monster", 255, Rarity.MYTHIC, mage.cards.t.ThaliaAndTheGitrogMonster.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thalia and The Gitrog Monster", 316, Rarity.MYTHIC, mage.cards.t.ThaliaAndTheGitrogMonster.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Argent Etchings", 12, Rarity.MYTHIC, mage.cards.t.TheArgentEtchings.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Argent Etchings", 292, Rarity.MYTHIC, mage.cards.t.TheArgentEtchings.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Argent Etchings", 338, Rarity.MYTHIC, mage.cards.t.TheArgentEtchings.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Broken Sky", 241, Rarity.RARE, mage.cards.t.TheBrokenSky.class));
        cards.add(new SetCardInfo("The Grand Evolution", 213, Rarity.MYTHIC, mage.cards.t.TheGrandEvolution.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Grand Evolution", 301, Rarity.MYTHIC, mage.cards.t.TheGrandEvolution.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Grand Evolution", 342, Rarity.MYTHIC, mage.cards.t.TheGrandEvolution.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Great Synthesis", 294, Rarity.MYTHIC, mage.cards.t.TheGreatSynthesis.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Great Synthesis", 339, Rarity.MYTHIC, mage.cards.t.TheGreatSynthesis.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Great Synthesis", 65, Rarity.MYTHIC, mage.cards.t.TheGreatSynthesis.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Great Work", 169, Rarity.MYTHIC, mage.cards.t.TheGreatWork.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Great Work", 299, Rarity.MYTHIC, mage.cards.t.TheGreatWork.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Great Work", 341, Rarity.MYTHIC, mage.cards.t.TheGreatWork.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The True Scriptures", 125, Rarity.MYTHIC, mage.cards.t.TheTrueScriptures.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The True Scriptures", 297, Rarity.MYTHIC, mage.cards.t.TheTrueScriptures.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The True Scriptures", 340, Rarity.MYTHIC, mage.cards.t.TheTrueScriptures.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thornwood Falls", 274, Rarity.COMMON, mage.cards.t.ThornwoodFalls.class));
        cards.add(new SetCardInfo("Thrashing Frontliner", 167, Rarity.COMMON, mage.cards.t.ThrashingFrontliner.class));
        cards.add(new SetCardInfo("Thunderhead Squadron", 81, Rarity.COMMON, mage.cards.t.ThunderheadSquadron.class));
        cards.add(new SetCardInfo("Tidal Terror", 82, Rarity.COMMON, mage.cards.t.TidalTerror.class));
        cards.add(new SetCardInfo("Tiller of Flesh", 44, Rarity.UNCOMMON, mage.cards.t.TillerOfFlesh.class));
        cards.add(new SetCardInfo("Timberland Ancient", 210, Rarity.COMMON, mage.cards.t.TimberlandAncient.class));
        cards.add(new SetCardInfo("Trailblazing Historian", 168, Rarity.COMMON, mage.cards.t.TrailblazingHistorian.class));
        cards.add(new SetCardInfo("Tranquil Cove", 275, Rarity.COMMON, mage.cards.t.TranquilCove.class));
        cards.add(new SetCardInfo("Transcendent Message", 354, Rarity.RARE, mage.cards.t.TranscendentMessage.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Transcendent Message", 83, Rarity.RARE, mage.cards.t.TranscendentMessage.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Traumatic Revelation", 127, Rarity.COMMON, mage.cards.t.TraumaticRevelation.class));
        cards.add(new SetCardInfo("Tribute to the World Tree", 211, Rarity.RARE, mage.cards.t.TributeToTheWorldTree.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tribute to the World Tree", 373, Rarity.RARE, mage.cards.t.TributeToTheWorldTree.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Truga Cliffcharger", 233, Rarity.UNCOMMON, mage.cards.t.TrugaCliffcharger.class));
        cards.add(new SetCardInfo("Unseal the Necropolis", 128, Rarity.COMMON, mage.cards.u.UnsealTheNecropolis.class));
        cards.add(new SetCardInfo("Urabrask", 169, Rarity.MYTHIC, mage.cards.u.Urabrask.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Urabrask", 299, Rarity.MYTHIC, mage.cards.u.Urabrask.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Urabrask", 341, Rarity.MYTHIC, mage.cards.u.Urabrask.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Urn of Godfire", 266, Rarity.COMMON, mage.cards.u.UrnOfGodfire.class));
        cards.add(new SetCardInfo("Valor's Reach Tag Team", 235, Rarity.UNCOMMON, mage.cards.v.ValorsReachTagTeam.class));
        cards.add(new SetCardInfo("Vanquish the Weak", 129, Rarity.COMMON, mage.cards.v.VanquishTheWeak.class));
        cards.add(new SetCardInfo("Vengeant Earth", 212, Rarity.COMMON, mage.cards.v.VengeantEarth.class));
        cards.add(new SetCardInfo("Vertex Paladin", 242, Rarity.UNCOMMON, mage.cards.v.VertexPaladin.class));
        cards.add(new SetCardInfo("Volcanic Spite", 170, Rarity.COMMON, mage.cards.v.VolcanicSpite.class));
        cards.add(new SetCardInfo("Voldaren Thrillseeker", 171, Rarity.RARE, mage.cards.v.VoldarenThrillseeker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Voldaren Thrillseeker", 367, Rarity.RARE, mage.cards.v.VoldarenThrillseeker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vorinclex", 213, Rarity.MYTHIC, mage.cards.v.Vorinclex.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vorinclex", 301, Rarity.MYTHIC, mage.cards.v.Vorinclex.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vorinclex", 342, Rarity.MYTHIC, mage.cards.v.Vorinclex.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("War Historian", 214, Rarity.COMMON, mage.cards.w.WarHistorian.class));
        cards.add(new SetCardInfo("War-Trained Slasher", 172, Rarity.COMMON, mage.cards.w.WarTrainedSlasher.class));
        cards.add(new SetCardInfo("Wary Thespian", 215, Rarity.COMMON, mage.cards.w.WaryThespian.class));
        cards.add(new SetCardInfo("Wicked Slumber", 84, Rarity.UNCOMMON, mage.cards.w.WickedSlumber.class));
        cards.add(new SetCardInfo("Wildwood Escort", 216, Rarity.COMMON, mage.cards.w.WildwoodEscort.class));
        cards.add(new SetCardInfo("Wind-Scarred Crag", 276, Rarity.COMMON, mage.cards.w.WindScarredCrag.class));
        cards.add(new SetCardInfo("Winnowing Forces", 236, Rarity.UNCOMMON, mage.cards.w.WinnowingForces.class));
        cards.add(new SetCardInfo("Wrenn and Realmbreaker", 217, Rarity.MYTHIC, mage.cards.w.WrennAndRealmbreaker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Wrenn and Realmbreaker", 322, Rarity.MYTHIC, mage.cards.w.WrennAndRealmbreaker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Wrenn's Resolve", 173, Rarity.COMMON, mage.cards.w.WrennsResolve.class));
        cards.add(new SetCardInfo("Xerex Strobe-Knight", 85, Rarity.UNCOMMON, mage.cards.x.XerexStrobeKnight.class));
        cards.add(new SetCardInfo("Yargle and Multani", 256, Rarity.RARE, mage.cards.y.YargleAndMultani.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Yargle and Multani", 317, Rarity.RARE, mage.cards.y.YargleAndMultani.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Zephyr Singer", 355, Rarity.RARE, mage.cards.z.ZephyrSinger.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Zephyr Singer", 86, Rarity.RARE, mage.cards.z.ZephyrSinger.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Zephyr Winder", 328, Rarity.COMMON, mage.cards.z.ZephyrWinder.class));
        cards.add(new SetCardInfo("Zhalfirin Lancer", 45, Rarity.UNCOMMON, mage.cards.z.ZhalfirinLancer.class));
        cards.add(new SetCardInfo("Zhalfirin Shapecraft", 87, Rarity.COMMON, mage.cards.z.ZhalfirinShapecraft.class));
        cards.add(new SetCardInfo("Zilortha, Apex of Ikoria", 190, Rarity.RARE, mage.cards.z.ZilorthaApexOfIkoria.class));
        cards.add(new SetCardInfo("Zimone and Dina", 257, Rarity.MYTHIC, mage.cards.z.ZimoneAndDina.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Zimone and Dina", 318, Rarity.MYTHIC, mage.cards.z.ZimoneAndDina.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Zurgo and Ojutai", 258, Rarity.MYTHIC, mage.cards.z.ZurgoAndOjutai.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Zurgo and Ojutai", 319, Rarity.MYTHIC, mage.cards.z.ZurgoAndOjutai.class, NON_FULL_USE_VARIOUS));
    }

    @Override
    protected void addSpecialCards(List<Card> booster, int number) {
        // number is here always 1
        // Boosters have one card from MUL, odds are 2/3 for uncommon, 4/15 for rare, 1/15 for mythic
        Rarity rarity;
        int rarityKey = RandomUtil.nextInt(15);
        if (rarityKey == 14) {
            rarity = Rarity.MYTHIC;
        } else if (rarityKey >= 10) {
            rarity = Rarity.RARE;
        } else {
            rarity = Rarity.UNCOMMON;
        }
        addToBooster(booster, MultiverseLegends.getInstance().getCardsByRarity(rarity));
    }

    @Override
    protected void generateBoosterMap() {
        super.generateBoosterMap();
        CardRepository
                .instance
                .findCards(new CardCriteria().setCodes("MUL"))
                .stream()
                .forEach(cardInfo -> inBoosterMap.put("MUL_" + cardInfo.getCardNumber(), cardInfo));
    }

   @Override
   public BoosterCollator createCollator() {
       return new MarchOfTheMachineCollator();
   }
}

// Booster collation info from https://www.lethe.xyz/mtg/collation/mom.html
// Using Japanese common collation

class MarchOfTheMachineCollator implements BoosterCollator {

    private final CardRun commonA = new CardRun(true, "76", "33", "68", "24", "82", "42", "59", "5", "80", "19", "54", "25", "55", "8", "60", "37", "67", "27", "47", "2", "87", "33", "56", "14", "74", "34", "54", "18", "55", "19", "76", "24", "60", "33", "74", "25", "67", "42", "82", "2", "59", "37", "68", "8", "47", "39", "56", "5", "87", "25", "80", "34", "79", "27", "59", "14", "60", "19", "55", "2", "56", "34", "80", "24", "74", "39", "76", "18", "68", "27", "82", "5", "54", "37", "87", "42", "79", "33", "67", "14", "47", "8", "68", "18", "82", "24", "76", "42", "67", "39", "47", "27", "80", "8", "54", "34", "55", "5", "79", "19", "56", "2", "74", "37", "59", "25", "60", "39", "79", "14", "87", "18");
    private final CardRun commonB = new CardRun(true, "214", "260", "197", "266", "210", "259", "201", "199", "57", "177", "3", "204", "81", "186", "15", "195", "73", "175", "7", "183", "66", "215", "4", "205", "69", "176", "10", "212", "261", "182", "133", "180", "264", "179", "118", "201", "260", "182", "261", "197", "133", "180", "175", "10", "204", "57", "215", "15", "212", "81", "183", "3", "205", "66", "199", "4", "176", "73", "177", "7", "186", "69", "195", "266", "216", "118", "214", "259", "210", "262", "179", "264", "180", "260", "201", "266", "216", "259", "214", "262", "210", "215", "15", "204", "81", "175", "10", "199", "66", "195", "3", "183", "57", "177", "4", "212", "73", "205", "7", "176", "69", "186", "118", "197", "261", "182", "133", "179", "264", "216", "262");
    private final CardRun commonC = new CardRun(true, "142", "112", "170", "102", "131", "98", "163", "100", "167", "103", "172", "105", "173", "129", "161", "91", "158", "112", "168", "104", "142", "111", "156", "108", "130", "128", "150", "120", "153", "126", "154", "101", "164", "127", "140", "97", "136", "99", "173", "120", "172", "128", "168", "111", "163", "127", "161", "129", "167", "105", "158", "102", "154", "108", "150", "100", "170", "126", "130", "101", "156", "112", "140", "91", "142", "104", "164", "98", "153", "103", "131", "99", "136", "97", "168", "129", "173", "128", "172", "100", "161", "105", "170", "97", "164", "103", "163", "102", "156", "99", "154", "127", "158", "126", "136", "104", "130", "111", "140", "98", "131", "101", "150", "91", "153", "120", "167", "108");
    // uncommonT (battle) uncommonD (c/u non-battle dfc) uncommon (non-battle, non-dfc)
    private final CardRun uncommon = new CardRun(false, "46", "48", "220", "50", "95", "96", "181", "53", "13", "223", "138", "139", "141", "106", "107", "227", "243", "196", "152", "246", "117", "247", "248", "29", "70", "71", "30", "31", "121", "159", "251", "202", "123", "203", "124", "162", "253", "35", "165", "166", "254", "206", "207", "41", "208", "209", "44", "84", "85", "45");
    // used 3:5 uncommon:common ratio (uncD 106% as likely as unc, comD 102% as likely as com).
    private final CardRun uncommonD = new CardRun(false, "88", "88", "88", "88", "88", "92", "92", "92", "178", "178", "178", "178", "178", "49", "49", "49", "188", "188", "188", "143", "143", "143", "189", "189", "189", "151", "151", "151", "119", "119", "119", "72", "72", "72", "72", "72", "157", "157", "157", "157", "157", "36", "36", "36", "78", "78", "78", "38", "38", "38", "43", "43", "43", "43", "43");
    private final CardRun uncommonT = new CardRun(false, "231", "232", "20", "21", "113", "233", "234", "62", "235", "236", "147", "237", "192", "238", "240", "148", "116", "64", "242", "194");
    // rareT (battle) rareD (non-battle dfc) rare (non-battle, non-dfc)
    private final CardRun rare = new CardRun(false, "174", "174", "6", "89", "89", "218", "218", "93", "93", "132", "132", "9", "9", "219", "94", "94", "134", "51", "51", "135", "135", "52", "52", "184", "184", "221", "221", "185", "185", "222", "222", "11", "11", "224", "224", "58", "58", "225", "225", "226", "226", "187", "187", "109", "109", "16", "16", "228", "228", "110", "110", "229", "229", "144", "144", "26", "26", "244", "244", "245", "28", "155", "155", "249", "249", "198", "198", "122", "122", "32", "32", "250", "250", "160", "160", "252", "252", "263", "263", "77", "77", "40", "40", "265", "255", "83", "83", "211", "211", "171", "171", "217", "256", "256", "86", "86", "257", "258");
    private final CardRun rareD = new CardRun(false, "90", "90", "12", "137", "137", "17", "17", "65", "200", "200", "75", "75", "125", "169", "213");
    private final CardRun rareT = new CardRun(false, "230", "230", "61", "61", "114", "114", "22", "22", "190", "190", "115", "191", "191", "145", "145", "146", "146", "239", "1", "63", "63", "193", "149", "23", "23", "241", "241");
    private final CardRun land = new CardRun(false, "267", "267", "267", "268", "268", "268", "269", "269", "269", "270", "270", "270", "271", "271", "271", "272", "272", "272", "273", "273", "273", "274", "274", "274", "275", "275", "275", "276", "276", "276", "277", "277", "278", "278", "279", "279", "280", "280", "281", "281", "282", "282", "283", "283", "284", "284", "285", "285", "286", "286", "287", "287", "288", "288", "289", "289", "290", "290", "291", "291");
    // two archive runs, U (uncommon) RM (raremythic with 2:1 individual card ratio)
    private final CardRun archiveU = new CardRun(false, "31", "2", "37", "40", "26", "43", "10", "46", "5", "55", "56", "28", "57", "58", "59", "12", "18", "24", "19", "25");
    private final CardRun archiveRM = new CardRun(false, "1", "1", "32", "32", "33", "34", "34", "35", "13", "13", "8", "8", "36", "36", "20", "20", "3", "9", "9", "38", "39", "39", "27", "27", "41", "42", "42", "14", "14", "44", "44", "11", "45", "45", "47", "47", "4", "48", "48", "49", "50", "50", "51", "51", "52", "52", "53", "54", "54", "21", "15", "15", "16", "17", "22", "22", "6", "6", "60", "60", "61", "61", "7", "7", "62", "62", "23", "29", "63", "30", "30", "64", "64", "65", "65");

    private final BoosterStructure AABBBCCC = new BoosterStructure(
            commonA, commonA,
            commonB, commonB, commonB,
            commonC, commonC, commonC
    );
    private final BoosterStructure AAABBCCC = new BoosterStructure(
            commonA, commonA, commonA,
            commonB, commonB,
            commonC, commonC, commonC
    );
    private final BoosterStructure AAABBBCC = new BoosterStructure(
            commonA, commonA, commonA,
            commonB, commonB, commonB,
            commonC, commonC
    );

    private final BoosterStructure UuRUU = new BoosterStructure(
            uncommonT, uncommonD, rare, uncommon, uncommon
    );
    private final BoosterStructure URUUU = new BoosterStructure(
            uncommonT, rareD, uncommon, uncommon, uncommon
    );
    private final BoosterStructure RuUUU = new BoosterStructure(
            rareT, uncommonD, uncommon, uncommon, uncommon
    );

    private final BoosterStructure L1 = new BoosterStructure(land);
    private final BoosterStructure A1 = new BoosterStructure(archiveU);
    private final BoosterStructure A2 = new BoosterStructure(archiveRM);

    // In order for equal numbers of each common to exist, the average booster must contain:
    // 2.12 A commons (224 / 101)
    // 2.93 B commons (296 / 101)
    // 2.85 C commons (288 / 101)
    // Note common DFCs (5 cards) are in uncommonD
    private final RarityConfiguration commonRuns = new RarityConfiguration(
            AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC,
            AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC,
            AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC,
            AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC,
            AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC,
            AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC,
            AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC,
            AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC,
            AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC,
            AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC,
            AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC,
            AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC,
            AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC,
            AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC,
            AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC,
            AABBBCCC, AABBBCCC, AABBBCCC, AABBBCCC, 
            AAABBCCC, AAABBCCC, AAABBCCC, AAABBCCC, AAABBCCC,
            AAABBCCC, AAABBCCC,
            AAABBBCC, AAABBBCC, AAABBBCC, AAABBBCC, AAABBBCC,
            AAABBBCC, AAABBBCC, AAABBBCC, AAABBBCC, AAABBBCC,
            AAABBBCC, AAABBBCC, AAABBBCC, AAABBBCC, AAABBBCC
    );

    // 11 rare battle and 5 mythic battle for a weight of 27
    // 5 rare dfc and 5 mythic dfc for a weight of 15
    // 44 rare non-dfc and 10 mythic non-dfc for a weight of 98
    // note: each uncommon battle will be only 88% as likely as each uncommon non-dfc
    // and each uncommon dfc will be 106% as likely as each uncommon non-dfc
    // and each common dfc will 102% as likely as each common non-dfc
    private final RarityConfiguration uncommonRuns = new RarityConfiguration(
            RuUUU, RuUUU, RuUUU, RuUUU, RuUUU, RuUUU, RuUUU, RuUUU, RuUUU, RuUUU,
            RuUUU, RuUUU, RuUUU, RuUUU, RuUUU, RuUUU, RuUUU, RuUUU, RuUUU, RuUUU,
            RuUUU, RuUUU, RuUUU, RuUUU, RuUUU, RuUUU, RuUUU, 
            URUUU, URUUU, URUUU, URUUU, URUUU, URUUU, URUUU, URUUU, URUUU, URUUU,
            URUUU, URUUU, URUUU, URUUU, URUUU,
            UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU,
            UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU,
            UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU,
            UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU,
            UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU,
            UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU,
            UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU,
            UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU,
            UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU,
            UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU, UuRUU
    );

    private final RarityConfiguration archiveRuns = new RarityConfiguration(A1, A1, A2);
    private final RarityConfiguration landRuns = new RarityConfiguration(L1);

    @Override
    public List<String> makeBooster() {
        List<String> booster = new ArrayList<>();
        booster.addAll(landRuns.getNext().makeRun());
        archiveRuns.getNext().makeRun().stream().map(s -> "MUL_" + s).forEach(booster::add);
        booster.addAll(uncommonRuns.getNext().makeRun());
        booster.addAll(commonRuns.getNext().makeRun());
        return booster;
    }
}
