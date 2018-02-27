USE [IFRDH]
GO

/****** Object:  Table [dbo].[ColumnFormat]    Script Date: 26/02/2018 8:24:48 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[ColumnFormat](
	[FormatName] [varchar](100) NOT NULL,
	[FormatDescription] [varchar](250) NULL,
	[FormatValue] [varchar](100) NULL,
 CONSTRAINT [PK_COLUMNFORMAT] PRIMARY KEY CLUSTERED 
(
	[FormatName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

