package com.gamesofeveryone.lovejikisses;

import java.util.ArrayList;
import java.util.List;

public class StickersDataFactory {

    public static List<Sticker> getAllStickerReference() {
        String[] stickerURLRef = {
                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejikisses-0.png?alt=media&token=fb2c006d-bb43-443c-843c-7bb0be72f137",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejikisses-01.png?alt=media&token=8f51e6d6-8866-4855-a6a4-e300afede008",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejikisses-02.png?alt=media&token=1256f048-603c-42c0-9ec3-e814045eafe1",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejikisses-03.png?alt=media&token=9dfeb6d5-5cc9-4c36-ac67-75cd64f531f3",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejikisses-04.png?alt=media&token=bae571a7-942b-457b-8c9f-a3947ff5ab50",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejikisses-05.png?alt=media&token=cbf988a9-7aba-40f9-a84d-4215605de64e",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejikisses-06.png?alt=media&token=8734014d-7d2f-46ad-a743-d6c36810a5f8",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejikisses-07.png?alt=media&token=1c1bd8c4-516b-482d-a227-b3d6c6d04f4b",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejikisses-08.png?alt=media&token=f1fb8e8b-4c7a-4fb6-9928-8d170eb4c936",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejikisses-09.png?alt=media&token=d92b4066-bbdf-4df4-af62-68dad19e5068",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejikisses-10.png?alt=media&token=31933c64-f074-4ed1-9711-73abae935519",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejikisses-11.png?alt=media&token=b9a12da1-9b5a-459b-8306-9ffdfe74c1d9",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejikisses-12.png?alt=media&token=f3ba8631-e4c7-4e82-b00f-581017d59b9f"
        };
        List<Sticker> stickerList = new ArrayList<>();
        for (int i = 0; i < stickerURLRef.length; i++) {
            stickerList.add(new Sticker(stickerURLRef[i]));
        }
        return stickerList;
    }
}