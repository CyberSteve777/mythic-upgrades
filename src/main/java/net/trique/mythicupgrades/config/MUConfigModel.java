package net.trique.mythicupgrades.config;

import io.wispforest.owo.config.Option;
import io.wispforest.owo.config.annotation.*;
import net.trique.mythicupgrades.MythicUpgrades;

@Modmenu(modId = MythicUpgrades.MOD_ID)

@Config(name = MythicUpgrades.MOD_ID + "-config", wrapperName = "MUConfig")
public class MUConfigModel {
    @Nest
    public PeridotConfig peridotConfig = new PeridotConfig();
    @Nest
    public TopazConfig topazConfig = new TopazConfig();
    @Nest
    public SapphireConfig sapphireConfig = new SapphireConfig();
    @Nest
    public RubyConfig rubyConfig = new RubyConfig();
    @Nest
    public KyaniteConfig kyaniteConfig = new KyaniteConfig();
    @Nest
    public AmetrineConfig ametrineConfig = new AmetrineConfig();
    @Nest
    public JadeConfig jadeConfig = new JadeConfig();

    public static class PeridotConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.1f, max = 3f)
        public float axe_poison_duration = 1.5f;
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 5)
        public int axe_poison_amplifier = 2;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.1f, max = 3f)
        public float sword_poison_duration = 1.5f;
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 5)
        public int sword_poison_amplifier = 2;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.1f, max = 7f)
        public float poisonous_thorns_poison_duration = 5f;
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 4)
        public int poisonous_thorns_amplifier = 0;
    }

    public static class TopazConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 4)
        public int topaz_item_mastery_amplifier = 2;
    }

    public static class SapphireConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 1, max = 7)
        public int axe_percentage_damage_percent = 5;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 1, max = 7)
        public int sword_percentage_damage_percent = 5;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 4)
        public int damage_deflection_amplifier = 2;
    }

    public static class RubyConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 2)
        public int haste_pickaxe_amplifier = 0;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 2)
        public int haste_axe_amplifier = 0;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 2)
        public int haste_shovel_amplifier = 0;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 2)
        public int haste_sword_amplifier = 0;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 2)
        public int haste_hoe_amplifier = 0;
    }

    public static class KyaniteConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.1f, max = 1f)
        public float axe_freeze_duration = 0.33f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.1f, max = 1f)
        public float sword_freeze_duration = 0.33f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.33f, max = 3f)
        public float ice_shield_duration = 0.67f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 4)
        public int ice_shield_amplifier = 2;
    }

    public static class AmetrineConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.1f, max = 2f)
        public float axe_levitation_duration = 0.75f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 4, max = 6)
        public int axe_levitation_amplifier = 4;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.1f, max = 2f)
        public float sword_levitation_duration = 0.75f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 4, max = 6)
        public int sword_levitation_amplifier = 4;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0.5f, max = 3f)
        public float arcane_aura_duration = 0.75f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 4)
        public int arcane_aura_amplifier = 2;
    }

    public static class JadeConfig {
        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 4)
        public int speed_amplifier = 2;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 4)
        public int jump_boost_amplifier = 2;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 3f, max = 10f)
        public float hindering_duration = 5f;

        @Sync(Option.SyncMode.OVERRIDE_CLIENT)
        @RangeConstraint(min = 0, max = 2)
        public int hindering_amplifier = 0;
    }
}