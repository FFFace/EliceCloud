package exception_ex.custom.fileaccess;

class FileAccessDeniedException extends Exception {
	public FileAccessDeniedException(String message) {
		super(message);
	}
}

