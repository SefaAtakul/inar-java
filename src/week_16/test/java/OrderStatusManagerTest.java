package test.java;

import main.java.OrderStatusManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderStatusManagerTest {
    @Test
    public void testNextStateTransitionFromNew() {
        OrderStatusManager manager = new OrderStatusManager();
        assertEquals(OrderStatusManager.OrderState.PENDING, manager.nextState(manager.getCurrentState()), "State should transition from NEW to PENDING");
    }
    @Test
    public void testNextStateTransitionFromPending(){
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.PENDING);
        assertEquals(OrderStatusManager.OrderState.SHIPPED,manager.nextState(manager.getCurrentState()));
    }
    @Test
    public void testNextStateTransitionFromShipped(){
        OrderStatusManager manager =new OrderStatusManager(OrderStatusManager.OrderState.SHIPPED);
        assertEquals(OrderStatusManager.OrderState.DELIVERED,manager.nextState(manager.getCurrentState()));
    }
    @Test
    void noTransitionFromDelivered(){
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.DELIVERED);
        assertEquals(OrderStatusManager.OrderState.DELIVERED, manager.nextState(manager.getCurrentState()));
    }
    @Test
    public void noTransitionFromCancelled(){
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.CANCELLED);
        assertEquals(OrderStatusManager.OrderState.CANCELLED,manager.nextState(manager.getCurrentState()));
    }
    @Test
    public void cancelFromNewState(){
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.NEW);
        assertEquals(OrderStatusManager.OrderState.CANCELLED, manager.cancelOrder(manager.getCurrentState()));
    }
    @Test
    public void cancelFromPendingState(){
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.PENDING);
        assertEquals(OrderStatusManager.OrderState.CANCELLED,manager.cancelOrder(manager.getCurrentState()));
    }
    @Test
    public void noCancellationFromShippedState() {
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.SHIPPED);
        assertEquals(OrderStatusManager.OrderState.SHIPPED, manager.cancelOrder(manager.getCurrentState()),"Already shipped so we can not cancel...");
    }
    @Test
    public void noCancellationFromDeliveredState() {
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.DELIVERED);
        assertEquals(OrderStatusManager.OrderState.DELIVERED, manager.cancelOrder(manager.getCurrentState()),"Already delivered so we can not cancel...");
    }
    @Test
    public void noCancellationFromAlreadyCancelledState() {
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.CANCELLED);
        assertEquals(OrderStatusManager.OrderState.CANCELLED, manager.cancelOrder(manager.getCurrentState()),"Already cancelled..");
    }

    }

