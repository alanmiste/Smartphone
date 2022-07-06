package model;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class FriendTest {

    @org.junit.jupiter.api.Test
    void testToString() {
        //Given
        Friend testFriend = new Friend("Flix","123456");
        //When
        String actual = testFriend.toString();
        //Then
        String expected = "Flix, Tel: 123456";
        Assertions.assertEquals(expected,actual);
    }
}