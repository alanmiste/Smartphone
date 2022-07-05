package model;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class FriendTest {

    @org.junit.jupiter.api.Test
    void testToString() {
        //Given
        Friend testFriend = new Friend("123456","Flix");
        //When
        String actual = testFriend.toString();
        //Then
        String expected = "Flix 123456";
        Assertions.assertEquals(expected,actual);
    }
}