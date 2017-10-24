package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT;

public class NumbersActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String[] phrases = {"Do you like watching me",

                "On the house",

                "Playing with fire",

                "RIP ears",

                "She gave me quite a show",

                "The semen arsonist",

                "Why don't you get fucked",

                "You get mad",

                "AAAAAAAH",

                "Another victim",

                "Ass we can",

                "At least it smells like it",

                "ATTEEEN-TION",

                "Bet your ass",

                "Big surprise",

                "Come on college boy",

                "I'm taking that ass",

                "Ladies first",

                "Lash of the spanking",

                "Like embarrassing me",

                "Oh my shoulder",

                "One more round",

                "Pull up our pants",

                "Six hot loads",

                "Spank",

                "That's power son",

                "The other night",

                "The point you wanna be",

                "What the hell are you two doing",

                "Work that tool",

                "You can go now",

                "You got me mad now",

                "You like challenges",

                "You like that",

                "You ripped my fucking pants",

                "An ass I wouldn't mind fucking",

                "I love fire",

                "It turns me on",

                "It's a loan",

                "Oh ho ho ganging up",

                "So how you feeling",

                "Two can play it",

                "Beat me 1 2 3",

                "Boss of this gym",

                "Come on",

                "Fuck you leather man",

                "Go another round",

                "Jabroni outfit",

                "Knocked out some jabroni",

                "Let's give it a go",

                "Settle it",

                "Wrong door",

                "It gets bigger when I pull",

                "Our daddy told us",

                "Rip the skin",

                "Sorry for what",

                "Oh Oh Aaah Ah",

                "Thank you sir",

                "Yes sir",

                "It's macabre!",

                "Mmmmh",

                "Right happy to",

                "Sorry",

                "Without further interruption",

                "Boy next door",

                "Deep dark fantasies",

                "Do you like what you see",

                "Dungeon master",

                "Fisting is 300",

                "Fuck you",

                "Fucking cumming",

                "FUCKYOU",

                "Full master",

                "I don't do anal",

                "It's bondage, gay website",

                "It's so fucking deep",

                "Lube it up",

                "Penetration 1",

                "Penetration 2",

                "Penetration 3",

                "Penetration 4",

                "Performance artist",

                "Shut the fuck up boy",

                "Slaves get your ass back here",

                "Spit - YEAAAH",

                "Stick your finger",

                "Suction",

                "Swallow my cum",

                "Take it boy",

                "That turns me on",

                "That's amazing",

                "WOO"};

        int[] soundSrcArr = {R.raw.do_you_like_watching_me, R.raw.on_the_house, R.raw.playing_with_fire, R.raw.rip_ears,
                R.raw.she_gave_me_quite_a_show, R.raw.the_semen_arsonist, R.raw.why_dont_you_get_fucked, R.raw.you_get_mad,
                R.raw.aaaaaaaah, R.raw.another_victim, R.raw.ass_we_can, R.raw.at_least_it_smells_like_it, R.raw.atteeention, R.raw.bet_your_ass, R.raw.big_surprise, R.raw.come_on_college_boy, R.raw.im_taking_that_ass,
                R.raw.ladies_first, R.raw.lash_of_the_spanking, R.raw.like_embarrassing_me, R.raw.oh_my_shoulder, R.raw.one_more_round, R.raw.pull_up_our_pants, R.raw.six_hot_loads, R.raw.spank,
                R.raw.thats_power_son, R.raw.the_other_night, R.raw.the_point_you_wanna_be, R.raw.what_the_hell_are_you_two_doing, R.raw.work_that_tool, R.raw.you_can_go_now, R.raw.you_got_me_mad_now,
                R.raw.you_like_challenges, R.raw.you_like_that, R.raw.you_ripped_my_fucking_pants, R.raw.an_ass_i_wouldnt_mind_fucking, R.raw.i_love_fire, R.raw.it_turns_me_on, R.raw.its_a_loan, R.raw.oh_ho_ho_ganging_up,
                R.raw.so_how_you_feeling, R.raw.two_can_play_it, R.raw.beat_me_1_2_3, R.raw.boss_of_this_gym, R.raw.come_on, R.raw.fuck_you_leather_man, R.raw.go_another_round, R.raw.jabroni_outfit,
                R.raw.knocked_out_some_jabroni, R.raw.lets_give_it_a_go, R.raw.settle_it, R.raw.wrong_door, R.raw.it_gets_bigger_when_i_pull, R.raw.our_daddy_told_us, R.raw.rip_the_skin, R.raw.sorry_for_what,
                R.raw.oh_oh_aaah_ah, R.raw.thank_you_sir, R.raw.yes_sir, R.raw.its_macabre, R.raw.mmmmh, R.raw.right_happy_to, R.raw.sorry, R.raw.without_further_interruption, R.raw.boy_next_door, R.raw.deep_dark_fantasies,
                R.raw.do_you_like_what_you_see, R.raw.dungeon_master, R.raw.fisting_is_300, R.raw.fuck_you, R.raw.fucking_cumming, R.raw.fuckyouu, R.raw.full_master, R.raw.i_dont_do_anal,
                R.raw.its_bondage_gay_website, R.raw.its_so_fucking_deep, R.raw.lube_it_up, R.raw.penetration_1, R.raw.penetration_2, R.raw.penetration_3, R.raw.penetration_4,
                R.raw.performance_artist, R.raw.shut_the_fuck_up_boy, R.raw.slaves_get_your_ass_back_here, R.raw.spityeaahh, R.raw.stick_your_finger, R.raw.suction, R.raw.swallow_my_cum, R.raw.take_it_boy, R.raw.that_turns_me_on, R.raw.thats_amazing, R.raw.woo};

        ArrayList<Word> words = new ArrayList<Word>();

        for (int i = 0; i < phrases.length; i++) {
            if (i < 8) words.add(new Word(phrases[i], soundSrcArr[i], R.drawable.babyface));
            else if (i >= 8 && i <= 34)
                words.add(new Word(phrases[i], soundSrcArr[i], R.drawable.billyh));
            else if (i >= 35 && i <= 38)
                words.add(new Word(phrases[i], soundSrcArr[i], R.drawable.brother));
            else if (i >= 39 && i <= 41)
                words.add(new Word(phrases[i], soundSrcArr[i], R.drawable.kazuya));
            else if (i >= 42 && i <= 51)
                words.add(new Word(phrases[i], soundSrcArr[i], R.drawable.markw));
            else if (i >= 52 && i <= 55)
                words.add(new Word(phrases[i], soundSrcArr[i], R.drawable.ripped));
            else if (i >= 56 && i <= 58)
                words.add(new Word(phrases[i], soundSrcArr[i], R.drawable.slave));
            else if (i >= 59 && i <= 63)
                words.add(new Word(phrases[i], soundSrcArr[i], R.drawable.unripped));
            else words.add(new Word(phrases[i], soundSrcArr[i], R.drawable.vand));
        }

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_numbers);

        mRecyclerView = (RecyclerView) findViewById(R.id.list);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new MyAdapter(this, words);
        mRecyclerView.setAdapter(mAdapter);


    }
}
