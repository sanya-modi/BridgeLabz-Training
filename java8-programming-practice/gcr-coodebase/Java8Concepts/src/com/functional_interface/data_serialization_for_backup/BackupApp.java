package com.functional_interface.data_serialization_for_backup;

public class BackupApp {
	
	public static void main(String[] args) {

        UserData user = new UserData("sanya","sanya@05", 101);
        TempCache cache = new TempCache();

        BackupProcessor.backup(user);
        BackupProcessor.backup(cache);
    }

}
