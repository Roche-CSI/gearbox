package com.g2forge.gearbox.command.v1.runner.redirect;

import java.nio.file.Path;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class FileRedirect implements IRedirect {
	protected final boolean append;

	protected final Path path;
}
