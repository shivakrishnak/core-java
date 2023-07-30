@Service
@Slf4j
class EventService {

    public Lock lock = new ReentrantLock();

    public void processEvent(Event event) {
        lock.lock();
        if (event.getType() == EventType.REVIEW_APPROVED) {
            processApproved(event.getId(), event.getPayload());
        } else if (event.getType() == EventType.REVIEW_CREATED) {
            processCreated(event.getId(), event.getPayload());
        } else if (event.getType() == EventType.REVIEW_DELETED) {
            processDeleted(event.getId(), event.getPayload());
        }
        lock.unlock();
    }

    private void processApproved(String id, String payload) {
        throw new Error("Approved event is temporary deprecated!");
    }

    private void processCreated(String id, String payload) {
        log.info("Created: {}, payload: {}", id, payload);
    }

    private void processDeleted(String id, String payload) {
        throw new Error("Deleted event is temporary deprecated!");
    }
} 