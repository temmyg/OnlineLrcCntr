USE [IFRDH]
GO

/****** Object:  Table [dbo].[Phase2OutputColumn]    Script Date: 26/02/2018 8:24:25 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Phase2OutputColumn](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Phase2ColumnName] [varchar](150) NULL,
	[Phase2TableName] [varchar](150) NULL,
	[DisplayName] [varchar](300) NULL,
	[ExcelFormatName] [varchar](50) NULL,
	[OrderNumberInSheet] [int] NULL,
	[SheetOrdinalNo] [int] NULL,
	[IsOutput] [bit] NULL,
	[CellStyle] [varchar](100) NULL,
 CONSTRAINT [PK_Phase2OutputColumn] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Phase2OutputColumn]  WITH CHECK ADD  CONSTRAINT [FK_Phase2OutputColumn_ColumnFormat] FOREIGN KEY([CellStyle])
REFERENCES [dbo].[ColumnFormat] ([FormatName])
GO

ALTER TABLE [dbo].[Phase2OutputColumn] CHECK CONSTRAINT [FK_Phase2OutputColumn_ColumnFormat]
GO

