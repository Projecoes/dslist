package com.devsuperior.dslist.projections;

public interface GameMinimoProjection {

    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
