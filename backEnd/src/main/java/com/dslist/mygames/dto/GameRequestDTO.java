package com.dslist.mygames.dto;

import com.dslist.mygames.entities.Game;

public record GameRequestDTO(
        String title,
        Integer year,
        String genre,
        String platforms,
        Double score,
        String imgUrl,
        String shortDescription,
        String longDescription
) {
    public Game toGame() {
        return new Game(
                null,
                this.title,
                this.year,
                this.genre,
                this.platforms,
                this.score,
                this.imgUrl,
                this.shortDescription,
                this.longDescription
        );
    }
}