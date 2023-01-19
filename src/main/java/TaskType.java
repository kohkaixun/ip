public enum TaskType {
    TODO, DEADLINE, EVENT;

    @Override
    public String toString() {
        switch (this) {
            case TODO:
                return "T";
            case DEADLINE:
                return "D";
            case EVENT:
                return "E";
        }
        return "";
    }
}
