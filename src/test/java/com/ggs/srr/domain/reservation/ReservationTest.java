package com.ggs.srr.domain.reservation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReservationTest {

    @DisplayName("예약은 30뷴 단위로 가능하다")
    @Test
    void createReservationUnit30Minute() {
        //given

        //when

        //then
    }

    @DisplayName("예약이 30분 단위가 아닐 경우 예외가 발생한다.")
    @Test
    void not30MinuteUnit() {
        //given

        //when

        //then
    }

    @DisplayName("예약 시간이 2시간이 넘어갈 수 없다.")
    @Test
    void reservationOver2Hour() {
        //given

        //when

        //then
    }

    @DisplayName("기존 예약이 되어 있는 시간대일 경우 예약이 불가능하다.")
    @Test
    void duplicateReservation() {
        //given

        //when

        //then
    }

    @DisplayName("예약은 두시간 전까지 취소 가능하다.")
    @Test
    void cancelReservation() {
        //given

        //when

        //then
    }

    @DisplayName("동시에 예약이 들어올 경우 무조건 한 그룹만 예약된다.")
    @Test
    void reservationAtTheSameTime() {
        //given

        //when

        //then
    }

    @DisplayName("그룹 수가 스터디룸 수용 인원을 넘어갈 경우 예약할 수 없다.")
    @Test
    void test() {
        //given

        //when

        //then
    }

    @DisplayName("스터디룸의 현재 사용 상태를 알 수 있다.")
    @Test
    void getCurrentStudyRoomStatus() {
        //given

        //when

        //then
    }

}