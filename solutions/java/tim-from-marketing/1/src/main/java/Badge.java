class Badge {
    public String print(Integer id, String name, String department) {
        String idPrefix = "";
        String departmentPlaceholder = department;
        if (id != null) {
            idPrefix = "[" + id + "] - ";
        }
        if (department == null) {
            departmentPlaceholder = "OWNER";
        }
        return idPrefix + name + " - " +departmentPlaceholder;
    }
}
